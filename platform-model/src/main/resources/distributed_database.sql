create schema basic_platform_0 collate utf8mb4_0900_ai_ci;
grant alter, alter routine, create, create routine, create temporary tables, create view, delete, drop, event, execute, index, insert, lock tables, references, select, show view, trigger, update, grant option on basic_platform_0.* to your;

create schema basic_platform_1 collate utf8mb4_0900_ai_ci;
grant alter, alter routine, create, create routine, create temporary tables, create view, delete, drop, event, execute, index, insert, lock tables, references, select, show view, trigger, update, grant option on basic_platform_1.* to your;


create table t_order
(
    id         bigint           not null comment '主键id',
    company_id bigint default 0 not null comment '企业id',
    order_sn   varchar(64)      null comment '订单号',
    remark     varchar(255)     null comment '备注',
    primary key (id),
    key idx_company_id (company_id)
) comment '订单表';

create table t_order_0
(
    id         bigint           not null comment '主键id',
    company_id bigint default 0 not null comment '企业id',
    order_sn   varchar(64)      null comment '订单号',
    remark     varchar(255)     null comment '备注',
    primary key (id),
    key idx_company_id (company_id)
) comment '订单表';

create table t_order_1
(
    id         bigint           not null comment '主键id',
    company_id bigint default 0 not null comment '企业id',
    order_sn   varchar(64)      null comment '订单号',
    remark     varchar(255)     null comment '备注',
    primary key (id),
    key idx_company_id (company_id)
) comment '订单表';

create table t_order_item
(
    id         bigint           not null comment '主键id',
    company_id bigint default 0 not null comment '企业id',
    order_id   bigint           not null comment '订单id',
    item_name  varchar(64)      not null comment '商品名称',
    remark     varchar(255)     null comment '备注',
    primary key (id),
    key idx_company_id (company_id),
    key idx_order_id (order_id)
) comment '订单商品表';

create table t_order_item_0
(
    id         bigint           not null comment '主键id',
    company_id bigint default 0 not null comment '企业id',
    order_id   bigint           not null comment '订单id',
    item_name  varchar(64)      not null comment '商品名称',
    remark     varchar(255)     null comment '备注',
    primary key (id),
    key idx_company_id (company_id),
    key idx_order_id (order_id)
) comment '订单商品表';

create table t_order_item_1
(
    id         bigint           not null comment '主键id',
    company_id bigint default 0 not null comment '企业id',
    order_id   bigint           not null comment '订单id',
    item_name  varchar(64)      not null comment '商品名称',
    remark     varchar(255)     null comment '备注',
    primary key (id),
    key idx_company_id (company_id),
    key idx_order_id (order_id)
) comment '订单商品表';
