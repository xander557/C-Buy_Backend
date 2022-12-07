# C-Buy_Backend
[![Build Status](https://app.travis-ci.com/akshay685/C_Buy.svg?token=4NjEXWzi36dquasa7Mrf&branch=main)](https://app.travis-ci.com/akshay685/C_Buy)


DB automation:
create table produce
(
    id          int auto_increment
        primary key
        unique,
    name        varchar(1000) not null,
    description varchar(1000) not null,
    stock       int           not null,
    photo       varchar(1000) not null
);



