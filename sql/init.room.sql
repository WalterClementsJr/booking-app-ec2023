CREATE DATABASE booking;
create table if not exists hotel
(
    id             bigint not null,
    created_by     uuid,
    created_time   timestamp,
    updated_by     uuid,
    updated_time   timestamp,
    uuid           uuid,
    address        varchar(255),
    check_in_time  time,
    check_out_time time,
    description    varchar(255),
    email          varchar(255),
    location       varchar(255),
    name           varchar(255),
    phone_number   varchar(255),
    star_rating    double precision,
    constraint hotel_pkey
    primary key (id),
    constraint uk_ibaagihbr8v83bey693hy4lp6
    unique (uuid)
);

create table if not exists room_type
(
    id            bigint not null,
    created_by    uuid,
    created_time  timestamp,
    updated_by    uuid,
    updated_time  timestamp,
    uuid          uuid,
    base_price    numeric(12,2),
    description   varchar(255),
    max_occupancy integer,
    name          varchar(255),
    constraint room_type_pkey
    primary key (id),
    constraint uk_e0yg577wkp14qsyff9i2k4g8n
    unique (uuid)
);

create table if not exists room
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp,
    updated_by   uuid,
    updated_time timestamp,
    uuid         uuid,
    amenities    varchar(255),
    image        varchar(255),
    room_number  integer,
    status       varchar(255),
    hotel_id     bigint,
    room_type_id bigint,
    constraint pk_room
    primary key (id),
    constraint uk_uuid
    unique (uuid),
    constraint fk_room_hotel
    foreign key (hotel_id) references hotel,
    constraint fk_room_roomtype
    foreign key (room_type_id) references room_type
);

