# Liferay Site Initializer - Proof of Concept Documentation

## Overview

This document outlines the proof of concept (POC) for implementing Liferay Site Initializers as Client Extensions. Site Initializers allow automated creation of sites with predefined configurations, including object definitions, documents, layouts, and other site-specific content.

## Project Structure

```
liferay-sample-site-initializer/
├── client-extension.yaml          # Client extension configuration
├── gradle.properties              # Gradle build properties
└── site-initializer/
    ├── documents/
    │   └── group/
    │       └── sample.txt         # Sample document
    └── object-definitions/
        ├── department.json        # Department object definition
        └── employee.json          # Employee object definition
```

## Client Extension Configuration

### client-extension.yaml

```yaml
liferay-sample-site-initializer-v6:
    name: Liferay Sample Site Initializer V6
    oAuthApplicationHeadlessServer: liferay-sample-site-initializer-v6-oahs
    siteExternalReferenceCode: LIFERAY_SAMPLE_V6
    siteName: Liferay Sample V6
    type: siteInitializer
liferay-sample-site-initializer-v6-oahs:
    .serviceAddress: localhost:8080
    .serviceScheme: http
    name: Liferay Sample Site Initializer V6 OAuth Application Headless Server
    scopes:
        - Liferay.Headless.Site.everything
    type: oAuthApplicationHeadlessServer
```

## Object Definitions

### Department Object (department.json)

```json
{
  "label": {
    "en_US": "Department V6"
  },
  "name": "DepartmentV6",
  "objectFields": [
    {
      "businessType": "Text",
      "DBType": "String",
      "indexed": false,
      "indexedAsKeyword": false,
      "label": {
        "en_US": "Department Name"
      },
      "name": "departmentName",
      "required": true
    },
    {
      "businessType": "Text",
      "DBType": "String",
      "indexed": false,
      "indexedAsKeyword": false,
      "label": {
        "en_US": "Location"
      },
      "name": "location",
      "required": false
    }
  ],
  "pluralLabel": {
    "en_US": "Departments V6"
  },
  "scope": "site"
}
```

### Employee Object (employee.json)

```json
{
  "label": {
    "en_US": "Employee V6"
  },
  "name": "EmployeeV6",
  "objectFields": [
    {
      "businessType": "Text",
      "DBType": "String",
      "indexed": false,
      "indexedAsKeyword": false,
      "label": {
        "en_US": "Employee Name"
      },
      "name": "employeeName",
      "required": true
    },
    {
      "businessType": "Text",
      "DBType": "String",
      "indexed": false,
      "indexedAsKeyword": false,
      "label": {
        "en_US": "Email"
      },
      "name": "email",
      "required": false
    },
    {
      "businessType": "Text",
      "DBType": "String",
      "indexed": false,
      "indexedAsKeyword": false,
      "label": {
        "en_US": "Position"
      },
      "name": "position",
      "required": false
    }
  ],
  "pluralLabel": {
    "en_US": "Employees V6"
  },
  "scope": "site"
}
```

## Key Features Implemented

### 1. Object Definition Creation
- **DepartmentV6**: Contains department name and location fields
- **EmployeeV6**: Contains employee name, email, and position fields
- Both objects are site-scoped
- Objects are created automatically when a site is initialized

### 2. Site Initialization
- Automated site creation with predefined name and external reference code
- OAuth2 headless server configuration for API access
- Document import capability

### 3. Build and Deployment

#### Build Commands
```cmd
# Clean build
gradlew client-extensions:liferay-sample-site-initializer:clean

# Build the client extension
gradlew client-extensions:liferay-sample-site-initializer:build

# Deploy to Liferay
gradlew client-extensions:liferay-sample-site-initializer:deploy
```

#### Deployment Output
- Build generates a `.zip` file in the `dist/` folder
- Deployment creates configuration in `build/liferay-client-extension-build/`

## How Site Initializers Work

### 1. Deployment Phase
- Client extension is deployed to Liferay
- Site initializer becomes available as a template
- On first deployment, may auto-create a site

### 2. Site Creation Phase
- Users go to Control Panel → Sites → Add Site
- Select the site initializer template from the dropdown
- Liferay creates the site and executes initialization:
  - Creates object definitions
  - Imports documents
  - Sets up layouts and configurations

### 3. Object Behavior
- Object definitions are created at **system level** (shared across all virtual instances)
- Object entries (data) are **site-scoped**
- Each site created from the initializer gets its own object data

## Important Considerations

### Object Definition Management

**Site Initializers Can:**
- ✅ Create new object definitions
- ✅ Import object entries (data)
- ✅ Set up object relationships (with limitations)

**Site Initializers Cannot:**
- ❌ Update existing object definitions
- ❌ Add fields to existing objects
- ❌ Modify object schemas after creation

**Workaround for Updates:**
- Change the object name (e.g., DepartmentV6 → DepartmentV7)
- Manually update objects via Liferay UI
- Use Liferay's Headless APIs for programmatic updates

### Object Relationships

**Limitation:** Object relationships defined in JSON may not work in all Liferay versions.

