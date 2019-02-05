------------------------------------------------------------------------------------------------------------

--  update SEC_USER
--  set PASSWORD='e761c1285eb7002e9e058caacc29ece57cb8bfc5'
--  where ID='60885987-1b61-4247-94c7-dff348347f93';
--
------------------------------------------------------------------------------------------------------------

insert into SYS_FILE
(NAME, EXT, FILE_SIZE, CREATE_DATE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('platform-logo.png', 'png', 15816, '2015-04-01 00:00:00', 1, current_timestamp, null, null, null, '61a6a1ee-f13a-f44f-0201-c2f9b3288305', current_timestamp, 'admin');

insert into SYS_FILE
(NAME, EXT, FILE_SIZE, CREATE_DATE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('customer-standard.svg', 'svg', 5979, '2017-07-19 00:00:00', 1, current_timestamp, null, null, null, 'efc56835-5f5c-6614-bf74-e26e48e2ac5f', current_timestamp, 'admin');

insert into SYS_FILE
(NAME, EXT, FILE_SIZE, CREATE_DATE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('cuba-logo.png', 'png', 6010, '2017-07-19 00:00:00', 1, current_timestamp, null, null, null, 'a2ba9e37-9f05-3ee3-4041-e838d505415c', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Dora', 'Abrams', 47, true, 20, 1, current_timestamp, null, null, null, '4d750fdb-8ed7-a4e4-88d2-40974615cab2', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Peter', 'Blakesly', 28, true, 30, 1, current_timestamp, null, null, null, 'cf8022a3-5b70-520a-d426-aa4614210f0e', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Martin', 'Briggs', 23, false, 30, 1, current_timestamp, null, null, null, 'e7e127d7-33b4-2bd9-d405-0f7923a8bec6', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Philipp', 'Brown', 30, true, 30, 1, current_timestamp, null, null, null, '48eda61c-4142-0e47-5ca8-f338c36cfb0e', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('John', 'Doe', 39, false, 30, 1, current_timestamp, null, null, null, '0c3be785-1125-b755-7e79-3cc136cc1b13', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Daniel', 'Evans', 18, true, 10, 1, current_timestamp, null, null, null, '71ffb579-1b01-614a-0aea-5897c8c3bb91', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('John', 'Frost', 50, false, 20, 1, current_timestamp, null, null, null, '6f218a4d-5ea9-dbf1-b958-c947130a714d', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Edward', 'Harris', 27, true, 30, 1, current_timestamp, null, null, null, '38144502-b2fe-45ab-c183-116aead24aca', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('George', 'Hughes', 90, true, 30, 1, current_timestamp, null, null, null, '8f806608-208b-9deb-138b-9c1dce60d663', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Andy', 'Lewis', 35, false, 30, 1, current_timestamp, null, null, null, '2d59c523-2dc8-7f80-8726-b7fa8caf1c29', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('George', 'Moore', 41, true, 10, 1, current_timestamp, null, null, null, '3fbd8a37-fb90-d5f0-e03e-ae53e41b9fed', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Claire', 'Morgan', 25, true, 10, 1, current_timestamp, null, null, null, '9d9f028c-eade-eee2-d4d8-e97ebb969c54', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Katherine', 'Potter', 34, true, 20, 1, current_timestamp, null, null, null, '068ff1ae-992e-51db-b20f-8e21bcd19bfc', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('John', 'Smith', 32, true, 30, 1, current_timestamp, null, null, null, 'ee875696-0a4d-0d54-41c8-b3dea6e3e7d1', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Michael', 'Taylor', 75, false, 10, 1, current_timestamp, null, null, null, '94d50ae5-1830-174b-81d3-069f221eed3a', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('Joan', 'Thompson', 20, true, 30, 1, current_timestamp, null, null, null, 'b6b31099-d194-fb3e-dd51-89d085dcc11c', current_timestamp, 'admin', 'efc56835-5f5c-6614-bf74-e26e48e2ac5f');

insert into SAMPLER_CUSTOMER
(NAME, LAST_NAME, AGE, ACTIVE, GRADE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY, AVATAR_ID)
values ('James', 'White', 56, true, 20, 1, current_timestamp, null, null, null, '6e3008dd-1eb8-1faf-788d-b6df97130e8d', current_timestamp, 'admin', 'a2ba9e37-9f05-3ee3-4041-e838d505415c');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('TV set', 24999.00, 1, current_timestamp, null, null, null, '17bc9b95-b562-0dd2-f904-db6df80b9c71', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Keyboard', 499.00, 1, current_timestamp, null, null, null, '2ab4dece-2f67-69cd-0a76-fe1cd33537f6', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Earphones', 2000.00, 1, current_timestamp, null, null, null, '3d829eba-cdb0-0446-49d4-9c13b1fe8269', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Telephone', 17999.00, 1, current_timestamp, null, null, null, 'd10674cf-a918-b74f-5eeb-c100631320fd', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Laptop', 52000.00, 1, current_timestamp, null, null, null, 'd7496b01-215d-f90c-7442-4d7e8c47848f', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Blue-Ray', 7000.00, 1, current_timestamp, null, null, null, 'd92e7b2b-f1ea-511a-dda0-abf4e8fd7726', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Microphone', 4999.00, 1, current_timestamp, null, null, null, 'd956ed3c-f7ab-687b-382d-0733db863b5c', current_timestamp, 'admin');

insert into SAMPLER_PRODUCT
(NAME, PRICE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('DVD', 1000.00, 1, current_timestamp, null, null, null, 'dab66821-e3b0-b6a8-eae1-e0b3f0e71d4f', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_TASK
(NAME, DUE_DATE, ASSIGNEE_ID, PARENT_TASK_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Task1', '2015-03-30 00:00:00', '48eda61c-4142-0e47-5ca8-f338c36cfb0e', null, 1, current_timestamp, null, null, null, '10685e09-25c8-b3fe-22ba-238304d292b3', current_timestamp, 'admin');

insert into SAMPLER_TASK
(NAME, DUE_DATE, ASSIGNEE_ID, PARENT_TASK_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Task2', '2015-03-02 00:00:00', '068ff1ae-992e-51db-b20f-8e21bcd19bfc', null, 1, current_timestamp, null, null, null, '9b62fc2f-bf83-2a24-d392-0a332e472a01', current_timestamp, 'admin');

insert into SAMPLER_TASK
(NAME, DUE_DATE, ASSIGNEE_ID, PARENT_TASK_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Task3', '2015-03-16 00:00:00', '9d9f028c-eade-eee2-d4d8-e97ebb969c54', '10685e09-25c8-b3fe-22ba-238304d292b3', 1, current_timestamp, null, null, null, '489706de-c25f-c24d-8222-2d9b79189bc8', current_timestamp, 'admin');

insert into SAMPLER_TASK
(NAME, DUE_DATE, ASSIGNEE_ID, PARENT_TASK_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Task4', '2015-03-31 00:00:00', 'b6b31099-d194-fb3e-dd51-89d085dcc11c', '489706de-c25f-c24d-8222-2d9b79189bc8', 1, current_timestamp, null, null, null, 'aa591e3a-7d2b-874d-51c0-3620030c2d64', current_timestamp, 'admin');

insert into SAMPLER_TASK
(NAME, DUE_DATE, ASSIGNEE_ID, PARENT_TASK_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Task5', '2015-04-02 00:00:00', 'ee875696-0a4d-0d54-41c8-b3dea6e3e7d1', '9b62fc2f-bf83-2a24-d392-0a332e472a01', 1, current_timestamp, null, null, null, '4572c65a-3f1e-30a6-b038-bc86ff26cfc9', current_timestamp, 'admin');

insert into SAMPLER_TASK
(NAME, DUE_DATE, ASSIGNEE_ID, PARENT_TASK_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Task6', '2015-04-01 00:00:00', 'e7e127d7-33b4-2bd9-d405-0f7923a8bec6', null, 1, current_timestamp, null, null, null, '2373294a-f53c-ea74-2c24-c80725b7ba85', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_ORDER
(CUSTOMER_ID, DATE_, AMOUNT, DESCRIPTION, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('068ff1ae-992e-51db-b20f-8e21bcd19bfc', '2015-03-01', 24990.00, 'Office equipment', 1, current_timestamp, null, null, null, '23872068-ec86-ba3e-8d9b-a06d4c573aef', current_timestamp, 'admin');

insert into SAMPLER_ORDER
(CUSTOMER_ID, DATE_, AMOUNT, DESCRIPTION, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('0c3be785-1125-b755-7e79-3cc136cc1b13', '2015-02-11', 31999.00, 'Home theater', 1, current_timestamp, null, null, null, '3fbc4ce8-7f8c-dcd0-5788-967f94f6ddbf', current_timestamp, 'admin');

insert into SAMPLER_ORDER
(CUSTOMER_ID, DATE_, AMOUNT, DESCRIPTION, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('71ffb579-1b01-614a-0aea-5897c8c3bb91', '2015-03-30', 30998.00, 'Karaoke', 1, current_timestamp, null, null, null, 'a2ec9471-7e22-56ea-4601-e1d3ae9f24c9', current_timestamp, 'admin');

insert into SAMPLER_ORDER
(CUSTOMER_ID, DATE_, AMOUNT, DESCRIPTION, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('ee875696-0a4d-0d54-41c8-b3dea6e3e7d1', '2015-03-26', 59999.00, 'Gamer equipment', 1, current_timestamp, null, null, null, 'bbb4351b-d605-40c6-55da-d785c7f32e03', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('d7496b01-215d-f90c-7442-4d7e8c47848f', 1.000, 'bbb4351b-d605-40c6-55da-d785c7f32e03', 1, current_timestamp, null, null, null, '08f26f09-4e6c-125a-12a0-0a8877a57ab2', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('d956ed3c-f7ab-687b-382d-0733db863b5c', 1.000, 'bbb4351b-d605-40c6-55da-d785c7f32e03', 1, current_timestamp, null, null, null, '1e52c338-7e02-058c-fc08-1e00ad56ebf0', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2ab4dece-2f67-69cd-0a76-fe1cd33537f6', 10.000, '23872068-ec86-ba3e-8d9b-a06d4c573aef', 1, current_timestamp, null, null, null, '3031898a-c8b9-f95a-8977-e97be9a4a8a8', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('d92e7b2b-f1ea-511a-dda0-abf4e8fd7726', 1.000, '3fbc4ce8-7f8c-dcd0-5788-967f94f6ddbf', 1, current_timestamp, null, null, null, '3b5adca3-e01b-2bb0-36be-072165779a30', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('3d829eba-cdb0-0446-49d4-9c13b1fe8269', 1.000, 'bbb4351b-d605-40c6-55da-d785c7f32e03', 1, current_timestamp, null, null, null, '4695cbce-87f4-d034-efde-03c41489d601', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('17bc9b95-b562-0dd2-f904-db6df80b9c71', 1.000, 'a2ec9471-7e22-56ea-4601-e1d3ae9f24c9', 1, current_timestamp, null, null, null, '5eb13363-3fc8-6f79-60a7-be0aa0fe998b', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('d956ed3c-f7ab-687b-382d-0733db863b5c', 1.000, 'a2ec9471-7e22-56ea-4601-e1d3ae9f24c9', 1, current_timestamp, null, null, null, '6d654cd6-dc7a-755d-17a0-bec92b0706b3', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('3d829eba-cdb0-0446-49d4-9c13b1fe8269', 10.000, '23872068-ec86-ba3e-8d9b-a06d4c573aef', 1, current_timestamp, null, null, null, '727cbc21-8b5d-3d49-4daf-86d664f0a737', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('dab66821-e3b0-b6a8-eae1-e0b3f0e71d4f', 1.000, 'bbb4351b-d605-40c6-55da-d785c7f32e03', 1, current_timestamp, null, null, null, 'd27771f8-5bd8-d510-3026-f655c4d7c43a', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('dab66821-e3b0-b6a8-eae1-e0b3f0e71d4f', 1.000, 'a2ec9471-7e22-56ea-4601-e1d3ae9f24c9', 1, current_timestamp, null, null, null, 'df912333-fa7b-2606-c598-1c0135f1247b', current_timestamp, 'admin');

insert into SAMPLER_INVOICE_ITEM
(PRODUCT_ID, QUANTITY, ORDER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('17bc9b95-b562-0dd2-f904-db6df80b9c71', 1.000, '3fbc4ce8-7f8c-dcd0-5788-967f94f6ddbf', 1, current_timestamp, null, null, null, 'e2e78593-5939-2941-4518-f79e47c7f257', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('2d47b668-8fae-8a1f-f65f-145e4b11d812', 1, '2016-10-21 19:10:06', 'admin', '2016-10-21 19:10:06', null, null, null, 1.0, 13.0, 8);

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('4431be86-e95d-a046-a609-fa981b35ac76', 1, '2016-10-21 19:09:50', 'admin', '2016-10-21 19:09:50', null, null, null, 5.0, -6.0, 65);

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('68e7e4ff-b821-cb86-14d7-a54bb5ff2d47', 1, '2016-10-21 18:28:12', 'admin', '2016-10-21 18:28:12', null, null, null, 14.0, 10.0, 59);

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('78259a35-b6c9-ada0-cb0f-689785bbd1fb', 1, '2016-10-21 19:09:25', 'admin', '2016-10-21 19:09:25', null, null, null, 3.0, 5.0, 50);

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('b2f832c8-c2a9-5ef5-58dd-dd723fd26189', 1, '2016-10-21 19:09:32', 'admin', '2016-10-21 19:09:32', null, null, null, 8.0, -10.0, 19);

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('c732e449-d790-1143-5532-01b451b08634', 1, '2016-10-21 19:10:00', 'admin', '2016-10-21 19:10:00', null, null, null, -4.0, 15.0, 92);

insert into SAMPLER_POINT_VALUE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, X, Y, VALUE_)
values ('e66eb943-7b88-06ba-06c1-51087f874204', 1, '2016-10-21 19:10:12', 'admin', '2016-10-21 19:10:12', null, null, null, 6.0, 1.0, 35);

------------------------------------------------------------------------------------------------------------


insert into SEC_USER
(ID, CREATE_TS, VERSION, LOGIN, LOGIN_LC, PASSWORD, NAME, GROUP_ID, ACTIVE)
values ('e5e934e3-75d5-7f38-668c-a3a2473f4250', current_timestamp, 0, 'demo', 'demo', 'b65e290316bf6f1665ac3454376c9bad681b2a23', 'Demo user', '0fa2b1a5-1d68-4d69-9fbd-dff348347f93', true);

------------------------------------------------------------------------------------------------------------

insert into SEC_ROLE
(ID, CREATE_TS, VERSION, NAME, ROLE_TYPE)
values ('abc5c887-12fd-7211-64ee-b07e871cd985', current_timestamp, 1, 'Demo users', 20);

------------------------------------------------------------------------------------------------------------

insert into SEC_USER_ROLE
(ID, CREATE_TS, VERSION, USER_ID, ROLE_ID)
values ('34641bff-9f27-3e1a-1582-894355f5f588', current_timestamp, 1, 'e5e934e3-75d5-7f38-668c-a3a2473f4250', 'abc5c887-12fd-7211-64ee-b07e871cd985');

------------------------------------------------------------------------------------------------------------

insert into SEC_USER_SUBSTITUTION
(USER_ID, SUBSTITUTED_USER_ID, START_DATE, END_DATE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('60885987-1b61-4247-94c7-dff348347f93', 'e5e934e3-75d5-7f38-668c-a3a2473f4250', null, null, 1, current_timestamp, null, null, null, '33d2cdc1-81b5-ddd6-570a-3c6ba1a0e325', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SEC_PERMISSION 
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('d4c8ff13-dabe-b3a1-7f90-124d84d103c9', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sys$Category.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('1f9df966-3064-f074-90fe-7b06eaeed13f', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 20, 'sampler$Order:update', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('64ba6daa-a337-80a3-7dfa-cf98b52e9acc', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 20, 'sampler$Product:update', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('df941370-56b5-0fec-8a94-9e7ab42d1fbb', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sampler$Order.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION 
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID) 
values ('3de88368-758c-8dc4-8e06-23b831358286', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sampler$Product.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION 
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID) 
values ('c9e74b19-7748-7a66-29fd-b2fba0e950b7', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'aboutWindow', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('ee5385b2-52c2-6ba8-c97d-c0f06854775a', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'serverLog', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('34df121c-4229-16a7-1048-1e8744493f03', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'settings', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('f3cc3e93-5b2d-2700-36b3-2b1e67fd08e8', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sys$LockInfo.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('218fb722-bcec-0bf8-6011-7f0e7c90d6fa', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'entityRestore', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('761caf5d-dcd7-9d79-1c85-896b9cd3c19e', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sec$ScreenHistory.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('523e0bb2-cde7-fdf4-87c6-0ac30969c0a3', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sec$User.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('c84cb1cf-87ad-71e9-e1ae-a6c6bb6ba057', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 50, 'sampler$Product.edit:form', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION 
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID) 
values ('a8339b00-0923-1d46-d6b3-b3eeee2950b6', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sec$Role.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('b20112a6-c51c-c55c-85ec-47dfc52d582d', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sec$SessionLogEntry.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('50247f36-ccdc-809f-e095-c8b45258e43e', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'administration', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('0430db66-ee43-f846-b7d0-7f5df955a191', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'entityLog', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('726e1f07-ac14-2439-7cc0-2fecf7e335d7', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 20, 'sampler$Color:update', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION 
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID) 
values ('aa3fc0f0-92a0-8dd6-16aa-0ecb73629e25', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'performanceStatistics', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('e476c152-f277-d4a5-781a-b01aee5ef248', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 20, 'sampler$OrderItem:update', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('76d02435-7781-d592-0ca0-fdbf8c27702f', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'appProperties', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('4b2ead70-7cee-2013-d355-1f7a2e125b7d', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'printDomain', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('21215b21-7fad-89a8-f7f5-4f3384634a83', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sec$Group.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('ac5c75d9-c5b6-4c9d-a18a-934ff186c9cb', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'help', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('7bd24490-c64d-7bba-6fbd-f436c98bcbd3', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 50, 'sampler$OrderItem.edit:form', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('74311c41-9a59-47c4-1244-8344871bf0de', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sys$ScheduledTask.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('08e397e3-5f62-c669-c674-da7c20d1bbb9', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 40, 'cuba.restApi.enabled', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('46021ec4-51a8-1b16-22b2-fe13b5e58ad0', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'entityInspector.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('4a212a17-1979-bb6f-eee0-9d7f1a11fdc1', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'jmxConsole', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('713f77d3-3f14-d9bd-106d-41c4bb83a15f', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 40, 'cuba.gui.administration.downloadlogs', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('a5120a0d-d2ae-e488-87fc-678ae55970a7', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sampler$Customer.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('04ef5576-f9da-cc35-1345-6fa55de3aec4', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sys$FileDescriptor.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('7df5fdf3-b479-9b08-9a43-802fc0290f07', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 20, 'sampler$Customer:update', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('adce7749-164c-d9c1-b2a2-268ce02de0fe', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sec$UserSessionEntity.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('83e3b755-1d4a-c77b-5584-cf09bbfd684f', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 50, 'sampler$Order.edit:form', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION 
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID) 
values ('f951f377-c2db-0fe2-c55e-8b58498ba86b', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'sys$SendingMessage.browse', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('1793a4f9-31ee-35df-446b-8f335ed6702e', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'screenProfiler', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('0d846dd6-87b0-3824-fa5f-928d3b9854f0', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'logWindow', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('dd7eec44-0c5b-e006-124b-070f8349e9d6', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 20, 'sampler$Task:update', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('5dca22ad-7946-c202-9c54-66daf64a9ed8', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 10, 'application', 0, 'abc5c887-12fd-7211-64ee-b07e871cd985');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('73ebb311-25bd-b143-9b5e-34c39283f365', 1, current_timestamp, 'admin', current_timestamp, null, null, null, 50, 'sampler$Customer.edit:form', 1, 'abc5c887-12fd-7211-64ee-b07e871cd985');

------------------------------------------------------------------------------------------------------------

insert into SEC_FILTER
(COMPONENT, NAME, CODE, XML, USER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('sample-browser.multiple-filter.filter', 'Multiple Conditions', 'Multiple Conditions', '<?xml version="1.0" encoding="UTF-8"?>

<filter>
  <and>
    <c name="age" class="java.lang.Integer" operatorType="GREATER_OR_EQUAL" width="1" type="PROPERTY"><![CDATA[e.age >= :component$sampleFrame.filter.age80232]]>
      <param name="component$sampleFrame.filter.age80232" javaClass="java.lang.Integer">30</param>
    </c>
    <c name="grade" class="com.haulmont.sampler.entity.CustomerGrade" inExpr="true" operatorType="IN" width="1" type="PROPERTY"><![CDATA[e.grade in (:component$sampleFrame.filter.grade17245)]]>
      <param name="component$sampleFrame.filter.grade17245" javaClass="com.haulmont.sampler.entity.CustomerGrade">PREMIUM,HIGH</param>
    </c>
    <c name="active" class="java.lang.Boolean" operatorType="EQUAL" width="1" type="PROPERTY"><![CDATA[e.active = :component$sampleFrame.filter.active20980]]>
      <param name="component$sampleFrame.filter.active20980" javaClass="java.lang.Boolean">true</param>
    </c>
  </and>
</filter>
', null, 1, current_timestamp, 'admin', null, null, 'd3c7de25-2a98-625a-19ad-0a51abfd1d8a', current_timestamp, 'admin');

insert into SEC_FILTER
(COMPONENT, NAME, CODE, XML, USER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('sample-browser.group-filter.filter', 'Group', 'Group Conditions', '<?xml version="1.0" encoding="UTF-8"?>

<filter>
  <and>
    <or name="group" unary="true" width="1">
      <c name="active" class="java.lang.Boolean" operatorType="EQUAL" width="1" type="PROPERTY"><![CDATA[e.active = :component$sampleFrame.filter.active95893]]>
        <param name="component$sampleFrame.filter.active95893" javaClass="java.lang.Boolean">false</param>
      </c>
      <c name="grade" class="com.haulmont.sampler.entity.CustomerGrade" operatorType="EQUAL" width="1" type="PROPERTY"><![CDATA[e.grade = :component$sampleFrame.filter.grade65770]]>
        <param name="component$sampleFrame.filter.grade65770" javaClass="com.haulmont.sampler.entity.CustomerGrade">PREMIUM</param>
      </c>
    </or>
    <c name="age" class="java.lang.Integer" operatorType="GREATER_OR_EQUAL" width="1" type="PROPERTY"><![CDATA[e.age = :component$sampleFrame.filter.age37008]]>
      <param name="component$sampleFrame.filter.age37008" javaClass="java.lang.Integer">30</param>
    </c>
  </and>
</filter>
', null, 1, current_timestamp, 'admin', null, null, 'e21cb18b-5af0-0968-1dcc-55649ffbb105', current_timestamp, 'admin');

insert into SEC_FILTER
(COMPONENT, NAME, CODE, XML, USER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('sample-browser.related-filter.filter', 'Related Entity', 'Related Entity', '<?xml version="1.0" encoding="UTF-8"?>

<filter>
  <and>
    <c name="customer" class="com.haulmont.sampler.entity.Customer" operatorType="EQUAL" width="1" type="PROPERTY"><![CDATA[e.customer.id = :component$sampleFrame.filter.customer59415]]>
      <param name="component$sampleFrame.filter.customer59415" javaClass="com.haulmont.sampler.entity.Customer">NULL</param>
    </c>
    <c name="customer.grade" class="com.haulmont.sampler.entity.CustomerGrade" operatorType="EQUAL" width="1" type="PROPERTY"><![CDATA[e.customer.grade = :component$sampleFrame.filter.customer_grade88264]]>
      <param name="component$sampleFrame.filter.customer_grade88264" javaClass="com.haulmont.sampler.entity.CustomerGrade">NULL</param>
    </c>
  </and>
</filter>
', null, 1, current_timestamp, 'admin', null, null, '91072fda-7a6d-fd14-a099-6ce6b647575b', current_timestamp, 'admin');

insert into SEC_FILTER
(COMPONENT, NAME, CODE, XML, USER_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('sample-browser.custom-filter.filter', 'Custom Condition', 'Custom Condition', '<?xml version="1.0" encoding="UTF-8"?>

<filter>
  <and>
    <c name="OrderItems" class="com.haulmont.sampler.entity.Product" caption="Order items contain" width="1" type="CUSTOM" entityAlias="e"><![CDATA[i.product.id = :component$sampleFrame.filter.OrderItems81751]]>
      <param name="component$sampleFrame.filter.OrderItems81751" javaClass="com.haulmont.sampler.entity.Product">dab66821-e3b0-b6a8-eae1-e0b3f0e71d4f</param>
      <join><![CDATA[join {E}.items i]]></join>
    </c>
  </and>
</filter>
', null, 1, current_timestamp, 'admin', null, null, '0d5dbf8e-97f3-6abc-6c3a-a856182f6073', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-07-27', 13, 1, current_timestamp, null, null, null, 'a38bc5af-e5ae-487d-9f68-eda244579c4c', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-07-28', 11, 1, current_timestamp, null, null, null, '38fc001c-7a1d-48c6-9880-53045358a57b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-07-29', 15, 1, current_timestamp, null, null, null, '2b33aa8c-98af-42cc-96c5-ecc0bfd11adc', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-07-30', 16, 1, current_timestamp, null, null, null, 'f92f6377-5a15-4cc2-b1c0-a6a4ae9d69ae', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-07-31', 18, 1, current_timestamp, null, null, null, '41e9b3b7-16ab-47a0-bba5-5f5d7009b184', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-01', 13, 1, current_timestamp, null, null, null, '5b46b2d2-bdfd-4271-827f-f64bf7740c76', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-02', 22, 1, current_timestamp, null, null, null, 'bb91dfe0-2f8a-40c6-86ab-9a04432eeae5', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-03', 23, 1, current_timestamp, null, null, null, 'af2cce91-ffce-49bf-a687-8384ed672a07', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-04', 20, 1, current_timestamp, null, null, null, '18b41cfc-4f37-4c9e-8494-d1cc9c830bba', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-05', 17, 1, current_timestamp, null, null, null, 'bbce4ad9-80a2-4c60-96c8-771bb528ce6f', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-06', 16, 1, current_timestamp, null, null, null, '55f77b83-f613-4e33-af39-1a896de8ebd7', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-07', 18, 1, current_timestamp, null, null, null, 'e5972386-69db-4948-aa07-4c54f8999837', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-08', 21, 1, current_timestamp, null, null, null, 'fb99d6f1-887f-4b4b-9a91-cbf12af7795f', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-09', 26, 1, current_timestamp, null, null, null, 'a6e1f239-70af-4a2c-ab93-52deb8cd53d4', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-10', 24, 1, current_timestamp, null, null, null, 'c11aa48f-a099-44df-9269-c3de1e39854a', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-11', 29, 1, current_timestamp, null, null, null, 'af87a1a4-bbc4-41d4-85bb-f03f191c99b8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-12', 32, 1, current_timestamp, null, null, null, '93aadf8a-d0c2-4f51-b3db-2eabcd798d4e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-13', 18, 1, current_timestamp, null, null, null, 'bc4c657e-671c-427a-a0fa-4c19bb972115', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-14', 24, 1, current_timestamp, null, null, null, '2e573e8b-0f22-448f-9287-089512ed652f', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-15', 22, 1, current_timestamp, null, null, null, '2c6c0232-3b6d-4352-a0e5-a2896b6e75fb', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-16', 18, 1, current_timestamp, null, null, null, '7e1b3a43-5912-449f-b53d-566ef46efadb', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-17', 19, 1, current_timestamp, null, null, null, '6dec20ba-0314-49fb-aa98-e477741e1e80', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-18', 14, 1, current_timestamp, null, null, null, '837fae9a-93f1-4344-9530-f723c6cb6d32', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-19', 15, 1, current_timestamp, null, null, null, '7f3e70ff-c4e3-49a9-b5e1-5387e95cdb59', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-20', 12, 1, current_timestamp, null, null, null, '856c9237-b7b9-419b-976e-7ac8a42f35c1', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-21', 8, 1, current_timestamp, null, null, null, '4e8af7af-84ef-4441-8c4a-29bd1dffbb4b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-22', 9, 1, current_timestamp, null, null, null, '50bbd21e-b9b0-488b-a659-9cefc8369b62', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-23', 8, 1, current_timestamp, null, null, null, 'bd2646a7-f6d6-4758-9fb6-8e7fa29d9061', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-24', 7, 1, current_timestamp, null, null, null, '819fc308-4c6e-4ce0-a933-5edbbd647a65', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-25', 5, 1, current_timestamp, null, null, null, 'beb7ff22-aba4-495d-8f3f-1cbcd52e1586', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-26', 11, 1, current_timestamp, null, null, null, '2c0786bc-3078-457d-a114-9242ee020ae9', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-27', 13, 1, current_timestamp, null, null, null, '282b9092-ae76-41b4-b09a-5e752240a5a3', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-28', 18, 1, current_timestamp, null, null, null, '882490be-e3d8-48cc-be65-47219542a047', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-29', 20, 1, current_timestamp, null, null, null, 'c33a82d4-33e6-4c9c-b077-4bd7f74bc90d', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-30', 29, 1, current_timestamp, null, null, null, 'f3eae5a9-d0c3-43a3-b93d-5b36c5d30b22', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-08-31', 33, 1, current_timestamp, null, null, null, 'f6f532a6-5901-43d5-8e03-8939f5ec6338', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-01', 42, 1, current_timestamp, null, null, null, 'c71a17d4-fc68-4f54-9bbd-598fd8770c36', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-02', 35, 1, current_timestamp, null, null, null, '7f71f0fa-1c69-423f-908f-a5f459fca06d', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-03', 31, 1, current_timestamp, null, null, null, 'fd4a7b9a-7b25-4d8e-8c43-fdb75f3ad7c8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-04', 47, 1, current_timestamp, null, null, null, '54900ad4-c923-4876-8ca1-3df1270cf6c9', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-05', 52, 1, current_timestamp, null, null, null, '452df036-4654-42b5-80bb-cfbc468cdc6e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-06', 46, 1, current_timestamp, null, null, null, 'b77b7f57-4a4a-4108-8e94-5280bbb116bd', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-07', 41, 1, current_timestamp, null, null, null, '86479e5d-d2b7-4801-920b-78701c564aec', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-08', 43, 1, current_timestamp, null, null, null, '52da01bc-ff98-4708-94de-aed21b2656aa', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-09', 40, 1, current_timestamp, null, null, null, '5ddf232d-69a1-4ddb-860c-0e62d13c48ce', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-10', 39, 1, current_timestamp, null, null, null, 'd9b7bebf-e619-4394-ae42-d141adcad707', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-11', 34, 1, current_timestamp, null, null, null, '274e2c8b-08ff-4b2b-b9dc-7396ccde4d59', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-12', 29, 1, current_timestamp, null, null, null, '20c5ac3e-61ce-4fde-b76e-eb591b6a55ad', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-13', 34, 1, current_timestamp, null, null, null, '4e681421-e6a9-4ad5-a3b6-dd40d6b74ef8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-14', 37, 1, current_timestamp, null, null, null, '44bcec8f-9369-47b4-a332-e1ec8c1dd24a', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-15', 42, 1, current_timestamp, null, null, null, '7a7011a8-1966-4156-b815-186551b69c49', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-16', 49, 1, current_timestamp, null, null, null, '38013868-84ef-4e58-860d-620cd04b2f70', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-17', 46, 1, current_timestamp, null, null, null, 'd5d40970-6f9e-478d-a49a-e8824541bda8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-18', 47, 1, current_timestamp, null, null, null, '5b59f726-306f-4c9c-9104-a631814b19cf', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-19', 55, 1, current_timestamp, null, null, null, '214b9cc2-35bd-4ebc-a3f3-4f8c0065a334', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-20', 59, 1, current_timestamp, null, null, null, '5c679523-d10c-45c4-a18a-363d10b02b87', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-21', 58, 1, current_timestamp, null, null, null, 'c2450163-3e55-4b43-ad56-b30f305d4a66', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-22', 57, 1, current_timestamp, null, null, null, '62ec7acb-fcb2-4665-abdd-bb7458b9c6cd', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-23', 61, 1, current_timestamp, null, null, null, 'dd06e89f-7522-4a2c-857f-a5069c0b46bd', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-24', 59, 1, current_timestamp, null, null, null, '30a42aee-e523-4b96-8268-d7e13949c080', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-25', 67, 1, current_timestamp, null, null, null, '645bf453-b490-4a25-a3d4-5dcb0c990c9e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-26', 65, 1, current_timestamp, null, null, null, '26cfddf0-9e51-405a-ad44-fe92eafd41e1', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-27', 61, 1, current_timestamp, null, null, null, 'e8db5690-6d7a-4490-a115-0ab57a07cb69', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-28', 66, 1, current_timestamp, null, null, null, 'c0ca140e-fb87-4a5d-b957-5cab41cf9e34', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-29', 69, 1, current_timestamp, null, null, null, '90df9f08-ea89-4e01-aa78-18061b168e79', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-09-30', 71, 1, current_timestamp, null, null, null, '84a3f021-0935-4550-8325-88cf5d7fe220', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-01', 67, 1, current_timestamp, null, null, null, '239c8c11-316e-43c1-bcf6-fd423aea9e51', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-02', 63, 1, current_timestamp, null, null, null, 'dd82d2b0-d0c2-4ec5-bd5c-5085a284fbb9', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-03', 46, 1, current_timestamp, null, null, null, 'fae51849-7f58-490f-9f65-ed78e1519012', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-04', 32, 1, current_timestamp, null, null, null, '9d317cbb-4f1f-4453-843d-1b364ae527a6', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-05', 21, 1, current_timestamp, null, null, null, '638114d5-159c-46fb-8c2d-6d80879f9697', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-06', 18, 1, current_timestamp, null, null, null, '75bd1890-a996-4bba-b973-837bae2294d0', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-07', 21, 1, current_timestamp, null, null, null, '69d48e93-d57a-429c-a9d5-f2f7b783e1d8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-08', 28, 1, current_timestamp, null, null, null, '90a71d35-5824-47a2-a69f-0daad7a7b741', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-09', 27, 1, current_timestamp, null, null, null, '4d360d62-49da-4603-951c-8bc6ea062f70', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-10', 36, 1, current_timestamp, null, null, null, '6604fd38-e9f9-4bb9-85f2-99e39ea34571', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-11', 33, 1, current_timestamp, null, null, null, 'bb17d986-3c5a-4451-ad4e-09b7e0de67aa', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-12', 31, 1, current_timestamp, null, null, null, 'f95fa343-00ca-4f2e-a755-feef0dbe047c', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-13', 30, 1, current_timestamp, null, null, null, '1424a255-7d34-4147-a9e0-58b0fc429f08', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-14', 34, 1, current_timestamp, null, null, null, 'adfb2337-25c5-4ca0-a936-e736b5834430', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-15', 38, 1, current_timestamp, null, null, null, 'a00261a5-2b1f-49c5-bd4a-41fc9f8b65bb', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-16', 37, 1, current_timestamp, null, null, null, '2f39db20-5e52-48bd-b0d5-4af7be431f41', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-17', 44, 1, current_timestamp, null, null, null, '4dfd4d4a-6778-4f15-ad48-2d7eaf1ea9a4', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-18', 49, 1, current_timestamp, null, null, null, 'ed8a2c70-3d35-47fd-a632-786c40796eae', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-19', 53, 1, current_timestamp, null, null, null, 'b0407c34-f6ad-4ba1-b269-809c8ae088fb', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-20', 57, 1, current_timestamp, null, null, null, '5c941478-d0de-412f-8de1-4aece61c269d', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-21', 60, 1, current_timestamp, null, null, null, '4e5b1f22-1a97-42d7-9605-acd0331d39d3', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-22', 61, 1, current_timestamp, null, null, null, 'e693e7c4-d159-4034-8373-9abaf4edbd0b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-23', 69, 1, current_timestamp, null, null, null, '122af6d1-033e-4598-8b10-2389b6f2d7ea', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-24', 67, 1, current_timestamp, null, null, null, 'd3d30f76-2276-4f41-a8c0-1f0ccb01e9f8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-25', 72, 1, current_timestamp, null, null, null, '469a83b6-dd24-4187-ab85-2fd471d66ef5', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-26', 77, 1, current_timestamp, null, null, null, '3e4e44db-1784-4ed0-9d2c-dcfabdd517be', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-27', 75, 1, current_timestamp, null, null, null, 'a3279bd3-58ff-4c10-8744-7bc07491c5fb', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-28', 70, 1, current_timestamp, null, null, null, '3adf0cb6-04b6-4b9a-8c11-bcf2709f2589', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-29', 72, 1, current_timestamp, null, null, null, 'ca026ed8-35bc-44be-b377-8920c8bc0998', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-30', 70, 1, current_timestamp, null, null, null, '58e65777-3113-412c-a7f3-815ee8c091c2', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-10-31', 72, 1, current_timestamp, null, null, null, '7c799a51-7497-4603-b883-7a89b9e762cc', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-01', 73, 1, current_timestamp, null, null, null, '2fb11127-eb9f-4ac1-9ce2-707c1b3dcaaa', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-02', 67, 1, current_timestamp, null, null, null, '041d43bb-5022-4509-bd0c-0b4bd75e7d5e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-03', 68, 1, current_timestamp, null, null, null, '6b24bb04-367f-4eb1-ae0b-0f86dfb2c778', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-04', 65, 1, current_timestamp, null, null, null, '4bbc39f6-5a97-4392-ae00-dcf63e5e7ca5', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-05', 71, 1, current_timestamp, null, null, null, 'de59907e-5f7d-4b8f-a874-6d4bcae63170', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-06', 75, 1, current_timestamp, null, null, null, '75e7c4f9-8fac-41dc-9dd1-21eddd01f05e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-07', 74, 1, current_timestamp, null, null, null, 'aab6c3f9-f844-489e-a3d1-8ae6ba66f189', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-08', 71, 1, current_timestamp, null, null, null, '8f296fca-6400-4a6f-a169-012c68a0c306', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-09', 76, 1, current_timestamp, null, null, null, '411443f8-bc13-484d-a446-7486901b4229', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-10', 77, 1, current_timestamp, null, null, null, '5929073a-a785-4c44-812e-9609b8348d5f', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-11', 81, 1, current_timestamp, null, null, null, 'd8c827f8-1173-417f-bc63-a86637f0a683', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-12', 83, 1, current_timestamp, null, null, null, '5e6969ab-b174-4aaa-bd10-ab41ae592107', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-13', 80, 1, current_timestamp, null, null, null, '924b589f-10c8-4cb9-82f9-2f7ac1dbe3f7', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-14', 81, 1, current_timestamp, null, null, null, 'b7415573-b8b5-438c-93bf-24a410684721', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-15', 87, 1, current_timestamp, null, null, null, '58d7a1b9-55d1-4048-86ee-813e8e7d42f9', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-16', 82, 1, current_timestamp, null, null, null, 'fc634316-86a5-472c-9167-29106233b3df', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-17', 86, 1, current_timestamp, null, null, null, '25d56ee0-4ec3-4911-b4ef-00160f6a6de3', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-18', 80, 1, current_timestamp, null, null, null, '90b2fd13-e358-4c1c-9eef-1dc01cf64c3a', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-19', 87, 1, current_timestamp, null, null, null, '86a3dc0a-9d54-4733-9694-7ad1ff4a991e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-20', 83, 1, current_timestamp, null, null, null, '8d61837c-bf8b-4efe-a6e5-108c9239ac22', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-21', 85, 1, current_timestamp, null, null, null, 'e15a1709-0d92-4970-9721-29f15d2496d8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-22', 84, 1, current_timestamp, null, null, null, '8a6abae1-522a-493b-b88c-8aafbf4e939f', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-23', 82, 1, current_timestamp, null, null, null, '829c4c02-3c89-47f5-be86-4220a11b997b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-24', 73, 1, current_timestamp, null, null, null, 'e52cafc5-d624-4d12-8523-3daff01f71e6', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-25', 71, 1, current_timestamp, null, null, null, 'bec751ee-6e3d-4ca2-8a0a-cec9b4de4aa1', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-26', 75, 1, current_timestamp, null, null, null, '128aafb7-cf3b-44f5-b8ee-21ec6cdb029c', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-27', 79, 1, current_timestamp, null, null, null, '5f6acecf-5c56-485a-a041-9910b5373fc0', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-28', 70, 1, current_timestamp, null, null, null, '738028bf-6a7d-4ccc-be7a-ff8a7f490d65', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-29', 73, 1, current_timestamp, null, null, null, 'd0228a47-f936-484b-a331-05defec2e524', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-11-30', 61, 1, current_timestamp, null, null, null, '813b7b77-bcc8-482b-9a87-5ebffaffff5c', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-01', 62, 1, current_timestamp, null, null, null, 'df6ca321-073f-4016-bd0f-7ef59c759206', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-02', 66, 1, current_timestamp, null, null, null, '183eb3de-b64b-46e2-ae33-2de0c8d2e41e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-03', 65, 1, current_timestamp, null, null, null, '86717bd0-6044-4e4b-b6d4-07e4412f0cb3', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-04', 73, 1, current_timestamp, null, null, null, '4f4d90cf-a95e-4e99-a801-53610e65a9e8', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-05', 79, 1, current_timestamp, null, null, null, '571f1894-2f37-4652-8267-8903131421ea', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-06', 78, 1, current_timestamp, null, null, null, '59499d04-4aa5-4ff5-9ba6-985470add684', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-07', 78, 1, current_timestamp, null, null, null, '21d3d80f-2c4c-4e6f-87ee-0aa3af9373d3', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-08', 78, 1, current_timestamp, null, null, null, '06f2f581-8ca8-403b-9848-b9e56218b9cf', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-09', 74, 1, current_timestamp, null, null, null, 'b12c5c49-237f-48ba-932e-d0dec82aa012', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-10', 73, 1, current_timestamp, null, null, null, '128c71b5-154d-4070-80fa-c5ff53956bfa', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-11', 75, 1, current_timestamp, null, null, null, '3eb7f336-70f0-4605-841b-2c8646997d48', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-12', 70, 1, current_timestamp, null, null, null, 'bfc22c06-2f68-46c7-90e9-f877c71a95ab', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-13', 77, 1, current_timestamp, null, null, null, '290f4f2c-39be-4499-ba68-6c4ed6b8866a', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-14', 67, 1, current_timestamp, null, null, null, 'f2eae508-a2cb-4011-b83f-6c6820aaa2ad', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-15', 62, 1, current_timestamp, null, null, null, 'aea67829-d50d-4029-a422-ceab814de6d2', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-16', 64, 1, current_timestamp, null, null, null, 'd1000683-9fa3-44aa-9dce-3f1621057649', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-17', 61, 1, current_timestamp, null, null, null, '6098cd8f-25ac-4cc5-b932-99bc1ce76926', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-18', 59, 1, current_timestamp, null, null, null, '6b4eb94b-896c-4359-868c-9f44465c1eb6', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-19', 53, 1, current_timestamp, null, null, null, 'd87f77a6-52fc-4eee-9f1e-30915231ac9b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-20', 54, 1, current_timestamp, null, null, null, '004bca52-f62a-44d4-a39f-7b30fa2b3b35', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-21', 56, 1, current_timestamp, null, null, null, '3c10d193-de24-4276-8bf9-aad7c1f155aa', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-22', 59, 1, current_timestamp, null, null, null, '474a8f3f-ec2b-49dc-a3f1-c07a59ad208c', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-23', 58, 1, current_timestamp, null, null, null, '0fac802c-0f62-45de-85c7-a08300c78925', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-24', 55, 1, current_timestamp, null, null, null, '24237ffb-b75b-4f1f-aa4e-3f16dcc4aa49', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-25', 52, 1, current_timestamp, null, null, null, '1b7dfb1a-860b-4cc1-bf8a-b0bbef7b3de9', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-26', 54, 1, current_timestamp, null, null, null, '87361d03-715b-4eb9-8c85-c7aacc2d6e6a', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-27', 50, 1, current_timestamp, null, null, null, '44000a0c-25ef-41fc-8fd3-1ab674f4cfab', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-28', 50, 1, current_timestamp, null, null, null, 'a7f5bdf2-c65f-43ec-87f3-b8a7cf418b51', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-29', 51, 1, current_timestamp, null, null, null, 'cc1f296c-5b30-4b39-8f6b-a8a65fdf7d52', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-30', 52, 1, current_timestamp, null, null, null, 'fc331ce0-7241-4856-90af-76821b4336b6', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2012-12-31', 58, 1, current_timestamp, null, null, null, 'fba7ba8f-5412-429c-b6a3-039ac9580cdb', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-01', 60, 1, current_timestamp, null, null, null, 'e7b8a86e-f4bf-451e-9f51-0b0cb340e9a1', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-02', 67, 1, current_timestamp, null, null, null, 'f5c699a5-52e0-40b9-8f9a-39c50d2bafc4', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-03', 64, 1, current_timestamp, null, null, null, 'c386be2d-a551-44b9-bc07-d2636404ec19', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-04', 66, 1, current_timestamp, null, null, null, '4cbc7dfe-aeef-488e-bac7-4083107e3e09', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-05', 60, 1, current_timestamp, null, null, null, 'b60e3517-0dec-47a1-9c33-faa9b40fb5d4', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-06', 63, 1, current_timestamp, null, null, null, '33a2a844-2335-4888-b303-8efb14f0b104', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-07', 61, 1, current_timestamp, null, null, null, '0cd6676e-d055-4908-9011-0afabd0766b6', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-08', 60, 1, current_timestamp, null, null, null, '07c38aa8-c1c8-4488-9ca6-a7e361ffda37', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-09', 65, 1, current_timestamp, null, null, null, 'ec17a83d-5c0c-4a0d-aa6a-a2187ff909c9', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-10', 75, 1, current_timestamp, null, null, null, 'a9b55d24-f1d2-47c3-bb16-3193f322e815', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-11', 77, 1, current_timestamp, null, null, null, '9c14fb55-739a-45e3-9533-b65e4490c83c', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-12', 78, 1, current_timestamp, null, null, null, 'fbfa6d88-e4fc-4bb6-9db1-22ffb624f874', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-13', 70, 1, current_timestamp, null, null, null, '3b600d4b-43aa-4777-b288-9435fd11709b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-14', 70, 1, current_timestamp, null, null, null, '93ff130b-4b95-446d-9cf6-05a8c39a8cee', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-15', 73, 1, current_timestamp, null, null, null, '2c3402d2-aac0-47e6-941d-10ce39d39769', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-16', 71, 1, current_timestamp, null, null, null, '62f35e5f-0f7b-4248-b4cd-f45711abb643', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-17', 74, 1, current_timestamp, null, null, null, 'd535ff03-a56b-4dcb-9cd0-20d28c010632', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-18', 78, 1, current_timestamp, null, null, null, 'fb6d340f-34fc-4241-ab01-aaf5a973918b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-19', 85, 1, current_timestamp, null, null, null, 'a1bb9dc5-1023-43dc-bf34-db30d1f814df', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-20', 82, 1, current_timestamp, null, null, null, '004706fc-dba5-4e79-8bd3-6ab9cd088805', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-21', 83, 1, current_timestamp, null, null, null, '4e6cae8d-eeb0-44b4-b0d3-0db5238e497f', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-22', 88, 1, current_timestamp, null, null, null, 'facba445-9316-4b46-baee-88f7c7d45f87', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-23', 85, 1, current_timestamp, null, null, null, 'c38b0abd-1562-46d7-a4c6-aff5c81b7891', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-24', 85, 1, current_timestamp, null, null, null, 'f5ffa844-ba7b-4171-a38e-cc900981bdcc', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-25', 80, 1, current_timestamp, null, null, null, '3405a7fe-6d28-4e57-b586-083d797c231e', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-26', 87, 1, current_timestamp, null, null, null, 'fee0ff2f-3eb4-4ab3-a789-0f03ab8c2803', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-27', 84, 1, current_timestamp, null, null, null, 'eee44ade-ee1d-48a7-8222-75e38f89f00b', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-28', 83, 1, current_timestamp, null, null, null, 'c388ea59-8396-472e-97d1-b32a6e8dfdbe', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-29', 84, 1, current_timestamp, null, null, null, '7e84b1ea-a649-45a7-9827-0e6e54a18cc2', current_timestamp, 'admin');

insert into SAMPLER_DATE_VALUE
(DATE_, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('2013-01-30', 81, 1, current_timestamp, null, null, null, '95f6c0c5-ce68-498b-ad1d-ff2536607a47', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1994, 1587, 650, 121, 1, current_timestamp, null, null, null, 'c081cbd4-6f56-4e12-a1c6-7d365f8c1ed3', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1995, 1567, 683, 146, 1, current_timestamp, null, null, null, 'f4e3492b-5ea6-4dc5-9600-d42d104a176b', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1996, 1617, 691, 138, 1, current_timestamp, null, null, null, 'b8a512a7-585b-4f48-8c7c-3dc6142addd1', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1997, 1630, 642, 127, 1, current_timestamp, null, null, null, '6bd5599e-95f7-47d8-abc6-8ea8676c3134', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1998, 1660, 699, 105, 1, current_timestamp, null, null, null, '35f887b5-c137-4d6e-b281-7baa18776ad0', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1999, 1683, 721, 109, 1, current_timestamp, null, null, null, 'fd2e2323-91ea-4791-980c-5f93a6341625', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2000, 1691, 737, 112, 1, current_timestamp, null, null, null, '9655090a-b716-4ee9-94b8-96b63e351ede', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2001, 1298, 680, 101, 1, current_timestamp, null, null, null, 'a1919ff9-37f4-4660-b09d-a6361c0463f1', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2002, 1275, 664, 97, 1, current_timestamp, null, null, null, 'fbccfb2a-aa46-4588-8611-0aff4eef7e19', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2003, 1246, 648, 93, 1, current_timestamp, null, null, null, 'ce2927ce-7422-4a62-bbf6-3b363ab01aa9', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2004, 1318, 697, 111, 1, current_timestamp, null, null, null, 'cdc62347-50ba-469e-a1b3-b3c2e5c1196a', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2005, 1213, 633, 87, 1, current_timestamp, null, null, null, '3d4cc153-4a66-4372-893d-68c9aaa4186a', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2006, 1199, 621, 79, 1, current_timestamp, null, null, null, 'ebbbbc3b-64e4-404b-a5df-8c70d865631a', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2007, 1110, 210, 81, 1, current_timestamp, null, null, null, 'b08c4523-1b89-48f5-afa9-8df84c961305', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2008, 1165, 232, 75, 1, current_timestamp, null, null, null, '44940ee1-a50c-4e3d-9b31-00699a57bd2f', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2009, 1145, 219, 88, 1, current_timestamp, null, null, null, '3dc721e4-19c5-4b69-9dae-c780b62435d4', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2010, 1163, 201, 82, 1, current_timestamp, null, null, null, 'a9096485-cf19-4972-9db9-b669547de8c5', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2011, 1180, 285, 87, 1, current_timestamp, null, null, null, '6c3e2d79-8266-42f3-9f6f-eaab33ea017b', current_timestamp, 'admin');

insert into SAMPLER_TRANSPORT_COUNT
(YEAR_, CARS, MOTORCYCLES, BICYCLES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2012, 1159, 277, 71, 1, current_timestamp, null, null, null, '1f805b20-b11f-4652-b0e7-95c0c8386529', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_INCOME_EXPENSES
(YEAR_, INCOME, EXPENSES, ALPHA, DASH_LENGTH_LINE, DASH_LENGTH_COLUMN, ADDITIONAL, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2009, 23.5, 21.1, null, null, null, null, 1, current_timestamp, null, null, null, '066dd94f-ae77-46ce-bdee-07fadd44a757', current_timestamp, 'admin');

insert into SAMPLER_INCOME_EXPENSES
(YEAR_, INCOME, EXPENSES, ALPHA, DASH_LENGTH_LINE, DASH_LENGTH_COLUMN, ADDITIONAL, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2010, 26.2, 30.5, null, null, null, null, 1, current_timestamp, null, null, null, '25cdeab4-e31b-4702-911d-2c35b8f03413', current_timestamp, 'admin');

insert into SAMPLER_INCOME_EXPENSES
(YEAR_, INCOME, EXPENSES, ALPHA, DASH_LENGTH_LINE, DASH_LENGTH_COLUMN, ADDITIONAL, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2011, 30.1, 34.9, null, null, null, null, 1, current_timestamp, null, null, null, '6b13081c-394f-4b83-9e59-028bb4f78020', current_timestamp, 'admin');

insert into SAMPLER_INCOME_EXPENSES
(YEAR_, INCOME, EXPENSES, ALPHA, DASH_LENGTH_LINE, DASH_LENGTH_COLUMN, ADDITIONAL, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2012, 29.5, 31.1, null, null, null, null, 1, current_timestamp, null, null, null, '4839a394-4e90-46de-9a93-0385fd556856', current_timestamp, 'admin');

insert into SAMPLER_INCOME_EXPENSES
(YEAR_, INCOME, EXPENSES, ALPHA, DASH_LENGTH_LINE, DASH_LENGTH_COLUMN, ADDITIONAL, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2013, 30.6, 28.2, null, 5, null, null, 1, current_timestamp, null, null, null, 'dca0e2db-3aeb-4df0-91a4-bd692371fd39', current_timestamp, 'admin');

insert into SAMPLER_INCOME_EXPENSES
(YEAR_, INCOME, EXPENSES, ALPHA, DASH_LENGTH_LINE, DASH_LENGTH_COLUMN, ADDITIONAL, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2014, 34.1, 32.9, 0.2, null, 5, '(projection)', 1, current_timestamp, null, null, null, '5b306626-115a-492f-a3d4-8b2808feaa21', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('USA', 3.5, 4.2, 1, current_timestamp, null, null, null, '719b65f6-a32d-426f-8f69-db3f800a5124', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('UK', 1.7, 3.1, 1, current_timestamp, null, null, null, 'f74efb19-3d52-43cf-918e-87f48a9ac960', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Canada', 2.8, 2.9, 1, current_timestamp, null, null, null, '104ccf82-7d0a-4dc2-9273-6d66470ba661', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Japan', 2.6, 2.3, 1, current_timestamp, null, null, null, 'b06075ab-66da-46fb-bbd9-6584e943367a', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('France', 1.4, 2.1, 1, current_timestamp, null, null, null, '6f05051f-3dc3-4605-9287-467ea7b408ae', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Brazil', 2.6, 4.9, 1, current_timestamp, null, null, null, '47bd990b-b54d-4d77-989f-edfb6b52d5c9', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Russia', 6.4, 7.2, 1, current_timestamp, null, null, null, 'a9ce13f3-bcb9-4924-9651-a15ede3b3f3e', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('India', 8.0, 7.1, 1, current_timestamp, null, null, null, 'ebe80366-5264-4955-861c-bdabcea8c18a', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_GROWTH
(COUNTRY, YEAR2014, YEAR2015, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('China', 9.9, 10.1, 1, current_timestamp, null, null, null, '054a6e6a-86f8-4400-9e2d-1ccb0aa487f5', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (1.0, 0.5, 1.0, 2.2, 1, current_timestamp, null, null, null, '6f2386f4-f457-4247-afb9-4665f8d15a02', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (2.0, 1.3, 2.0, 4.9, 1, current_timestamp, null, null, null, 'ddaacf74-feac-4c64-90e8-bd3dca4450e0', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (3.0, 2.3, 3.0, 5.1, 1, current_timestamp, null, null, null, 'e7fad59f-e926-4c1e-8b12-be7ed59a0423', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (4.0, 2.8, 4.0, 5.3, 1, current_timestamp, null, null, null, '6043ce84-c4f3-42fd-b036-570828fc74fa', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (5.0, 3.5, 5.0, 6.1, 1, current_timestamp, null, null, null, 'fe77952c-bb32-4eb9-9902-3614220af8e0', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (6.0, 5.1, 6.0, 8.3, 1, current_timestamp, null, null, null, 'f10d8239-8c04-4f7b-a37a-b568e1073cec', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (7.0, 6.7, 7.0, 10.5, 1, current_timestamp, null, null, null, '6b5928b1-2a30-4164-92b8-c546941a9c91', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (8.0, 8.0, 8.0, 12.3, 1, current_timestamp, null, null, null, 'e0ff1c70-e97e-4617-b8b5-fc0d3050e352', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (9.0, 8.9, 9.0, 14.5, 1, current_timestamp, null, null, null, '961f1f66-c320-4c80-b5a9-14ff18727a09', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (10.0, 9.7, 10.0, 15.0, 1, current_timestamp, null, null, null, '237b09d2-6fd4-4358-a116-fd4e377e1353', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (11.0, 10.4, 11.0, 18.8, 1, current_timestamp, null, null, null, '161b4a67-68b4-420f-b417-55e267b92e96', current_timestamp, 'admin');

insert into SAMPLER_POINT_PAIR
(AX, AY, BX, BY_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (12.0, 11.7, 12.0, 19.0, 1, current_timestamp, null, null, null, 'de9456f9-8984-4891-8e1a-26464338875d', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Russia', 256.9, 1, current_timestamp, null, null, null, '6d206bd6-f17f-48f6-a007-a55199a1067f', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Ireland', 131.1, 1, current_timestamp, null, null, null, '1eacbf39-7da2-472b-9527-9a2fbec7868e', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Germany', 115.8, 1, current_timestamp, null, null, null, 'a988fa3f-1126-4560-8504-9354f9f5fc57', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Australia', 109.9, 1, current_timestamp, null, null, null, 'ec6dac6b-63c7-470f-81a7-c4a7a6ddac80', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Austria', 108.3, 1, current_timestamp, null, null, null, 'b9d30c9c-cf10-4acd-8ce5-f4124ad2ec70', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('UK', 65.0, 1, current_timestamp, null, null, null, '6507a392-5252-4bff-b2a4-3c9f294aab2a', current_timestamp, 'admin');

insert into SAMPLER_COUNTRY_LITRES
(COUNTRY, LITRES, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Belgium', 40.0, 1, current_timestamp, null, null, null, '8df0609a-317a-4f03-81db-0aa6653a4c8b', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Website visits', 300, 1, current_timestamp, null, null, null, '0b3cba71-290f-4954-9aac-17db1eb7178b', current_timestamp, 'admin');

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Downloads', 123, 1, current_timestamp, null, null, null, 'a10f2002-ac28-4a56-9df9-731e4c0611c9', current_timestamp, 'admin');

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Requested prices', 98, 1, current_timestamp, null, null, null, '2fb9c084-8b1d-4555-a08a-95721d1d85df', current_timestamp, 'admin');

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Contaced', 72, 1, current_timestamp, null, null, null, 'b87dc1cb-813a-42b7-829b-86ead4c5933d', current_timestamp, 'admin');

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Purchased', 35, 1, current_timestamp, null, null, null, 'ebd1406c-b6e6-469d-8227-fee96651e108', current_timestamp, 'admin');

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Asked for support', 25, 1, current_timestamp, null, null, null, 'a0bd883f-0be3-49bd-b000-d5f27da7bdbf', current_timestamp, 'admin');

insert into SAMPLER_TITLE_VALUE
(TITLE, VALUE_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Purchased more', 18, 1, current_timestamp, null, null, null, '0be7a2b2-8b28-44b6-9430-8e18daa2a0f0', current_timestamp, 'admin');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_TASK_SPAN 
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY) 
values ('John', 1, current_timestamp, null, null, null, '45b72563-6f35-29ba-af6a-f92ec7824a86', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (7, 2, '#46615e', 'Task #1', '45b72563-6f35-29ba-af6a-f92ec7824a86', 1, 1, current_timestamp, null, null, null, '1f1893fc-5c84-e325-05de-afff087e3846', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 2, '#727d6f', 'Task #2', '45b72563-6f35-29ba-af6a-f92ec7824a86', 2, 1, current_timestamp, null, null, null, 'c0abff55-10a7-0c21-e530-40f0f8da1fb7', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 2, '#8dc49f', 'Task #3', '45b72563-6f35-29ba-af6a-f92ec7824a86', 3, 1, current_timestamp, null, null, null, '736d331e-856d-fa38-54f4-0860be998105', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Smith', 1, current_timestamp, null, null, null, 'ea6a27df-d2e1-386e-61b1-befcaaac7100', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (10, 2, '#727d6f', 'Task #2', 'ea6a27df-d2e1-386e-61b1-befcaaac7100', 1, 1, current_timestamp, null, null, null, 'f81b33db-5c66-aae1-0c1b-f053b6e13d5a', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 1, '#8dc49f', 'Task #3', 'ea6a27df-d2e1-386e-61b1-befcaaac7100', 2, 1, current_timestamp, null, null, null, '53e26f0b-2320-eb09-2ceb-a63e93b07749', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 4, '#46615e', 'Task #1', 'ea6a27df-d2e1-386e-61b1-befcaaac7100', 3, 1, current_timestamp, null, null, null, '2b48407d-5f3d-3f7b-4ea8-2562fcd3dff5', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Ben', 1, current_timestamp, null, null, null, '8b4dd0ad-cde2-2766-d83c-485a9bead8b7', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (12, 2, '#727d6f', 'Task #2', '8b4dd0ad-cde2-2766-d83c-485a9bead8b7', 1, 1, current_timestamp, null, null, null, '25a81604-92eb-6bf5-1be4-f4def6b7ff7f', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (16, 2, '#FFCF96', 'Task #4', '8b4dd0ad-cde2-2766-d83c-485a9bead8b7', 2, 1, current_timestamp, null, null, null, '2053d743-c83e-6ada-0d21-a83e505a6be8', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Mike', 1, current_timestamp, null, null, null, '4bea2fa9-9296-b8f0-6f61-269c64c2409e', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (9, 6, '#46615e', 'Task #1', '4bea2fa9-9296-b8f0-6f61-269c64c2409e', 1, 1, current_timestamp, null, null, null, '7e538d61-140a-9d3d-b463-cc497c5e614e', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 4, '#727d6f', 'Task #2', '4bea2fa9-9296-b8f0-6f61-269c64c2409e', 2, 1, current_timestamp, null, null, null, '780c52e4-e0ce-3b07-c744-e3ef1a70038d', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Lenny', 1, current_timestamp, null, null, null, 'dd60a011-4ec7-092c-a4a2-f9a84c4f848e', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (8, 1, '#8dc49f', 'Task #3', 'dd60a011-4ec7-092c-a4a2-f9a84c4f848e', 1, 1, current_timestamp, null, null, null, '0cdacba9-9370-5776-3742-832e5883f3ea', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 4, '#46615e', 'Task #1', 'dd60a011-4ec7-092c-a4a2-f9a84c4f848e', 2, 1, current_timestamp, null, null, null, '92437b45-8bcd-7b67-dc2e-84630d6d8e68', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Scott', 1, current_timestamp, null, null, null, 'b8884f20-3290-328f-3a51-28413b9c9241', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (15, 3, '#727d6f', 'Task #2', 'b8884f20-3290-328f-3a51-28413b9c9241', 1, 1, current_timestamp, null, null, null, '9d212c69-e7c7-90d6-b6e2-2b5fdda35f89', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Julia', 1, current_timestamp, null, null, null, '7e7b5048-0faf-545c-02d2-4e78c67a8f8d', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (9, 2, '#46615e', 'Task #1', '7e7b5048-0faf-545c-02d2-4e78c67a8f8d', 1, 1, current_timestamp, null, null, null, 'c28d6d90-c75a-ee72-3737-e3a204735044', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 1, '#727d6f', 'Task #2', '7e7b5048-0faf-545c-02d2-4e78c67a8f8d', 2, 1, current_timestamp, null, null, null, '59fbcc2f-adc6-48a0-1b44-25b522ce1b65', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 8, '#8dc49f', 'Task #3', '7e7b5048-0faf-545c-02d2-4e78c67a8f8d', 3, 1, current_timestamp, null, null, null, 'e57ed427-30d6-2cc9-f4ac-a80badddd35c', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Bob', 1, current_timestamp, null, null, null, 'ab25cb5e-320b-ff5e-33f6-ebd7da150619', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (9, 8, '#727d6f', 'Task #2', 'ab25cb5e-320b-ff5e-33f6-ebd7da150619', 1, 1, current_timestamp, null, null, null, '5620138a-c995-1e7c-8060-ccc89b390d79', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 7, '#8dc49f', 'Task #3', 'ab25cb5e-320b-ff5e-33f6-ebd7da150619', 2, 1, current_timestamp, null, null, null, '00ac9143-26d5-dbdc-78dc-b06a61b516ba', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Kendra', 1, current_timestamp, null, null, null, 'c262de4b-9897-e16c-df88-d24e0fd7bf5f', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (11, 8, '#727d6f', 'Task#2', 'c262de4b-9897-e16c-df88-d24e0fd7bf5f', 1, 1, current_timestamp, null, null, null, 'd597cdc4-f6d1-886b-8a48-e5cdb94f4f7d', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (19, 2, '#FFCF96', 'Task #4', 'c262de4b-9897-e16c-df88-d24e0fd7bf5f', 2, 1, current_timestamp, null, null, null, '417f321a-de73-a501-b6bf-2b28888c5ed7', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Tom', 1, current_timestamp, null, null, null, '7574c53b-5bce-845d-908c-bf30f29182a9', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (9, 4, '#46615e', 'Task #1', '7574c53b-5bce-845d-908c-bf30f29182a9', 1, 1, current_timestamp, null, null, null, '8a4f3587-0151-0af8-0399-de2fbe1f253e', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 3, '#727d6f', 'Task #2', '7574c53b-5bce-845d-908c-bf30f29182a9', 2, 1, current_timestamp, null, null, null, 'd5e2526c-9618-2cbd-aeb4-2f40a3f2f9e4', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 5, '#8dc49f', 'Task #3', '7574c53b-5bce-845d-908c-bf30f29182a9', 3, 1, current_timestamp, null, null, null, 'be6a6074-1a39-7b51-2ce9-3018f368008c', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Kyle', 1, current_timestamp, null, null, null, 'c2fd2888-1b41-8268-814e-278522b37e23', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (6, 3, '#727d6f', 'Task #2', 'c2fd2888-1b41-8268-814e-278522b37e23', 1, 1, current_timestamp, null, null, null, 'ecf9df21-261a-07ce-9ae9-54cfff7538aa', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Anita', 1, current_timestamp, null, null, null, '24fe04b8-c410-0354-338c-126cc78c7734', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (12, 2, '#727d6f', 'Task #2', '24fe04b8-c410-0354-338c-126cc78c7734', 1, 1, current_timestamp, null, null, null, '5fe92b01-6898-72ac-aae6-fd434b2e4941', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (16, 2, '#FFCF96', 'Task #4', '24fe04b8-c410-0354-338c-126cc78c7734', 2, 1, current_timestamp, null, null, null, 'f1c33c16-d95a-0a19-c642-cc6aac431f35', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Jack', 1, current_timestamp, null, null, null, '4a63bf60-c121-d269-c592-a54dc56e666d', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (8, 10, '#46615e', 'Task #1', '4a63bf60-c121-d269-c592-a54dc56e666d', 1, 1, current_timestamp, null, null, null, 'd553e610-13c7-7e4a-5543-2d87401ea71e', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 2, '#727d6f', 'Task #2', '4a63bf60-c121-d269-c592-a54dc56e666d', 2, 1, current_timestamp, null, null, null, '9c33fd53-bb62-5620-80f1-400b001a899e', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Kim', 1, current_timestamp, null, null, null, '47649c8a-674d-d551-2d72-27d198f796d2', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (12, 2, '#727d6f', 'Task #2', '47649c8a-674d-d551-2d72-27d198f796d2', 1, 1, current_timestamp, null, null, null, '42fbe604-b3e1-7147-6c24-0bb24b466dd3', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 3, '#8dc49f', 'Task #3', '47649c8a-674d-d551-2d72-27d198f796d2', 2, 1, current_timestamp, null, null, null, 'b2551d03-e64d-0261-19de-e78d15928f0c', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Aaron', 1, current_timestamp, null, null, null, 'faecb45a-4663-6bbc-6ae6-ddab158af784', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (18, 2, '#727d6f', 'Task #2', 'faecb45a-4663-6bbc-6ae6-ddab158af784', 1, 1, current_timestamp, null, null, null, '08fd8182-3df6-5f52-63a3-4ce498fae993', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 2, '#FFCF96', 'Task #4', 'faecb45a-4663-6bbc-6ae6-ddab158af784', 2, 1, current_timestamp, null, null, null, '47473750-1de0-41ed-1c1e-6ecb58473d70', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Alan', 1, current_timestamp, null, null, null, '46937a60-6620-b6ce-a530-71792cd0c6d4', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (17, 2, '#46615e', 'Task #1', '46937a60-6620-b6ce-a530-71792cd0c6d4', 1, 1, current_timestamp, null, null, null, '1dba048f-830f-6f1e-b897-0d5c65a03468', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 2, '#727d6f', 'Task #2', '46937a60-6620-b6ce-a530-71792cd0c6d4', 2, 1, current_timestamp, null, null, null, 'fc90f4d3-18ec-0a8b-12d5-8aef59a91d74', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 2, '#8dc49f', 'Task #3', '46937a60-6620-b6ce-a530-71792cd0c6d4', 3, 1, current_timestamp, null, null, null, 'ca4260a6-d4f8-0c55-75fc-e65cca5da030', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Ruth', 1, current_timestamp, null, null, null, '0f8dab07-0d2e-958c-dc0b-4f52e31706e4', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (13, 2, '#727d6f', 'Task #2', '0f8dab07-0d2e-958c-dc0b-4f52e31706e4', 1, 1, current_timestamp, null, null, null, '90a174d6-2477-1c4f-141e-0e67a2292cbc', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 1, '#8dc49f', 'Task #3', '0f8dab07-0d2e-958c-dc0b-4f52e31706e4', 2, 1, current_timestamp, null, null, null, '2384a090-8ea8-8bc6-9892-d0060b435baa', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 4, '#46615e', 'Task #1', '0f8dab07-0d2e-958c-dc0b-4f52e31706e4', 3, 1, current_timestamp, null, null, null, 'c58160ca-a3fd-2e49-5ee7-352dc16bfc89', current_timestamp, 'admin');


insert into SAMPLER_TASK_SPAN
(CATEGORY, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values ('Simon', 1, current_timestamp, null, null, null, 'e3c711f1-9de7-6856-736d-98392fa2e79b', current_timestamp, 'admin');

insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (10, 3, '#727d6f', 'Task #2', 'e3c711f1-9de7-6856-736d-98392fa2e79b', 1, 1, current_timestamp, null, null, null, '3f4d96ee-633a-ff12-3b97-ed392642d140', current_timestamp, 'admin');
insert into SAMPLER_SEGMENT
(START_, DURATION, COLOR, TASK_, TASK_SPAN_ID, INDEX_, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (17, 4, '#FFCF96', 'Task #4', 'e3c711f1-9de7-6856-736d-98392fa2e79b', 2, 1, current_timestamp, null, null, null, 'a1a12b4b-a5e5-780c-1577-3ec3aa4f7c50', current_timestamp, 'admin');


------------------------------------------------------------------------------------------------------------

insert into SAMPLER_DATE_TASK_SPAN
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CATEGORY)
values ('77aaa6cf-ed0b-fd3f-2790-d68f3fa159ed', 1, '2016-10-17 16:22:41', 'admin', '2016-10-17 16:22:41', null, null, null, 'Module #1');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('264ab365-2465-32b2-c307-13138f3aea44', 1, '2016-10-17 16:22:41', 'admin', '2016-10-17 16:22:41', null, null, null, '2016-01-01', '2016-01-14', '#b9783f', 'Gathering requirements', '77aaa6cf-ed0b-fd3f-2790-d68f3fa159ed');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('9ef154c9-805a-0ee4-5fa2-00735c13c204', 1, '2016-10-17 16:22:41', 'admin', '2016-10-17 16:22:41', null, null, null, '2016-01-16', '2016-01-27', null, 'Producing specifications', '77aaa6cf-ed0b-fd3f-2790-d68f3fa159ed');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('d7e741d4-3f78-d3f9-0e54-52a4c3698136', 1, '2016-10-17 16:22:41', 'admin', '2016-10-17 16:22:41', null, null, null, '2016-02-05', '2016-04-18', null, 'Development', '77aaa6cf-ed0b-fd3f-2790-d68f3fa159ed');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('e23b4d92-91ca-6fd0-31f6-1ecbd9c7c6ca', 1, '2016-10-17 16:22:41', 'admin', '2016-10-17 16:22:41', null, null, null, '2016-04-18', '2016-04-30', null, 'Testing and QA', '77aaa6cf-ed0b-fd3f-2790-d68f3fa159ed');


insert into SAMPLER_DATE_TASK_SPAN
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CATEGORY)
values ('4d04aa84-ae6d-fa6b-a1bb-562dd555fe6c', 1, '2016-10-17 16:28:12', 'admin', '2016-10-17 16:28:12', null, null, null, 'Module #2');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('9f9a56a8-fbaf-4aca-b27e-d6805a99a340', 1, '2016-10-17 16:28:12', 'admin', '2016-10-17 16:28:12', null, null, null, '2016-01-08', '2016-01-10', '#cc4748', 'Gathering requirements', '4d04aa84-ae6d-fa6b-a1bb-562dd555fe6c');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('41b988f1-1a0f-fd08-17e8-bc4c2881f45e', 1, '2016-10-17 16:28:12', 'admin', '2016-10-17 16:28:12', null, null, null, '2016-01-12', '2016-01-15', null, 'Producing specifications', '4d04aa84-ae6d-fa6b-a1bb-562dd555fe6c');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('726379b4-a407-7101-8f55-ccb43fa63d5c', 1, '2016-10-17 16:28:12', 'admin', '2016-10-17 16:28:12', null, null, null, '2016-01-16', '2016-02-05', null, 'Development', '4d04aa84-ae6d-fa6b-a1bb-562dd555fe6c');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('0109236a-5142-03c9-7b24-300852586038', 1, '2016-10-17 16:28:12', 'admin', '2016-10-17 16:28:12', null, null, null, '2016-02-10', '2016-02-18', null, 'Testing and QA', '4d04aa84-ae6d-fa6b-a1bb-562dd555fe6c');


insert into SAMPLER_DATE_TASK_SPAN
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CATEGORY)
values ('d7701287-004e-30e8-e5f6-baad0a09ab7a', 1, '2016-10-17 16:33:58', 'admin', '2016-10-17 16:33:58', null, null, null, 'Module #3');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('c47f98ce-3854-7eab-cd3f-a4c12e629dec', 1, '2016-10-17 16:33:58', 'admin', '2016-10-17 16:33:58', null, null, null, '2016-01-02', '2016-01-08', '#cd82ad', 'Gathering requirements', 'd7701287-004e-30e8-e5f6-baad0a09ab7a');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('d52bc841-c3dd-a8e2-8f2a-5b26e9265126', 1, '2016-10-17 16:33:58', 'admin', '2016-10-17 16:33:58', null, null, null, '2016-01-08', '2016-01-16', null, 'Producing specifications', 'd7701287-004e-30e8-e5f6-baad0a09ab7a');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('612c058c-9897-6a99-6cb5-edd66ef7f5f4', 1, '2016-10-17 16:33:58', 'admin', '2016-10-17 16:33:58', null, null, null, '2016-01-19', '2016-03-01', null, 'Development', 'd7701287-004e-30e8-e5f6-baad0a09ab7a');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('553db4f4-b26a-5b41-99c1-39c636ef7b4f', 1, '2016-10-17 16:33:58', 'admin', '2016-10-17 16:33:58', null, null, null, '2016-03-12', '2016-04-05', null, 'Testing and QA', 'd7701287-004e-30e8-e5f6-baad0a09ab7a');


insert into SAMPLER_DATE_TASK_SPAN
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CATEGORY)
values ('975d175b-e07c-0f34-3f8b-07faec59c248', 1, '2016-10-17 16:42:55', 'admin', '2016-10-17 16:42:55', null, null, null, 'Module #4');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('27157932-bd39-d3fa-acb5-80c52da8191b', 1, '2016-10-17 16:42:55', 'admin', '2016-10-17 16:42:55', null, null, null, '2016-01-01', '2016-01-19', '#2f4074', 'Gathering requirements', '975d175b-e07c-0f34-3f8b-07faec59c248');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('fc2ee963-d875-5bc7-1115-91bc05fd8206', 1, '2016-10-17 16:42:55', 'admin', '2016-10-17 16:42:55', null, null, null, '2016-01-19', '2016-02-03', null, 'Producing specifications', '975d175b-e07c-0f34-3f8b-07faec59c248');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('a129aa80-ed07-8a35-7428-dbff5c1a7db9', 1, '2016-10-17 16:42:55', 'admin', '2016-10-17 16:42:55', null, null, null, '2016-03-20', '2016-04-25', null, 'Development', '975d175b-e07c-0f34-3f8b-07faec59c248');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('e3f30242-e6c8-449f-7fd8-38c9f713278a', 1, '2016-10-17 16:42:55', 'admin', '2016-10-17 16:42:55', null, null, null, '2016-04-27', '2016-05-15', null, 'Testing and QA', '975d175b-e07c-0f34-3f8b-07faec59c248');


insert into SAMPLER_DATE_TASK_SPAN
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CATEGORY)
values ('4fc62742-91e2-dead-a1ec-9d7754b6e814', 1, '2016-10-17 16:47:03', 'admin', '2016-10-17 16:47:03', null, null, null, 'Module #5');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('42675573-1b3b-05b8-b81c-ec0f29547aa9', 1, '2016-10-17 16:47:03', 'admin', '2016-10-17 16:47:03', null, null, null, '2016-01-01', '2016-01-12', '#448e4d', 'Gathering requirements', '4fc62742-91e2-dead-a1ec-9d7754b6e814');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('99fed0c6-0d61-1395-469f-869fb47bcad7', 1, '2016-10-17 16:47:03', 'admin', '2016-10-17 16:47:03', null, null, null, '2016-01-12', '2016-01-19', null, 'Producing specifications', '4fc62742-91e2-dead-a1ec-9d7754b6e814');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('ec63b897-0396-99f6-8326-cf470214305e', 1, '2016-10-17 16:47:03', 'admin', '2016-10-17 16:47:03', null, null, null, '2016-01-19', '2016-03-01', null, 'Development', '4fc62742-91e2-dead-a1ec-9d7754b6e814');

insert into SAMPLER_DATE_SEGMENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, START_, END_, COLOR, TASK_, TASK_SPAN_ID)
values ('42a3792e-42a9-bc3b-a756-8de7d375ca15', 1, '2016-10-17 16:47:03', 'admin', '2016-10-17 16:47:03', null, null, null, '2016-03-08', '2016-03-30', null, 'Testing and QA', '4fc62742-91e2-dead-a1ec-9d7754b6e814');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('0ab34f04-41cc-2278-55dc-32c702a5acac', 1, '2016-10-19 16:47:03', 'admin', '2016-10-19 16:47:03', null, null, null, 'Planning', null, '2016-10-04 13:00:00', '2016-10-04 12:00:00', 'event-red');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('195f87ce-bc9c-98ae-c822-3052a0b6dd18', 6, '2016-10-18 10:47:43', 'admin', '2016-10-19 18:05:10', 'admin', null, null, 'Appointment', 'A longer description', '2016-10-18 12:00:00', '2016-10-20 20:00:00', 'event-green');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('24ce7594-7086-e142-d333-7ee567f6b2aa', 4, '2016-10-18 11:15:21', 'admin', '2016-10-19 16:05:11', 'admin', null, null, 'Training', null, '2016-10-07 00:00:00', '2016-10-13 00:00:00', 'event-yellow');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('31d1297b-2309-5cea-9cc6-1bd5f256786b', 1, '2016-10-19 17:07:07', 'admin', '2016-10-19 17:07:07', null, null, null, 'Company activities', null, '2016-10-14 18:00:00', '2016-10-14 09:00:00', null);

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('369ceb55-69a1-47e4-30bb-949d98c95f1e', 1, '2016-10-19 16:46:12', 'admin', '2016-10-19 16:46:12', null, null, null, 'Research', null, '2016-10-21 17:00:00', '2016-10-21 15:00:00', null);

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('407e73a9-9aa9-421d-dbdb-1e1c47a2786b', 3, '2016-10-18 12:34:19', 'admin', '2016-10-19 16:01:06', 'admin', null, null, 'Free time', 'Time for some different stuff', '2016-10-19 06:00:00', '2016-10-19 12:00:00', 'event-blue');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('52de207d-e8f5-ae71-b29f-f1dbcca41099', 2, '2016-10-18 12:35:09', 'admin', '2016-10-19 16:01:14', 'admin', null, null, 'Breakfast', 'Breakfast with John Doe', '2016-10-19 09:00:00', '2016-10-19 10:00:00', 'event-yellow');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('8d30ec01-ed5a-1fad-5e90-8af379c92f72', 3, '2016-10-18 10:51:39', 'admin', '2016-10-19 13:33:00', 'admin', null, null, 'Meeting with John Doe', 'Unknown meeting', '2016-10-03 00:00:00', '2016-10-08 00:00:00', 'event-red');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('c1648a0d-23f7-2e75-3db7-6e9466735959', 1, '2016-10-19 17:05:32', 'admin', '2016-10-19 17:05:32', null, null, null, 'Interview', 'Job interview', '2016-10-21 17:00:00', '2016-10-21 15:00:00', 'event-green');

insert into SAMPLER_CALENDAR_EVENT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, CAPTION, DESCRIPTION, START_DATE, END_DATE, STYLENAME)
values ('f1a0c8a1-d122-b3c6-f88f-fad62fe85fa9', 1, '2016-10-19 16:49:05', 'admin', '2016-10-19 16:49:05', null, null, null, 'Meeting', 'Meeting with lawyer', '2016-10-17 13:00:00', '2016-10-17 12:00:00', 'event-blue');

------------------------------------------------------------------------------------------------------------

insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.99, 1.01, 'female', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.34, 1.66, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 21.01, 3.5, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 23.68, 3.31, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.59, 3.61, 'female', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.29, 4.71, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 8.77, 2.0, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 26.88, 3.12, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.04, 1.96, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.78, 3.23, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.27, 1.71, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 35.26, 5.0, 'female', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.42, 1.57, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.43, 3.0, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.83, 3.02, 'female', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 21.58, 3.92, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.33, 1.67, 'female', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.29, 3.71, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.97, 3.5, 'female', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.65, 3.35, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.92, 4.08, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.29, 2.75, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.77, 2.23, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 39.42, 7.58, 'male', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.82, 3.18, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.81, 2.34, 'male', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.37, 2.0, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.69, 2.0, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 21.7, 4.3, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.65, 3.0, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 9.55, 1.45, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.35, 2.5, 'male', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.06, 3.0, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.69, 2.45, 'female', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.78, 3.27, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.06, 3.6, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.31, 2.0, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.93, 3.07, 'female', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.69, 2.31, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 31.27, 5.0, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.04, 2.24, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.46, 2.54, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.94, 3.06, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 9.68, 1.32, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 30.4, 5.6, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.29, 3.0, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.23, 5.0, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 32.4, 6.0, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 28.55, 2.05, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.04, 3.0, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.54, 2.5, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.29, 2.6, 'female', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 34.81, 5.2, 'female', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 9.94, 1.56, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.56, 4.34, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.49, 3.51, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 38.01, 3.0, 'male', true, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 26.41, 1.5, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.24, 1.76, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 48.27, 6.73, 'male', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.29, 3.21, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.81, 2.0, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.02, 1.98, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.29, 3.76, 'male', true, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.59, 2.64, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.08, 3.15, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.45, 2.47, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 3.07, 1.0, 'female', true, 'sat', 'dinner', 1);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.23, 2.01, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.01, 2.09, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.02, 1.97, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.07, 3.0, 'female', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 26.86, 3.14, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.28, 5.0, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.73, 2.2, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.51, 1.25, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.92, 3.08, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 27.2, 4.0, 'male', false, 'thu', 'lunch', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.76, 3.0, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.29, 2.71, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.44, 3.0, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.66, 3.4, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.07, 1.83, 'female', false, 'thu', 'lunch', 1);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 32.68, 5.0, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.98, 2.03, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 34.83, 5.17, 'female', false, 'thu', 'lunch', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.03, 2.0, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.28, 4.0, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.71, 5.85, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 21.16, 3.0, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 28.97, 3.0, 'male', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.49, 3.5, 'male', false, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 5.75, 1.0, 'female', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.32, 4.3, 'female', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.75, 3.25, 'female', false, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 40.17, 4.73, 'male', true, 'fri', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 27.28, 4.0, 'male', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.03, 1.5, 'male', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 21.01, 3.0, 'male', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.46, 1.5, 'male', false, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.35, 2.5, 'female', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.38, 3.0, 'female', true, 'fri', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 44.3, 2.5, 'female', true, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.42, 3.48, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.92, 4.08, 'female', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.36, 1.64, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.49, 4.06, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.21, 4.29, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.24, 3.76, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.31, 4.0, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.0, 3.0, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 7.25, 1.0, 'female', false, 'sat', 'dinner', 1);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 38.07, 4.0, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 23.95, 2.55, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.71, 4.0, 'female', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.31, 3.5, 'female', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 29.93, 5.07, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.65, 1.5, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.43, 1.8, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.08, 2.92, 'female', false, 'thu', 'lunch', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.69, 2.31, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.42, 1.68, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.26, 2.5, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.95, 2.0, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.48, 2.52, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 29.8, 4.2, 'female', false, 'thu', 'lunch', 6);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 8.52, 1.48, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.52, 2.0, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.38, 2.0, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.82, 2.18, 'male', false, 'thu', 'lunch', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.08, 1.5, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.27, 2.83, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.17, 1.5, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.26, 2.0, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.26, 3.25, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 8.51, 1.25, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.33, 2.0, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.15, 2.0, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.0, 2.0, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.16, 2.75, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.47, 3.5, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 34.3, 6.7, 'male', false, 'thu', 'lunch', 6);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 41.19, 5.0, 'male', false, 'thu', 'lunch', 5);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 27.05, 5.0, 'female', false, 'thu', 'lunch', 6);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.43, 2.3, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 8.35, 1.5, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.64, 1.36, 'female', false, 'thu', 'lunch', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.87, 1.63, 'female', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 9.78, 1.73, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 7.51, 2.0, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.07, 2.5, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.13, 2.0, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.26, 2.74, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.55, 2.0, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.77, 2.0, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 29.85, 5.14, 'female', false, 'sun', 'dinner', 5);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 48.17, 5.0, 'male', false, 'sun', 'dinner', 6);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.0, 3.75, 'female', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.39, 2.61, 'female', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.49, 2.0, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 21.5, 3.5, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.66, 2.5, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.21, 2.0, 'female', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.81, 2.0, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.51, 3.0, 'female', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.52, 3.48, 'male', false, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.76, 2.24, 'male', false, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 31.71, 4.5, 'male', false, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.59, 1.61, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.63, 2.0, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 50.81, 10.0, 'male', true, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.81, 3.16, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 7.25, 5.15, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 31.85, 3.18, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.82, 4.0, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 32.9, 3.11, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.89, 2.0, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 14.48, 2.0, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 9.6, 4.0, 'female', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 34.63, 3.55, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 34.65, 3.68, 'male', true, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 23.33, 5.65, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 45.35, 3.5, 'male', true, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 23.17, 6.5, 'male', true, 'sun', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 40.55, 3.0, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.69, 5.0, 'male', false, 'sun', 'dinner', 5);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.9, 3.5, 'female', true, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 30.46, 2.0, 'male', true, 'sun', 'dinner', 5);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.15, 3.5, 'female', true, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 23.1, 4.0, 'male', true, 'sun', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.69, 1.5, 'male', true, 'sun', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 19.81, 4.19, 'female', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 28.44, 2.56, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.48, 2.02, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.58, 4.0, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 7.56, 1.44, 'male', false, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.34, 2.0, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 43.11, 5.0, 'female', true, 'thu', 'lunch', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.0, 2.0, 'female', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.51, 2.0, 'male', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.71, 4.0, 'male', true, 'thu', 'lunch', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.74, 2.01, 'female', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.0, 2.0, 'female', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.4, 2.5, 'female', true, 'thu', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.53, 4.0, 'male', true, 'thu', 'lunch', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.47, 3.23, 'female', true, 'thu', 'lunch', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 26.59, 3.41, 'male', true, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 38.73, 3.0, 'male', true, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.27, 2.03, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.76, 2.23, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 30.06, 2.0, 'male', true, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 25.89, 5.16, 'male', true, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 48.33, 9.0, 'male', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.27, 2.5, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 28.17, 6.5, 'female', true, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.9, 1.1, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 28.15, 3.0, 'male', true, 'sat', 'dinner', 5);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.59, 1.5, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 7.74, 1.44, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 30.14, 3.09, 'female', true, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.16, 2.2, 'male', true, 'fri', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.42, 3.48, 'female', true, 'fri', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 8.58, 1.92, 'male', true, 'fri', 'lunch', 1);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.98, 3.0, 'female', false, 'fri', 'lunch', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.42, 1.58, 'male', true, 'fri', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 16.27, 2.5, 'female', true, 'fri', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.09, 2.0, 'female', true, 'fri', 'lunch', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 20.45, 3.0, 'male', false, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 13.28, 2.72, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.12, 2.88, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 24.01, 2.0, 'male', true, 'sat', 'dinner', 4);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.69, 3.0, 'male', true, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 11.61, 3.39, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.77, 1.47, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 15.53, 3.0, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 10.07, 1.25, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 12.6, 1.0, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 32.83, 1.17, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 35.83, 4.67, 'female', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 29.03, 5.92, 'male', false, 'sat', 'dinner', 3);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 27.18, 2.0, 'female', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 22.67, 2.0, 'male', true, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 17.82, 1.75, 'male', false, 'sat', 'dinner', 2);
insert into SAMPLER_TIP_INFO
(ID, VERSION, CREATE_TS, CREATED_BY, TOTAL_BILL, TIP, SEX, SMOKER, DAY_, TIME_, SIZE_)
values (NEWID(), 1, current_timestamp, 'admin', 18.78, 3.0, 'female', false, 'thu', 'dinner', 2);

------------------------------------------------------------------------------------------------------------
