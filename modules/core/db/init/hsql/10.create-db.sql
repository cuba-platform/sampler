-- begin SAMPLER_CUSTOMER
create table SAMPLER_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    LAST_NAME varchar(100) not null,
    AGE integer,
    ACTIVE boolean not null,
    GRADE integer,
    AVATAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLER_CUSTOMER
-- begin SAMPLER_ORDER
create table SAMPLER_ORDER (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    DATE_ date not null,
    AMOUNT decimal(19, 2),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLER_ORDER
-- begin SAMPLER_TASK
create table SAMPLER_TASK (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    DUE_DATE timestamp,
    ASSIGNEE_ID varchar(36),
    PARENT_TASK_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLER_TASK
-- begin SAMPLER_PRODUCT
create table SAMPLER_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end SAMPLER_PRODUCT

-- begin SAMPLER_INVOICE_ITEM
create table SAMPLER_INVOICE_ITEM (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36),
    QUANTITY decimal(19, 3),
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLER_INVOICE_ITEM
-- begin SAMPLER_DATE_VALUE
create table SAMPLER_DATE_VALUE (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date not null,
    VALUE_ integer not null,
    --
    primary key (ID)
)^
-- end SAMPLER_DATE_VALUE
-- begin SAMPLER_TRANSPORT_COUNT
create table SAMPLER_TRANSPORT_COUNT (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    YEAR_ integer not null,
    CARS integer not null,
    MOTORCYCLES integer not null,
    BICYCLES integer not null,
    --
    primary key (ID)
)^
-- end SAMPLER_TRANSPORT_COUNT
-- begin SAMPLER_INCOME_EXPENSES
create table SAMPLER_INCOME_EXPENSES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    YEAR_ integer not null,
    INCOME double precision not null,
    EXPENSES double precision not null,
    ALPHA double precision,
    DASH_LENGTH_LINE integer,
    DASH_LENGTH_COLUMN integer,
    ADDITIONAL varchar(255),
    --
    primary key (ID)
)^-- end SAMPLER_INCOME_EXPENSES
-- begin SAMPLER_COUNTRY_GROWTH
create table SAMPLER_COUNTRY_GROWTH (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY varchar(255) not null,
    YEAR2014 double precision not null,
    YEAR2015 double precision not null,
    --
    primary key (ID)
)^
-- end SAMPLER_COUNTRY_GROWTH
-- begin SAMPLER_POINT_PAIR
create table SAMPLER_POINT_PAIR (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AX double precision not null,
    AY double precision not null,
    BX double precision not null,
    BY_ double precision not null,
    --
    primary key (ID)
)^
-- end SAMPLER_POINT_PAIR
-- begin SAMPLER_COUNTRY_LITRES
create table SAMPLER_COUNTRY_LITRES (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY varchar(255) not null,
    LITRES double precision not null,
    --
    primary key (ID)
)^
-- end SAMPLER_COUNTRY_LITRES
-- begin SAMPLER_TITLE_VALUE
create table SAMPLER_TITLE_VALUE (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    VALUE_ integer not null,
    --
    primary key (ID)
)^
-- end SAMPLER_TITLE_VALUE
-- begin SAMPLER_SEGMENT
create table SAMPLER_SEGMENT (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    START_ integer,
    DURATION integer,
    COLOR varchar(255),
    TASK_ varchar(255),
    TASK_SPAN_ID varchar(36),
    INDEX_ integer,
    --
    primary key (ID)
)^
-- end SAMPLER_SEGMENT
-- begin SAMPLER_TASK_SPAN
create table SAMPLER_TASK_SPAN (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATEGORY varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLER_TASK_SPAN
-- begin SAMPLER_DATE_TASK_SPAN
create table SAMPLER_DATE_TASK_SPAN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATEGORY varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLER_DATE_TASK_SPAN
-- begin SAMPLER_DATE_SEGMENT
create table SAMPLER_DATE_SEGMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    START_ date,
    END_ date,
    COLOR varchar(255),
    TASK_ varchar(255),
    TASK_SPAN_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLER_DATE_SEGMENT
-- begin SAMPLER_CALENDAR_EVENT
create table SAMPLER_CALENDAR_EVENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAPTION varchar(255),
    DESCRIPTION varchar(255),
    START_DATE timestamp,
    END_DATE timestamp,
    STYLENAME varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLER_CALENDAR_EVENT
-- begin SAMPLER_POINT_VALUE
create table SAMPLER_POINT_VALUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    X double precision,
    Y double precision,
    VALUE_ integer,
    --
    primary key (ID)
)^
-- end SAMPLER_POINT_VALUE
-- begin SAMPLER_COLOR
create table SAMPLER_COLOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    HEX varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLER_COLOR
-- begin SAMPLER_TIP_INFO
create table SAMPLER_TIP_INFO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOTAL_BILL decimal(19, 2) not null,
    TIP decimal(19, 2) not null,
    SMOKER boolean not null,
    SIZE_ integer not null,
    SEX varchar(50) not null,
    DAY_ varchar(50) not null,
    TIME_ varchar(50) not null,
    --
    primary key (ID)
)^
-- end SAMPLER_TIP_INFO
-- begin SAMPLER_COUNTRY_SALES
create table SAMPLER_COUNTRY_SALES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT varchar(255),
    CATEGORY varchar(255),
    COUNTRY varchar(255),
    SALES integer,
    EXPENSE integer,
    --
    primary key (ID)
)^
-- end SAMPLER_COUNTRY_SALES
-- begin SAMPLER_EMPLOYEE
create table SAMPLER_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    LAST_NAME varchar(255),
    AGE integer,
    DEPARTMENT integer,
    EXPERIENCE integer,
    SALARY decimal(19, 2),
    --
    primary key (ID)
)^
-- end SAMPLER_EMPLOYEE
-- begin SAMPLER_LOCATION
create table SAMPLER_LOCATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    POINT VARCHAR(100),
    INTENSITY double precision,
    --
    primary key (ID)
)^
-- end SAMPLER_LOCATION
