/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package employee.recognition.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import employee.recognition.service.model.Appreciation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Appreciation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AppreciationCacheModel
	implements CacheModel<Appreciation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AppreciationCacheModel)) {
			return false;
		}

		AppreciationCacheModel appreciationCacheModel =
			(AppreciationCacheModel)object;

		if (appreciationId == appreciationCacheModel.appreciationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, appreciationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", appreciationId=");
		sb.append(appreciationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", fromUserId=");
		sb.append(fromUserId);
		sb.append(", toUserId=");
		sb.append(toUserId);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Appreciation toEntityModel() {
		AppreciationImpl appreciationImpl = new AppreciationImpl();

		if (uuid == null) {
			appreciationImpl.setUuid("");
		}
		else {
			appreciationImpl.setUuid(uuid);
		}

		appreciationImpl.setAppreciationId(appreciationId);
		appreciationImpl.setGroupId(groupId);
		appreciationImpl.setCompanyId(companyId);
		appreciationImpl.setUserId(userId);

		if (userName == null) {
			appreciationImpl.setUserName("");
		}
		else {
			appreciationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			appreciationImpl.setCreateDate(null);
		}
		else {
			appreciationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			appreciationImpl.setModifiedDate(null);
		}
		else {
			appreciationImpl.setModifiedDate(new Date(modifiedDate));
		}

		appreciationImpl.setFromUserId(fromUserId);
		appreciationImpl.setToUserId(toUserId);

		if (message == null) {
			appreciationImpl.setMessage("");
		}
		else {
			appreciationImpl.setMessage(message);
		}

		appreciationImpl.resetOriginalValues();

		return appreciationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		appreciationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		fromUserId = objectInput.readLong();

		toUserId = objectInput.readLong();
		message = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(appreciationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(fromUserId);

		objectOutput.writeLong(toUserId);

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}
	}

	public String uuid;
	public long appreciationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long fromUserId;
	public long toUserId;
	public String message;

}