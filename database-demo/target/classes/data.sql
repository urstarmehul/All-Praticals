create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

insert into person values(101, 'Mehul', 'Patna', sysdate());
insert into person values(102, 'Prashant', 'Varanasi', sysdate());
insert into person values(103, 'Shivam', 'Delhi', sysdate());
insert into person values(105, 'Mahesh', 'Noida', sysdate());
