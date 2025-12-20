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

package employee.recognition.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import employee.recognition.service.model.Appreciation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the appreciation service. This utility wraps <code>employee.recognition.service.service.persistence.impl.AppreciationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppreciationPersistence
 * @generated
 */
public class AppreciationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Appreciation appreciation) {
		getPersistence().clearCache(appreciation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Appreciation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Appreciation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Appreciation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Appreciation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Appreciation update(Appreciation appreciation) {
		return getPersistence().update(appreciation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Appreciation update(
		Appreciation appreciation, ServiceContext serviceContext) {

		return getPersistence().update(appreciation, serviceContext);
	}

	/**
	 * Returns all the appreciations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching appreciations
	 */
	public static List<Appreciation> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the appreciations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @return the range of matching appreciations
	 */
	public static List<Appreciation> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the appreciations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appreciations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Appreciation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByUuid_First(
			String uuid, OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByUuid_First(
		String uuid, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByUuid_Last(
			String uuid, OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByUuid_Last(
		String uuid, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public static Appreciation[] findByUuid_PrevAndNext(
			long appreciationId, String uuid,
			OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUuid_PrevAndNext(
			appreciationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the appreciations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of appreciations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching appreciations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the appreciation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAppreciationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByUUID_G(String uuid, long groupId)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the appreciation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the appreciation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the appreciation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the appreciation that was removed
	 */
	public static Appreciation removeByUUID_G(String uuid, long groupId)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of appreciations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching appreciations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching appreciations
	 */
	public static List<Appreciation> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @return the range of matching appreciations
	 */
	public static List<Appreciation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public static Appreciation[] findByUuid_C_PrevAndNext(
			long appreciationId, String uuid, long companyId,
			OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			appreciationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the appreciations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching appreciations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the appreciations where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @return the matching appreciations
	 */
	public static List<Appreciation> findByToUserId(long toUserId) {
		return getPersistence().findByToUserId(toUserId);
	}

	/**
	 * Returns a range of all the appreciations where toUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param toUserId the to user ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @return the range of matching appreciations
	 */
	public static List<Appreciation> findByToUserId(
		long toUserId, int start, int end) {

		return getPersistence().findByToUserId(toUserId, start, end);
	}

	/**
	 * Returns an ordered range of all the appreciations where toUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param toUserId the to user ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByToUserId(
		long toUserId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().findByToUserId(
			toUserId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appreciations where toUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param toUserId the to user ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByToUserId(
		long toUserId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByToUserId(
			toUserId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByToUserId_First(
			long toUserId, OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByToUserId_First(
			toUserId, orderByComparator);
	}

	/**
	 * Returns the first appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByToUserId_First(
		long toUserId, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByToUserId_First(
			toUserId, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByToUserId_Last(
			long toUserId, OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByToUserId_Last(
			toUserId, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByToUserId_Last(
		long toUserId, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByToUserId_Last(
			toUserId, orderByComparator);
	}

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public static Appreciation[] findByToUserId_PrevAndNext(
			long appreciationId, long toUserId,
			OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByToUserId_PrevAndNext(
			appreciationId, toUserId, orderByComparator);
	}

	/**
	 * Removes all the appreciations where toUserId = &#63; from the database.
	 *
	 * @param toUserId the to user ID
	 */
	public static void removeByToUserId(long toUserId) {
		getPersistence().removeByToUserId(toUserId);
	}

	/**
	 * Returns the number of appreciations where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @return the number of matching appreciations
	 */
	public static int countByToUserId(long toUserId) {
		return getPersistence().countByToUserId(toUserId);
	}

	/**
	 * Returns all the appreciations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching appreciations
	 */
	public static List<Appreciation> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the appreciations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @return the range of matching appreciations
	 */
	public static List<Appreciation> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the appreciations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appreciations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appreciations
	 */
	public static List<Appreciation> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Appreciation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByGroupId_First(
			long groupId, OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByGroupId_First(
		long groupId, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public static Appreciation findByGroupId_Last(
			long groupId, OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public static Appreciation fetchByGroupId_Last(
		long groupId, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public static Appreciation[] findByGroupId_PrevAndNext(
			long appreciationId, long groupId,
			OrderByComparator<Appreciation> orderByComparator)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByGroupId_PrevAndNext(
			appreciationId, groupId, orderByComparator);
	}

	/**
	 * Removes all the appreciations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of appreciations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching appreciations
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the appreciation in the entity cache if it is enabled.
	 *
	 * @param appreciation the appreciation
	 */
	public static void cacheResult(Appreciation appreciation) {
		getPersistence().cacheResult(appreciation);
	}

	/**
	 * Caches the appreciations in the entity cache if it is enabled.
	 *
	 * @param appreciations the appreciations
	 */
	public static void cacheResult(List<Appreciation> appreciations) {
		getPersistence().cacheResult(appreciations);
	}

	/**
	 * Creates a new appreciation with the primary key. Does not add the appreciation to the database.
	 *
	 * @param appreciationId the primary key for the new appreciation
	 * @return the new appreciation
	 */
	public static Appreciation create(long appreciationId) {
		return getPersistence().create(appreciationId);
	}

	/**
	 * Removes the appreciation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation that was removed
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public static Appreciation remove(long appreciationId)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().remove(appreciationId);
	}

	public static Appreciation updateImpl(Appreciation appreciation) {
		return getPersistence().updateImpl(appreciation);
	}

	/**
	 * Returns the appreciation with the primary key or throws a <code>NoSuchAppreciationException</code> if it could not be found.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public static Appreciation findByPrimaryKey(long appreciationId)
		throws employee.recognition.service.exception.
			NoSuchAppreciationException {

		return getPersistence().findByPrimaryKey(appreciationId);
	}

	/**
	 * Returns the appreciation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation, or <code>null</code> if a appreciation with the primary key could not be found
	 */
	public static Appreciation fetchByPrimaryKey(long appreciationId) {
		return getPersistence().fetchByPrimaryKey(appreciationId);
	}

	/**
	 * Returns all the appreciations.
	 *
	 * @return the appreciations
	 */
	public static List<Appreciation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the appreciations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @return the range of appreciations
	 */
	public static List<Appreciation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the appreciations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of appreciations
	 */
	public static List<Appreciation> findAll(
		int start, int end, OrderByComparator<Appreciation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appreciations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppreciationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appreciations
	 * @param end the upper bound of the range of appreciations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of appreciations
	 */
	public static List<Appreciation> findAll(
		int start, int end, OrderByComparator<Appreciation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the appreciations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of appreciations.
	 *
	 * @return the number of appreciations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AppreciationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AppreciationPersistence _persistence;

}