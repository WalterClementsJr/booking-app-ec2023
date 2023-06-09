CREATE DATABASE booking;

create table if not exists role
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp,
    updated_by   uuid,
    updated_time timestamp,
    uuid         uuid,
    name         varchar(255),
    constraint role_pkey
    primary key (id),
    constraint uk_k5dwya5n8n7y3m2opvmm7qjcc
    unique (uuid),
    constraint uk_8sewwnpamngi6b1dwaa88askk
    unique (name)
);

create table if not exists privilege
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp,
    updated_by   uuid,
    updated_time timestamp,
    uuid         uuid,
    name         varchar(255),
    role_id      bigint,
    constraint privilege_pkey
    primary key (id),
    constraint uk_hkkbq0189qlql9ss5srnoltsa
    unique (uuid),
    constraint fkf0rapce3kwjefytyv5mmvew8u
    foreign key (role_id) references role
);

create table if not exists booking_role
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp(6),
    updated_by   uuid,
    updated_time timestamp(6),
    uuid         uuid,
    name         varchar(255),
    constraint booking_role_pkey
    primary key (id),
    constraint uk_7mapk338lgfh88mjwxxfnnkif
    unique (uuid),
    constraint uk_ch2a1aj5ohkym3yoxp98t4j4i
    unique (name)
);

create table if not exists booking_privilege
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp(6),
    updated_by   uuid,
    updated_time timestamp(6),
    uuid         uuid,
    name         varchar(255),
    role_id      bigint,
    constraint booking_privilege_pkey
    primary key (id),
    constraint uk_jxrwaqx2xovqp3u206veol0jj
    unique (uuid),
    constraint fk4dctqrk2shxlw9tmhj62bit0y
    foreign key (role_id) references booking_role
);

create table if not exists booking_user
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp(6),
    updated_by   uuid,
    updated_time timestamp(6),
    uuid         uuid,
    birthdate    date,
    disabled     boolean,
    email        varchar(255),
    expired      boolean,
    locked       boolean,
    name         varchar(255),
    password     varchar(255),
    username     varchar(255),
    role_id      bigint,
    constraint booking_user_pkey
    primary key (id),
    constraint uk_a6l54m7i0k4dp4y5numsilq8b
    unique (uuid),
    constraint uk_r013dn70xn5hm2lafr0xfrs0r
    unique (email),
    constraint uk_6a48q9vmlo4rch3fujc44vhil
    unique (username),
    constraint fkfk7auge7sdf8is8u1v2exaweg
    foreign key (role_id) references booking_role
);

create table if not exists address
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp(6),
    updated_by   uuid,
    updated_time timestamp(6),
    uuid         uuid,
    location     varchar(255),
    remark       varchar(255),
    user_id      bigint,
    constraint address_pkey
    primary key (id),
    constraint uk_d9xxuqqydudw061461ufnh3ee
    unique (uuid),
    constraint fk1aef951mbhpqq0jg2j5j97n3c
    foreign key (user_id) references booking_user
);

create table if not exists retailer
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp(6),
    updated_by   uuid,
    updated_time timestamp(6),
    uuid         uuid,
    is_official  boolean,
    name         varchar(255),
    tax_number   varchar(255),
    user_id      bigint,
    constraint retailer_pkey
    primary key (id),
    constraint uk_9hgan2ag729ssig0pitpvvymn
    unique (uuid),
    constraint fk6ms4dnsl3omhxdnjfbesu2i58
    foreign key (user_id) references booking_user
);

