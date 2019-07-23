
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

INSERT into customer ( orderNo, lastName, firstName, middleName)
values ( 12, 'Sidorov', 'Michael', 'Alexandrovich');

SELECT * FROM customer;

# table deliveryTimeHistory
# id, customerID, deliveryTime

create table deliveryTimeHistory
(
	id int auto_increment,
	customerID int not null,
	deliveryTime datetime not null,
	constraint deliveryTimeHistory_pk
		primary key (id)
);

alter table deliveryTimeHistory
	add isActual varchar(255) default 'yes' null;


INSERT INTO deliveryTimeHistory (customerID, deliveryTime) VALUES (1, '2019-07-23 17:30:00');
INSERT INTO deliveryTimeHistory (customerID, deliveryTime) VALUES (2, '2019-07-24 12:45:00');

SELECT * FROM deliveryTimeHistory;




