-- create database
create schema basic_platform collate utf8mb4_0900_ai_ci;

-- create tables
create table platform_user
(
    id              bigint       not null auto_increment comment '用户主键id',
    company_id      bigint       not null comment '企业id',
    name            varchar(64)  null comment '姓名',
    accountName     varchar(64)  not null comment '账号名',
    accountPassword varchar(64)  not null comment '账号密码',
    comment         varchar(255) null comment '备注',
    primary key (id),
    key idx_account (accountName)
) comment '用户表';

create table platform_company
(
    id           bigint      not null auto_increment comment '主键id',
    company_name varchar(64) not null default '' comment '企业名称',
    primary key (id)
) comment '企业表';