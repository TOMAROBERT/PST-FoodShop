create database projPST;
use projPST;

create table client(
	UserID int not null auto_increment,
    primary key (UserID),
    Email varchar(20),
    Parola varchar(20),
    Telefon int(10)
);

create table destination(
	AdressID int not null auto_increment,
    primary key (AdressID),
    Adresa varchar(20),
    Locatie varchar (20)
);

create table foodMenu(
	FoodID int not null auto_increment,
    primary key(FoodID),
    DenumireProd varchar(20),
    Ingrediente varchar(20),
    Pret int
);

create table foodOrder(
	OrderID int not null auto_increment,
    primary key(OrderID),
    Produse varchar(20),
    Cantitate int
);

create table feedback(
	FeedbackID int not null auto_increment,
    primary key(FeedbackID),
    Apreciere int,
    Detalii varchar(40)
);