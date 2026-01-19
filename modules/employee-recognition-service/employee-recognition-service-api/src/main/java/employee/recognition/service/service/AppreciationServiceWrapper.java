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

package employee.recognition.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppreciationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AppreciationService
 * @generated
 */
public class AppreciationServiceWrapper
	implements AppreciationService, ServiceWrapper<AppreciationService> {

	public AppreciationServiceWrapper() {
		this(null);
	}

	public AppreciationServiceWrapper(AppreciationService appreciationService) {
		_appreciationService = appreciationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _appreciationService.getOSGiServiceIdentifier();
	}

	@Override
	public AppreciationService getWrappedService() {
		return _appreciationService;
	}

	@Override
	public void setWrappedService(AppreciationService appreciationService) {
		_appreciationService = appreciationService;
	}

	private AppreciationService _appreciationService;

}