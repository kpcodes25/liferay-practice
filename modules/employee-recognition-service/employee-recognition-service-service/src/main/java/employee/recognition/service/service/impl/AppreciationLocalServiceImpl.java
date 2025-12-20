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

package employee.recognition.service.service.impl;

import com.liferay.portal.aop.AopService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

import employee.recognition.service.model.Appreciation;
import employee.recognition.service.service.base.AppreciationLocalServiceBaseImpl;

/**
 * @author krupasindhu.pani
 */
@Component(
	property = "model.class.name=employee.recognition.service.model.Appreciation",
	service = AopService.class
)
public class AppreciationLocalServiceImpl
	extends AppreciationLocalServiceBaseImpl {
	
	@Override
	public Appreciation addAppreciation(Appreciation appreciation) {

	    appreciation.setCreateDate(new Date());
	    appreciation.setModifiedDate(new Date());

	    return super.addAppreciation(appreciation);
	}

	@Override
	public Appreciation updateAppreciation(Appreciation appreciation) {

	    appreciation.setModifiedDate(new Date());

	    return super.updateAppreciation(appreciation);
	}

}