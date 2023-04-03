CREATE DATABASE booking;

create table if not exists hotel
(
    id             bigint not null,
    created_by     uuid,
    created_time   timestamp(6),
    updated_by     uuid,
    updated_time   timestamp(6),
    uuid           uuid,
    address        varchar(255),
    check_in_time  time,
    check_out_time time,
    description    varchar(255),
    email          varchar(255),
    location       varchar(255),
    name           varchar(255),
    phone_number   varchar(255),
    star_rating    varchar(255),
    constraint hotel_pkey
    primary key (id),
    constraint uk_ibaagihbr8v83bey693hy4lp6
    unique (uuid)
);

create table if not exists room_type
(
    id            bigint not null,
    created_by    uuid,
    created_time  timestamp(6),
    updated_by    uuid,
    updated_time  timestamp(6),
    uuid          uuid,
    base_price    numeric(38, 2),
    description   varchar(255),
    max_occupancy integer,
    name          varchar(255),
    constraint room_type_pkey
    primary key (id),
    constraint uk_e0yg577wkp14qsyff9i2k4g8n
    unique (uuid),
    constraint uk_q0y2xl90orh60g19v627mraij
    unique (name)
);

create table if not exists room
(
    id           bigint not null,
    created_by   uuid,
    created_time timestamp(6),
    updated_by   uuid,
    updated_time timestamp(6),
    uuid         uuid,
    amenities    varchar(255),
    image        varchar(255),
    room_number  varchar(255),
    status       varchar(255),
    hotel_id     bigint,
    room_type_id bigint,
    constraint room_pkey
    primary key (id),
    constraint uk_hrao8rlbvufjarn3u81svvyir
    unique (uuid),
    constraint fkdosq3ww4h9m2osim6o0lugng8
    foreign key (hotel_id) references hotel,
    constraint fkd468eq7j1cbue8mk20qfrj5et
    foreign key (room_type_id) references room_type
);

create table if not exists booking
(
    id                 bigint not null,
    created_by         uuid,
    created_time       timestamp(6),
    updated_by         uuid,
    updated_time       timestamp(6),
    uuid               uuid,
    check_in_date      timestamp(6),
    check_out_date     timestamp(6),
    discount_uuid      varchar(255),
    location           varchar(255),
    passenger_count    integer,
    point_uuid         varchar(255),
    price              numeric(38, 2),
    promotion_usage_id varchar(255),
    quantity           integer,
    special_requests   varchar(255),
    total_amount       numeric(38, 2),
    total_price        numeric(38, 2),
    room_id            bigint,
    constraint booking_pkey
    primary key (id),
    constraint uk_4px8ptbcntfao9p83pj6n4o73
    unique (uuid),
    constraint fkq83pan5xy2a6rn0qsl9bckqai
    foreign key (room_id) references room
);

create table if not exists payment
(
    id             bigint not null,
    created_by     uuid,
    created_time   timestamp(6),
    updated_by     uuid,
    updated_time   timestamp(6),
    uuid           uuid,
    is_refunded    boolean,
    payment_method smallint,
    room_number    varchar(255),
    status         smallint,
    total_price    numeric(38, 2),
    booking_id     bigint,
    constraint payment_pkey
    primary key (id),
    constraint uk_q6sfq29gka19qpk8k55hmudwi
    unique (uuid),
    constraint fkqewrl4xrv9eiad6eab3aoja65
    foreign key (booking_id) references booking
);

