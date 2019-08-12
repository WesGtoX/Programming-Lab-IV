CREATE TABLE tb_curso(
	id SERIAL PRIMARY KEY,
	nome varchar(60),
	sigla varchar(10)
);

CREATE TABLE tb_aluno(
	id SERIAL PRIMARY KEY,
	id_curso integer NOT NULL,
	nome varchar(60),
-- 	Referenciar tabelas:
	CONSTRAINT aluno_curso_fkey FOREIGN KEY (id_curso)
		REFERENCES tb_curso (id)
);
