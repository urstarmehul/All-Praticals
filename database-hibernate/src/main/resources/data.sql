create table person
(
id integer not null,
name varchar (255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

insert into person (id, name, location, birth_date) values(101,'Mehul','Patna',sysdate());
insert into person (id, name, location, birth_date) values(102,'Shivam','Delhi',sysdate());
