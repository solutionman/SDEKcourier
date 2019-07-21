
service mysql start

create schema customer;

# table customer
# id, orderNo, lastName, firstName, middleName, deliveryTime, late

create table customer
(
	id int auto_increment,
	constraint testTable_pk
		primary key (id)
);

ALTER TABLE customer ADD orderNo int NOT NULL;
ALTER TABLE customer ADD lastName VARCHAR(255) NULL;
ALTER TABLE customer ADD firstName VARCHAR(255) NULL;
ALTER TABLE customer ADD middleName VARCHAR(255) NULL;
ALTER TABLE customer ADD lateDelivery VARCHAR(255) NOT NULL DEFAULT 'no' ;

INSERT into customer ( orderNo, lastName, firstName, middleName)
values ( 32, 'Ivanov', 'Kolya', 'Petrovich');

SELECT * FROM customer;


