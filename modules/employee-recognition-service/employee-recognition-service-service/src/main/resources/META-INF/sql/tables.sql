create table ER_Appreciation (
	uuid_ VARCHAR(75) null,
	appreciationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fromUserId LONG,
	toUserId LONG,
	message VARCHAR(75) null
);