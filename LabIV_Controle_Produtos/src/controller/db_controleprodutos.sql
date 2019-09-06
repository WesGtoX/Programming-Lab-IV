/**
 * Author:  wesley
 * Created: Aug 15, 2019
 */

-- drop tables id exists
DROP TABLE IF EXISTS tb_produto;
DROP TABLE IF EXISTS tb_categoria;

-- create database tb_categoria
CREATE TABLE tb_categoria(
	id SERIAL PRIMARY KEY,
	nome varchar(50)
);

-- create database tb_produto
CREATE TABLE tb_produto(
	id SERIAL PRIMARY KEY,
	id_categoria integer NOT NULL,
	nome varchar(80),
	valorunitario double precision,
	CONSTRAINT fk_produto_categoria FOREIGN KEY (id_categoria) 
		REFERENCES tb_categoria(id)
);

-- insert data into database tb_categoria
INSERT INTO tb_categoria (nome) VALUES ('Informática');
INSERT INTO tb_categoria (nome) VALUES ('Eletônicos');
INSERT INTO tb_categoria (nome) VALUES ('Papelaria');
INSERT INTO tb_categoria (nome) VALUES ('Beleza');
INSERT INTO tb_categoria (nome) VALUES ('Livros');
INSERT INTO tb_categoria (nome) VALUES ('Perfumaria');
INSERT INTO tb_categoria (nome) VALUES ('Móveis');
INSERT INTO tb_categoria (nome) VALUES ('Celulares');
