package liferay.configuration.api;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;


import aQute.bnd.annotation.metatype.Meta;
@ExtendedObjectClassDefinition(category = "dafz-api-configurations", scope = ExtendedObjectClassDefinition.Scope.COMPANY, strictScope = true)
@Meta.OCD(id = "liferay.configuration.api.OTPMailConfiguration", localization = "content/Language", name = "OTP Mail Configuration")

public interface OTPMailConfiguration {

	@Meta.AD(
    		deflt = "Welcome",
    		name="Email Title", 
    		description="",
    		required = false
    )
    public String emailTitle();
    
    @Meta.AD(
    		deflt = "OTP",
    		name="Email Body", 
    		description="",
    		required = false
    )
    public String emailBody();
    
    @Meta.AD(
    		deflt = "abcde",
    		name="Email Disclaimer", 
    		description="",
    		required = false
    )
    public String emailDisclaimer();
}
