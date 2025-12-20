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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import employee.recognition.service.exception.NoSuchAppreciationException;
import employee.recognition.service.model.Appreciation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the appreciation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppreciationUtil
 * @generated
 */
@ProviderType
public interface AppreciationPersistence extends BasePersistence<Appreciation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppreciationUtil} to access the appreciation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the appreciations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching appreciations
	 */
	public java.util.List<Appreciation> findByUuid(String uuid);

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
	public java.util.List<Appreciation> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Appreciation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

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
	public java.util.List<Appreciation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where uuid = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public Appreciation[] findByUuid_PrevAndNext(
			long appreciationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Removes all the appreciations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of appreciations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching appreciations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the appreciation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAppreciationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByUUID_G(String uuid, long groupId)
		throws NoSuchAppreciationException;

	/**
	 * Returns the appreciation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the appreciation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the appreciation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the appreciation that was removed
	 */
	public Appreciation removeByUUID_G(String uuid, long groupId)
		throws NoSuchAppreciationException;

	/**
	 * Returns the number of appreciations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching appreciations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching appreciations
	 */
	public java.util.List<Appreciation> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Appreciation> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Appreciation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

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
	public java.util.List<Appreciation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the first appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the last appreciation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

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
	public Appreciation[] findByUuid_C_PrevAndNext(
			long appreciationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Removes all the appreciations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of appreciations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching appreciations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the appreciations where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @return the matching appreciations
	 */
	public java.util.List<Appreciation> findByToUserId(long toUserId);

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
	public java.util.List<Appreciation> findByToUserId(
		long toUserId, int start, int end);

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
	public java.util.List<Appreciation> findByToUserId(
		long toUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

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
	public java.util.List<Appreciation> findByToUserId(
		long toUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByToUserId_First(
			long toUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the first appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByToUserId_First(
		long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the last appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByToUserId_Last(
			long toUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the last appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByToUserId_Last(
		long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where toUserId = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param toUserId the to user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public Appreciation[] findByToUserId_PrevAndNext(
			long appreciationId, long toUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Removes all the appreciations where toUserId = &#63; from the database.
	 *
	 * @param toUserId the to user ID
	 */
	public void removeByToUserId(long toUserId);

	/**
	 * Returns the number of appreciations where toUserId = &#63;.
	 *
	 * @param toUserId the to user ID
	 * @return the number of matching appreciations
	 */
	public int countByToUserId(long toUserId);

	/**
	 * Returns all the appreciations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching appreciations
	 */
	public java.util.List<Appreciation> findByGroupId(long groupId);

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
	public java.util.List<Appreciation> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Appreciation> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

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
	public java.util.List<Appreciation> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the first appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the last appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation
	 * @throws NoSuchAppreciationException if a matching appreciation could not be found
	 */
	public Appreciation findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Returns the last appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appreciation, or <code>null</code> if a matching appreciation could not be found
	 */
	public Appreciation fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

	/**
	 * Returns the appreciations before and after the current appreciation in the ordered set where groupId = &#63;.
	 *
	 * @param appreciationId the primary key of the current appreciation
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public Appreciation[] findByGroupId_PrevAndNext(
			long appreciationId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
				orderByComparator)
		throws NoSuchAppreciationException;

	/**
	 * Removes all the appreciations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of appreciations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching appreciations
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the appreciation in the entity cache if it is enabled.
	 *
	 * @param appreciation the appreciation
	 */
	public void cacheResult(Appreciation appreciation);

	/**
	 * Caches the appreciations in the entity cache if it is enabled.
	 *
	 * @param appreciations the appreciations
	 */
	public void cacheResult(java.util.List<Appreciation> appreciations);

	/**
	 * Creates a new appreciation with the primary key. Does not add the appreciation to the database.
	 *
	 * @param appreciationId the primary key for the new appreciation
	 * @return the new appreciation
	 */
	public Appreciation create(long appreciationId);

	/**
	 * Removes the appreciation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation that was removed
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public Appreciation remove(long appreciationId)
		throws NoSuchAppreciationException;

	public Appreciation updateImpl(Appreciation appreciation);

	/**
	 * Returns the appreciation with the primary key or throws a <code>NoSuchAppreciationException</code> if it could not be found.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation
	 * @throws NoSuchAppreciationException if a appreciation with the primary key could not be found
	 */
	public Appreciation findByPrimaryKey(long appreciationId)
		throws NoSuchAppreciationException;

	/**
	 * Returns the appreciation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appreciationId the primary key of the appreciation
	 * @return the appreciation, or <code>null</code> if a appreciation with the primary key could not be found
	 */
	public Appreciation fetchByPrimaryKey(long appreciationId);

	/**
	 * Returns all the appreciations.
	 *
	 * @return the appreciations
	 */
	public java.util.List<Appreciation> findAll();

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
	public java.util.List<Appreciation> findAll(int start, int end);

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
	public java.util.List<Appreciation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator);

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
	public java.util.List<Appreciation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appreciation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the appreciations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of appreciations.
	 *
	 * @return the number of appreciations
	 */
	public int countAll();

}