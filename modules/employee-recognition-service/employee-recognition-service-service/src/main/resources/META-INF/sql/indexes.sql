create index IX_F079AF57 on ER_Appreciation (groupId);
create index IX_C26FB248 on ER_Appreciation (toUserId);
create index IX_DE48F9E7 on ER_Appreciation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_75C4CE29 on ER_Appreciation (uuid_[$COLUMN_LENGTH:75$], groupId);