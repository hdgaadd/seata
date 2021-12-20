/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     20/12/2021 12:49:58 pm                       */
/*==============================================================*/


drop table if exists account;

drop table if exists order_main;

/*==============================================================*/
/* Table: account                                               */
/*==============================================================*/
create table account
(
   id                   bigint(20) not null,
   user_id              bigint(20),
   balance              decimal(10,2),
   comment              varchar(500),
   primary key (id)
);

/*==============================================================*/
/* Table: order_main                                            */
/*==============================================================*/
create table order_main
(
   id                   bigint(20) not null,
   code                 varchar(100),
   user_id              bigint(20),
   totality             int(11),
   amount               decimal(10,2),
   primary key (id)
);

