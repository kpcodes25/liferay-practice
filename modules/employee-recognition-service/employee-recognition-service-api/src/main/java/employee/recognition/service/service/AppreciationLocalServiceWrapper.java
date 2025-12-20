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
 * Provides a wrapper for {@link AppreciationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AppreciationLocalService
 * @generated
 */
public class AppreciationLocalServiceWrapper
	implements AppreciationLocalService,
			   ServiceWrapper<AppreciationLocalService> {

	public AppreciationLocalServiceWrapper() {
		this(null);
	}

	public AppreciationLocalServiceWrapper(
		AppreciationLocalService appreciationLocalService) {

		_appreciationLocalService = appreciationLocalService;
	}

	/**
	 * Adds the appreciation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppreciationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appreciation the appreciation
	 * @return the appreciation that was added
	 */
	@Override
	public employee.recognition.service.model.Appreciation addAppreciation(
		employee.recognition.service.model.Appreciation appreciation) {

		return _appreciationLocalService.addAppreciation(appreciation);
	}

	/**
	 * Creates a new appreciation with the primary key. Does not add the appreciation to the database.
	 *
	 * @param appreciationId the primary key for the new appreciation
	 * @return the new appreciation
	 */
	@Override
	public employee.recognition.service.model.Appreciation createAppreciation(
		long appreciationId) {

		return _appreciationLocalService.createAppreciation(appreciationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appreciationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the appreciation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppreciationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appreciation the appreciation
	 * @return the appreciation that was removed
	 */
	@Override
	public employee.recognition.service.model.Appreciation deleteAppreciation(
		employee.recognition.service.model.Appreciation appreciation) {

		return _appreciationLocalService.deleteAppreciation(appreciation);
	}

	/**
	 * Deletes the appreciation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppreciationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation that was removed
	 * @throws PortalException if a appreciation with the primary key could not be found
	 */
	@Override
	public employee.recognition.service.model.Appreciation deleteAppreciation(
			long appreciationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appreciationLocalService.deleteAppreciation(appreciationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appreciationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _appreciationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _appreciationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _appreciationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _appreciationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>employee.recognition.service.model.impl.AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _appreciationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>employee.recognition.service.model.impl.AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _appreciationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _appreciationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _appreciationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public employee.recognition.service.model.Appreciation fetchAppreciation(
		long appreciationId) {

		return _appreciationLocalService.fetchAppreciation(appreciationId);
	}

	/**
	 * Returns the appreciation matching the UUID and group.
	 *
	 * @param uuid the appreciation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	@Override
	public employee.recognition.service.model.Appreciation
		fetchAppreciationByUuidAndGroupId(String uuid, long groupId) {

		return _appreciationLocalService.fetchAppreciationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _appreciationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the appreciation with the primary key.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation
	 * @throws PortalException if a appreciation with the primary key could not be found
	 */
	@Override
	public employee.recognition.service.model.Appreciation getAppreciation(
			long appreciationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appreciationLocalService.getAppreciation(appreciationId);
	}

	/**
	 * Returns the appreciation matching the UUID and group.
	 *
	 * @param uuid the appreciation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching appreciation
	 * @throws PortalException if a matching appreciation could not be found
	 */
	@Override
	public employee.recognition.service.model.Appreciation
			getAppreciationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appreciationLocalService.getAppreciationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the appreciations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>employee.recognition.service.model.impl.AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @return the range of appreciations
	 */
	@Override
	public java.util.List<employee.recognition.service.model.Appreciation>
		getAppreciations(int start, int end) {

		return _appreciationLocalService.getAppreciations(start, end);
	}

	/**
	 * Returns all the appreciations matching the UUID and company.
	 *
	 * @param uuid the UUID of the appreciations
	 * @param companyId the primary key of the company
	 * @return the matching appreciations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<employee.recognition.service.model.Appreciation>
		getAppreciationsByUuidAndCompanyId(String uuid, long companyId) {

		return _appreciationLocalService.getAppreciationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of appreciations matching the UUID and company.
	 *
	 * @param uuid the UUID of the appreciations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching appreciations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<employee.recognition.service.model.Appreciation>
		getAppreciationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<employee.recognition.service.model.Appreciation>
					orderByComparator) {

		return _appreciationLocalService.getAppreciationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of appreciations.
	 *
	 * @return the number of appreciations
	 */
	@Override
	public int getAppreciationsCount() {
		return _appreciationLocalService.getAppreciationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _appreciationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _appreciationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _appreciationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appreciationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the appreciation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppreciationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appreciation the appreciation
	 * @return the appreciation that was updated
	 */
	@Override
	public employee.recognition.service.model.Appreciation updateAppreciation(
		employee.recognition.service.model.Appreciation appreciation) {

		return _appreciationLocalService.updateAppreciation(appreciation);
	}

	@Override
	public AppreciationLocalService getWrappedService() {
		return _appreciationLocalService;
	}

	@Override
	public void setWrappedService(
		AppreciationLocalService appreciationLocalService) {

		_appreciationLocalService = appreciationLocalService;
	}

	private AppreciationLocalService _appreciationLocalService;

}