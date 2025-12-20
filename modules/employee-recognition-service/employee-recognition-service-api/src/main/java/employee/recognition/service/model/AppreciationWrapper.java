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

package employee.recognition.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Appreciation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Appreciation
 * @generated
 */
public class AppreciationWrapper
	extends BaseModelWrapper<Appreciation>
	implements Appreciation, ModelWrapper<Appreciation> {

	public AppreciationWrapper(Appreciation appreciation) {
		super(appreciation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("appreciationId", getAppreciationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fromUserId", getFromUserId());
		attributes.put("toUserId", getToUserId());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long appreciationId = (Long)attributes.get("appreciationId");

		if (appreciationId != null) {
			setAppreciationId(appreciationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long fromUserId = (Long)attributes.get("fromUserId");

		if (fromUserId != null) {
			setFromUserId(fromUserId);
		}

		Long toUserId = (Long)attributes.get("toUserId");

		if (toUserId != null) {
			setToUserId(toUserId);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public Appreciation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the appreciation ID of this appreciation.
	 *
	 * @return the appreciation ID of this appreciation
	 */
	@Override
	public long getAppreciationId() {
		return model.getAppreciationId();
	}

	/**
	 * Returns the company ID of this appreciation.
	 *
	 * @return the company ID of this appreciation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this appreciation.
	 *
	 * @return the create date of this appreciation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the from user ID of this appreciation.
	 *
	 * @return the from user ID of this appreciation
	 */
	@Override
	public long getFromUserId() {
		return model.getFromUserId();
	}

	/**
	 * Returns the from user uuid of this appreciation.
	 *
	 * @return the from user uuid of this appreciation
	 */
	@Override
	public String getFromUserUuid() {
		return model.getFromUserUuid();
	}

	/**
	 * Returns the group ID of this appreciation.
	 *
	 * @return the group ID of this appreciation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the message of this appreciation.
	 *
	 * @return the message of this appreciation
	 */
	@Override
	public String getMessage() {
		return model.getMessage();
	}

	/**
	 * Returns the modified date of this appreciation.
	 *
	 * @return the modified date of this appreciation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this appreciation.
	 *
	 * @return the primary key of this appreciation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the to user ID of this appreciation.
	 *
	 * @return the to user ID of this appreciation
	 */
	@Override
	public long getToUserId() {
		return model.getToUserId();
	}

	/**
	 * Returns the to user uuid of this appreciation.
	 *
	 * @return the to user uuid of this appreciation
	 */
	@Override
	public String getToUserUuid() {
		return model.getToUserUuid();
	}

	/**
	 * Returns the user ID of this appreciation.
	 *
	 * @return the user ID of this appreciation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this appreciation.
	 *
	 * @return the user name of this appreciation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this appreciation.
	 *
	 * @return the user uuid of this appreciation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this appreciation.
	 *
	 * @return the uuid of this appreciation
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the appreciation ID of this appreciation.
	 *
	 * @param appreciationId the appreciation ID of this appreciation
	 */
	@Override
	public void setAppreciationId(long appreciationId) {
		model.setAppreciationId(appreciationId);
	}

	/**
	 * Sets the company ID of this appreciation.
	 *
	 * @param companyId the company ID of this appreciation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this appreciation.
	 *
	 * @param createDate the create date of this appreciation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the from user ID of this appreciation.
	 *
	 * @param fromUserId the from user ID of this appreciation
	 */
	@Override
	public void setFromUserId(long fromUserId) {
		model.setFromUserId(fromUserId);
	}

	/**
	 * Sets the from user uuid of this appreciation.
	 *
	 * @param fromUserUuid the from user uuid of this appreciation
	 */
	@Override
	public void setFromUserUuid(String fromUserUuid) {
		model.setFromUserUuid(fromUserUuid);
	}

	/**
	 * Sets the group ID of this appreciation.
	 *
	 * @param groupId the group ID of this appreciation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the message of this appreciation.
	 *
	 * @param message the message of this appreciation
	 */
	@Override
	public void setMessage(String message) {
		model.setMessage(message);
	}

	/**
	 * Sets the modified date of this appreciation.
	 *
	 * @param modifiedDate the modified date of this appreciation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this appreciation.
	 *
	 * @param primaryKey the primary key of this appreciation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the to user ID of this appreciation.
	 *
	 * @param toUserId the to user ID of this appreciation
	 */
	@Override
	public void setToUserId(long toUserId) {
		model.setToUserId(toUserId);
	}

	/**
	 * Sets the to user uuid of this appreciation.
	 *
	 * @param toUserUuid the to user uuid of this appreciation
	 */
	@Override
	public void setToUserUuid(String toUserUuid) {
		model.setToUserUuid(toUserUuid);
	}

	/**
	 * Sets the user ID of this appreciation.
	 *
	 * @param userId the user ID of this appreciation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this appreciation.
	 *
	 * @param userName the user name of this appreciation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this appreciation.
	 *
	 * @param userUuid the user uuid of this appreciation
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this appreciation.
	 *
	 * @param uuid the uuid of this appreciation
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AppreciationWrapper wrap(Appreciation appreciation) {
		return new AppreciationWrapper(appreciation);
	}

}