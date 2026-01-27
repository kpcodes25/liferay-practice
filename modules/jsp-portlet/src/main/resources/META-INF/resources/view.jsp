<%--
/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
--%>

<%@ include file="/init.jsp" %>

<p>
	<b class="redBackground"><liferay-ui:message key="blade_portlet_jsp_JSPPortlet.caption" /></b>
</p>

<div class="blade-docs">

	<h2 class="global-title-red">Blade CLI & Liferay Workspace Setup</h2>

	<h3>Blade Download</h3>
	<p>
		Download Blade CLI for Windows from:
		<br />
		<a href="https://github.com/liferay/liferay-ide/releases/" target="_blank">
			https://github.com/liferay/liferay-ide/releases/
		</a>
	</p>

	<h3>Blade Commands</h3>

	<ul>
		<li>
			<b>Check Blade version</b>
			<pre>blade version</pre>
		</li>

		<li>
			<b>List available samples and categories</b>
			<pre>blade samples</pre>
		</li>

		<li>
			<b>Create MVC Portlet (JSP-based)</b>
			<pre>blade samples jsp-portlet</pre>
		</li>

		<li>
			<b>List all Blade commands</b>
			<pre>blade help</pre>
		</li>

		<li>
			<b>Get help for samples command</b>
			<pre>blade help samples</pre>
		</li>

		<li>
			<b>Create a new Liferay workspace</b>
			<pre>blade init my-liferay-workspace</pre>
		</li>
	</ul>

	<h3>Gradle Commands</h3>

	<ul>
		<li>
			<b>Deploy all modules from workspace root</b>
			<pre>gradlew deploy</pre>
		</li>

		<li>
			<b>Deploy a specific module from workspace root</b>
			<pre>gradlew :modules:jsp-portlet:deploy</pre>
		</li>
	</ul>

</div>