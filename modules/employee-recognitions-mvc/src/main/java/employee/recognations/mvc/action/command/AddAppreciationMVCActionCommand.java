package employee.recognations.mvc.action.command;

import com.liferay.counter.kernel.service.CounterLocalService;
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
import org.osgi.service.component.annotations.Reference;

import employee.recognition.service.model.Appreciation;
import employee.recognition.service.service.AppreciationLocalService;
import employee.recognitions.mvc.constants.EmployeeRecognitionsMvcPortletKeys;

@Component(immediate = true, property = {
		"javax.portlet.name=" + EmployeeRecognitionsMvcPortletKeys.EMPLOYEERECOGNITIONSMVC,
		"mvc.command.name=/appreciation/add" }, service = MVCActionCommand.class)
public class AddAppreciationMVCActionCommand implements MVCActionCommand {

	private static final Log _log = LogFactoryUtil.getLog(AddAppreciationMVCActionCommand.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long fromUserId = themeDisplay.getUserId();
		long toUserId = ParamUtil.getLong(actionRequest, "toUserId");
		String message = ParamUtil.getString(actionRequest, "message");
		
		_log.info("AddAppreciationMVCActionCommand >>> processAction ");
		_log.info("Appreciation from " + fromUserId + " to " + toUserId + " message: " + message);
		_log.info("themeDisplay.getCompanyId() " + themeDisplay.getCompanyId() + " themeDisplay.getScopeGroupId() " + themeDisplay.getScopeGroupId() );


		
		try {
            Appreciation appreciation =
            		appreciationLocalService.createAppreciation(
            				counterLocalService.increment());

            appreciation.setGroupId(themeDisplay.getScopeGroupId());
            appreciation.setCompanyId(themeDisplay.getCompanyId());
            appreciation.setUserId(fromUserId);
            appreciation.setFromUserId(fromUserId);
            appreciation.setToUserId(toUserId);
            appreciation.setMessage(message);

            appreciationLocalService.addAppreciation(appreciation);

            _log.info("Appreciation saved successfully");

        } catch (Exception e) {
            _log.error("Error while saving appreciation", e);
            throw new PortletException(e);
        }


		// For now we only log (DB logic comes next)
		return true;
	}

	@Reference
	private AppreciationLocalService appreciationLocalService;

	@Reference
	private CounterLocalService counterLocalService;	

	
}


