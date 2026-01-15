package job.schedulers;

import com.liferay.dispatch.executor.BaseDispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutorOutput;
import com.liferay.dispatch.model.DispatchTrigger;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserLocalService;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {
        "dispatch.task.executor.name=Assign Role Scheduled Job",
        "dispatch.task.executor.type=Assign Role Scheduled Job"
    },
    service = DispatchTaskExecutor.class
)
public class JobSchedulers extends BaseDispatchTaskExecutor {

    private static final String ROLE_NAME = "Content Publisher";
    private static final int BATCH_SIZE = 100; // number of users to process per batch

    @Override
    public String getName() {
        return "Assign Role Scheduled Job";
    }

    @Override
    public void doExecute(
            DispatchTrigger dispatchTrigger,
            DispatchTaskExecutorOutput dispatchTaskExecutorOutput) throws Exception {

        // Fetch all companies (supports multi-tenant)
        List<Company> companies = _companyLocalService.getCompanies();

        for (Company company : companies) {
            long companyId = company.getCompanyId();

            // Fetch the role
            Role role = _roleLocalService.getRole(companyId, ROLE_NAME);

            int start = 0;
            List<User> users;

            do {
                // Fetch users in batches
                users = _userLocalService.getUsers(start, start + BATCH_SIZE);

                for (User user : users) {
                    // Assign role only if user doesn't have it
                    if (!_userLocalService.hasRoleUser(role.getRoleId(), user.getUserId())) {
                        _userLocalService.addRoleUser(role.getRoleId(), user.getUserId());
                 
                    }
                }

                start += BATCH_SIZE;
            } while (!users.isEmpty());
        }
    }

    @Reference
    private CompanyLocalService _companyLocalService;

    @Reference
    private UserLocalService _userLocalService;

    @Reference
    private RoleLocalService _roleLocalService;
}
