package employee.recognation.mvc.render.command;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import employee.recognitions.mvc.constants.EmployeeRecognitionsMvcPortletKeys;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + EmployeeRecognitionsMvcPortletKeys.EMPLOYEERECOGNITIONSMVC,
	        "mvc.command.name=/"
	    },
	    service = MVCRenderCommand.class
	)

public class ViewAppreciationMVCRenderCommand implements MVCRenderCommand {
	
	private static final Log _log =
	        LogFactoryUtil.getLog(ViewAppreciationMVCRenderCommand.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		  _log.info("Inside ViewAppreciationMVCRenderCommand");

	        // Later: fetch appreciation list, leaderboard, pagination
	        renderRequest.setAttribute("message", "Welcome to Employee Recognition");

	        return "/view.jsp";
	}

}
