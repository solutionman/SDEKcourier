
service mysql start

create schema customer;

# table customer
# id, orderNo, lastName, firstName, middleName, lateDelivery, deliveryTime, address, phone 

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
ALTER TABLE customer ADD deliveryTime timestamp null;
ALTER TABLE customer ADD address VARCHAR(255) NULL ;
ALTER TABLE customer ADD phone VARCHAR(255) NULL ;
ALTER TABLE customer ADD lateTaskTime timestamp null;

INSERT into customer ( orderNo, lastName, firstName, middleName, deliveryTime, address, phone)
values ( 32, 'Ivanov', 'Kolya', 'Petrovich', '2019-10-23 17:30:00', 'Svetlaya 12/5','+7-913-484-78-54');

INSERT into customer ( orderNo, lastName, firstName, middleName, deliveryTime, address, phone)
values ( 12, 'Sidorov', 'Michael', 'Alexandrovich', '2019-09-24 12:45:00', 'Ryabova 45/11','+7-913-458-21-45');

INSERT into customer ( orderNo, lastName, firstName, middleName, deliveryTime, address, phone)
values ( 15, 'Petrov', 'Sergey', 'Mihailovich', '2019-09-15 18:30:00', 'Sirenevaya 11/2','+7-123-845-54-65');

SELECT * FROM customer;






