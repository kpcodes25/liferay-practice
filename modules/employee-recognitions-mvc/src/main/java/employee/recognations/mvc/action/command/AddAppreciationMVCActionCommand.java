package employee.recognations.mvc.action.command;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import employee.recognitions.mvc.constants.EmployeeRecognitionsMvcPortletKeys;


@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + EmployeeRecognitionsMvcPortletKeys.EMPLOYEERECOGNITIONSMVC,
	        "mvc.command.name=/appreciation/add"
	    },
	    service = MVCActionCommand.class
	)
public class AddAppreciationMVCActionCommand implements MVCActionCommand {
	
	private static final Log _log =
	        LogFactoryUtil.getLog(AddAppreciationMVCActionCommand.class);


	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		ThemeDisplay themeDisplay =
	            (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

	        long fromUserId = themeDisplay.getUserId();
	        long toUserId = ParamUtil.getLong(actionRequest, "toUserId");
	        String message = ParamUtil.getString(actionRequest, "message");

	        _log.info("Appreciation from " + fromUserId +
	                " to " + toUserId + " message: " + message);

	        // For now we only log (DB logic comes next)
	        return true;
	    }

}