**Attempted Configuration:**
```json
"objectRelationships": [
  {
    "deletionType": "prevent",
    "label": {"en_US": "Department"},
    "name": "r_departmentToEmployees",
    "objectDefinitionName1": "Employee",
    "objectDefinitionName2": "Department",
    "type": "oneToMany"
  }
]
```

**Result:** Transformation errors during deployment.

**Solution:** Create relationships manually via Liferay UI after objects are created.

### Exporting Object Definitions

When exporting objects from Liferay UI, the JSON includes system fields and metadata that must be removed:

**Remove These Fields:**
- System fields: `creator`, `createDate`, `id`, `modifiedDate`, `status`
- Metadata: `className`, `objectActions`, `restContextPath`, `portlet`, `active`, etc.
- Field-level: `externalReferenceCode`, `objectFieldSettings`, `readOnly`, `system`, etc.

**Keep Only:**
- `label`, `name`, `objectFields` (custom only), `pluralLabel`, `scope`
- Optional: `externalReferenceCode` (at definition level, make it unique)

## Virtual Instance Deployment

### Custom Elements vs Site Initializers

#### Custom Elements (✅ Working)
Custom elements can be deployed to specific virtual instances using:

```yaml
dxp.lxc.liferay.com.virtualInstanceId: instance1
```

**Result:** Custom element appears only in the specified virtual instance.

**Example from liferay-sample-custom-element-react-dom:**
```yaml
liferay-sample-custom-element-4-instance1:
    friendlyURLMapping: liferay-sample-custom-element-4
    htmlElementName: liferay-sample-custom-element-4
    instanceable: false
    dxp.lxc.liferay.com.virtualInstanceId: instance1
    name: Liferay Sample Custom Element 4
    portletCategoryName: category.client-extensions
    type: customElement
    urls:
        - index.*.js
    useESM: true
```

**Status:** ✅ Successfully deployed to instance1 and visible only in that instance.

#### Site Initializers (❌ Not Working)

**Attempted Approach 1: Using deprecated property**
```yaml
liferay-sample-site-initializer-v6:
    dxp.lxc.liferay.com.virtualInstanceId: instance1
    name: Liferay Sample Site Initializer V6
    type: siteInitializer
```

**Issues:**
- Property is deprecated (Gradle warnings)
- Site initializer deploys to default instance instead of target instance
- Cannot create multiple site initializer entries in same project

**Attempted Approach 2: Using Gradle property**
```properties
# gradle.properties
liferay.virtual.instance.id=instance1
```

**Issues:**
- Only accepts single value (cannot specify multiple instances)
- Build creates instance-specific folder but deployment still goes to default
- Import via UI fails with "invalid format" error

**Attempted Approach 3: Multiple site initializer definitions**
```yaml
liferay-sample-site-initializer-v6-inst1:
    dxp.lxc.liferay.com.virtualInstanceId: instance1
    type: siteInitializer
liferay-sample-site-initializer-v6-inst2:
    dxp.lxc.liferay.com.virtualInstanceId: instance2
    type: siteInitializer
```

**Error:**
```
A client extension project must not contain more than one batch or siteInitializer type client extension
```

**Result:** ❌ Cannot deploy site initializers to specific virtual instances using Web ID.

### Root Cause Analysis

1. **Property Deprecation:** `dxp.lxc.liferay.com.virtualInstanceId` is deprecated and not fully functional for site initializers
2. **Gradle Property Limitation:** `liferay.virtual.instance.id` only accepts single value and doesn't control deployment target
3. **Deployment Mechanism:** Site initializers deploy system-wide via `deploy/` folder, ignoring instance targeting
4. **UI Import Limitation:** Client Extension import feature doesn't support site initializer JSON format
5. **Single Initializer Constraint:** Only one site initializer allowed per client extension project

## Conclusion

### What Works ✅
- Creating site initializers with object definitions
- Automated site creation with predefined configurations
- Object definition import (new objects only)
- Document and content import
- System-wide deployment accessible to all virtual instances
- **Custom element deployment to specific virtual instances using Web ID**

### What Doesn't Work ❌
- **Site initializer deployment to specific virtual instances using Web ID**
- Updating existing object definitions via site initializer
- Object relationship definitions in JSON (version-dependent)
- Multiple site initializer definitions in single project
- Instance-specific deployment via Gradle properties
- UI-based client extension import for site initializers

### Recommendations

1. **For Multi-Instance Deployments:**
   - Deploy site initializer without virtual instance restrictions
   - Make it available to all instances
   - Users in each instance manually create sites using the template

2. **For Instance-Specific Requirements:**
   - Create separate client extension projects per virtual instance
   - Each project with unique name and configuration
   - Deploy each project separately

3. **For Object Management:**
   - Use site initializers only for initial object creation
   - Manage object updates manually via Liferay UI
   - Use Headless APIs for programmatic object modifications

4. **For Custom Elements:**
   - Continue using `dxp.lxc.liferay.com.virtualInstanceId` property
   - Works reliably for custom element deployment to specific instances

### Known Limitation

**Site Initializers cannot be deployed to specific virtual instances using Web ID (dxp.lxc.liferay.com.virtualInstanceId) in the current Liferay version, unlike Custom Elements which support this feature successfully.**

---

**Document Version:** 1.0  
**Date:** February 9, 2026  
**Liferay Version:** DXP 2025.Q1.1 LTS
