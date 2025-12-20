package employee.recognation.mvc.resource.command;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import employee.recognitions.mvc.constants.EmployeeRecognitionsMvcPortletKeys;

@Component(immediate = true, property = {
		"javax.portlet.name=" + EmployeeRecognitionsMvcPortletKeys.EMPLOYEERECOGNITIONSMVC,
		"mvc.command.name=/appreciation/fetch" }, service = MVCResourceCommand.class)

public class AppreciationResourceCommand implements MVCResourceCommand {

	private static final Log _log = LogFactoryUtil.getLog(AppreciationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Inside AppreciationResourceCommand");

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("status", "success");
		jsonObject.put("message", "Data fetched successfully");

		try {
			resourceResponse.getWriter().write(jsonObject.toString());
		} catch (Exception e) {
			_log.error(e);
		}

		return false;
	}

}
