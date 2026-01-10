<%@ include file="/init.jsp"%>

<p>
	<b><liferay-ui:message key="employeerecognitionsmvc.caption" /></b>
</p>

<%
	String message = (String) request.getAttribute("message");
%>

<h3><%=message%></h3>

<portlet:actionURL name="appreciation/submit" var="addAppreciationURL" />
<portlet:resourceURL var="fetchURL" id="/appreciation/fetch" />

<aui:form action="<%=addAppreciationURL%>" method="post">
	<aui:input name="toUserId" label="Appreciated User ID" required="true" />
	<aui:input name="message" label="Message" type="textarea"
		required="true" />

	<aui:button type="submit" value="Send Appreciation" />
</aui:form>



<script>
    fetch('<%=fetchURL%>')
        .then(response => response.json())
        .then(data => {
            console.log(data);
            alert(data.message);
        });
</script>