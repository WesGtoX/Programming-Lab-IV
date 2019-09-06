-- create table 'tb_cliente'
CREATE TABLE tb_cliente (
 	id SERIAL PRIMARY KEY,
 	nome varchar(255) default NULL,
 	telefone varchar(100) default NULL,
 	email varchar(255) default NULL,
 	ativo boolean
);

-- create table 'tb_usuario'
CREATE TABLE tb_usuario (
	id SERIAL PRIMARY KEY,
	login varchar(100),
	senha varchar(32),
	ativo boolean
);


INSERT TO tb_usuario (login,senha,ativo) VALUES ('jose',MD5('password'), 'true');

SELECT * FROM tb_usuario;

SELECT * FROM tb_usuario WHERE login='joao' AND senha=MD5('1234567');