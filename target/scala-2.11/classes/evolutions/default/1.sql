# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            bigint not null,
  username                      varchar(255),
  email                         varchar(255),
  age                           integer,
  sign_up_date                  bigint,
  constraint pk_user primary key (id)
);
create sequence user_seq;


# --- !Downs

drop table if exists user;
drop sequence if exists user_seq;

