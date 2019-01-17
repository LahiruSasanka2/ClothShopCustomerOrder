create database clothShopCustomerOrder;
use clothShopCustomerOrder;

CREATE TABLE Customer (
    cid VARCHAR(30) NOT NULL PRIMARY KEY,
    name varchar(25),
    tell varchar(15)
);

CREATE TABLE Payment (
    pid VARCHAR(30) NOT NULL PRIMARY KEY,
    amount double(65,2),
    custPayAmount double(65,2)
);

CREATE TABLE ClothCategory (
    ccid VARCHAR(30) NOT NULL PRIMARY KEY,
    pe_category VARCHAR(30),
    type VARCHAR(30)
);
CREATE TABLE Cloth (
    clid VARCHAR(30) NOT NULL PRIMARY KEY,
    ccid varchar(255) NOT NULL,
    color VARCHAR(30),
    size VARCHAR(30),
    price double(65,2),
    qty int,
    barCode VARCHAR(30),
    FOREIGN KEY (ccid) REFERENCES ClothCategory(ccid)
);

CREATE TABLE ClothOrder (
    coid VARCHAR(30) NOT NULL PRIMARY KEY,
    cid varchar(255),
    pid varchar(255) NOT NULL,
    qty int,
    barCode VARCHAR(30),
    FOREIGN KEY (cid) REFERENCES Customer(cid),
    FOREIGN KEY (pid) REFERENCES Payment(pid)
);

CREATE TABLE ClothOrderDetail (
    coid varchar(255) NOT NULL,
    clid varchar(255) NOT NULL,
    FOREIGN KEY (coid) REFERENCES ClothOrder(coid),
    FOREIGN KEY (clid) REFERENCES Cloth(clid)
);

insert into payment values('P001',1300.00,2000.00);

INSERT INTO clothcategory VALUES ('CC001', 'Baby', 'Truser');

INSERT INTO cloth VALUES ('CL001', 'CC001', 'red', 'M', '560.00', '3', '1234567890');

insert into clothorder values('CO001','','P001',1,'1234567890');