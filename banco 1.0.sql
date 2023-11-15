create database biblioteca;


create table User_Admin(
    Nome varchar(100),
    Idade int (10),
    CPF int(100),
    Sexo char(50), 
    ID int(100),
    Senha varchar(100) primary key not null
);

create table User_Comum(
    Nome varchar(100),
    Idade int (10),
    Sexo char(50), 
    Favoritos varchar(100),
    ID int(100),
    Senha varchar(100) primary key not null
);

create table Livros(
    Titulo varchar(100),
    Tipo varchar(100),
    Classificacao varchar(100),
    Autor varchar(100) primary key not null
);

create table Romance(
    Titulo varchar(100),
    Classificacao varchar(100),
    Autor varchar(100) primary key not null
);

create table Ficcao(
    Titulo varchar(100),
    Classificacao varchar(100),
    Autor varchar(100) primary key not null
);

create table Tecnico(
    Titulo varchar(100),
    Classificacao varchar(100),
    Autor varchar(100) primary key not null
);
