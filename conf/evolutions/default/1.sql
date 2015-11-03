# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table allowablevalue (
  id                            varchar(40) not null,
  display_text                  varchar(255),
  code                          varchar(255),
  constraint pk_allowablevalue primary key (id)
);

create table allowablevaluerange (
  id                            varchar(40) not null,
  constraint pk_allowablevaluerange primary key (id)
);

create table observationtemplate (
  id                            varchar(40) not null,
  constraint pk_observationtemplate primary key (id)
);


# --- !Downs

drop table if exists allowablevalue cascade;

drop table if exists allowablevaluerange cascade;

drop table if exists observationtemplate cascade;

