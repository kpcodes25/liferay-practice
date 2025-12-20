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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import employee.recognition.service.model.Appreciation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Appreciation. This utility wraps
 * <code>employee.recognition.service.service.impl.AppreciationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AppreciationLocalService
 * @generated
 */
public class AppreciationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>employee.recognition.service.service.impl.AppreciationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static Appreciation addAppreciation(Appreciation appreciation) {
		return getService().addAppreciation(appreciation);
	}

	/**
	 * Creates a new appreciation with the primary key. Does not add the appreciation to the database.
	 *
	 * @param appreciationId the primary key for the new appreciation
	 * @return the new appreciation
	 */
	public static Appreciation createAppreciation(long appreciationId) {
		return getService().createAppreciation(appreciationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static Appreciation deleteAppreciation(Appreciation appreciation) {
		return getService().deleteAppreciation(appreciation);
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
	public static Appreciation deleteAppreciation(long appreciationId)
		throws PortalException {

		return getService().deleteAppreciation(appreciationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Appreciation fetchAppreciation(long appreciationId) {
		return getService().fetchAppreciation(appreciationId);
	}

	/**
	 * Returns the appreciation matching the UUID and group.
	 *
	 * @param uuid the appreciation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchAppreciationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAppreciationByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the appreciation with the primary key.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation
	 * @throws PortalException if a appreciation with the primary key could not be found
	 */
	public static Appreciation getAppreciation(long appreciationId)
		throws PortalException {

		return getService().getAppreciation(appreciationId);
	}

	/**
	 * Returns the appreciation matching the UUID and group.
	 *
	 * @param uuid the appreciation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching appreciation
	 * @throws PortalException if a matching appreciation could not be found
	 */
	public static Appreciation getAppreciationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAppreciationByUuidAndGroupId(uuid, groupId);
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
	public static List<Appreciation> getAppreciations(int start, int end) {
		return getService().getAppreciations(start, end);
	}

	/**
	 * Returns all the appreciations matching the UUID and company.
	 *
	 * @param uuid the UUID of the appreciations
	 * @param companyId the primary key of the company
	 * @return the matching appreciations, or an empty list if no matches were found
	 */
	public static List<Appreciation> getAppreciationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getAppreciationsByUuidAndCompanyId(uuid, companyId);
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
	public static List<Appreciation> getAppreciationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator) {

		return getService().getAppreciationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of appreciations.
	 *
	 * @return the number of appreciations
	 */
	public static int getAppreciationsCount() {
		return getService().getAppreciationsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static Appreciation updateAppreciation(Appreciation appreciation) {
		return getService().updateAppreciation(appreciation);
	}

	public static AppreciationLocalService getService() {
		return _service;
	}

	private static volatile AppreciationLocalService _service;

}