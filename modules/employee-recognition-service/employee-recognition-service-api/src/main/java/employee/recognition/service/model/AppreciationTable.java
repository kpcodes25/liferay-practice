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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ER_Appreciation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Appreciation
 * @generated
 */
public class AppreciationTable extends BaseTable<AppreciationTable> {

	public static final AppreciationTable INSTANCE = new AppreciationTable();

	public final Column<AppreciationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Long> appreciationId = createColumn(
		"appreciationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AppreciationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Long> fromUserId = createColumn(
		"fromUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, Long> toUserId = createColumn(
		"toUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppreciationTable, String> message = createColumn(
		"message", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AppreciationTable() {
		super("ER_Appreciation", AppreciationTable::new);
	}

}