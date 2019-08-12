-- INSERÇÃO DE DADOS NA TABELA tb_curso
INSERT INTO tb_curso (nome, sigla) values ('Engenharia da Computação', 'ENGCOMP');
INSERT INTO tb_curso (nome, sigla) values ('Nutrição', 'NUTRI');
INSERT INTO tb_curso (nome, sigla) values ('Direito', 'DIR');


-- RECUPERAR TODOS os registros da tabela tb_curso
SELECT * FROM tb_curso;


-- RECUPERAR apenas os nomes dos cursos
SELECT nome FROM tb_curso;
SELECT id,nome FROM tb_curso;


-- RECUPERAR os registros do cursos de maneira ORDENADA
SELECT * FROM tb_curso ORDER BY nome;
-- Default 'asc (crescente)'
SELECT * FROM tb_curso ORDER BY nome asc;
-- 'desc (decrescente)'
SELECT * FROM tb_curso ORDER BY nome desc;


-- ATUALIZAR os dados de um registro
UPDATE tb_curso SET nome='Farmácia', sigla='FARM' WHERE id=3;
SELECT * FROM tb_curso WHERE id=3;
UPDATE tb_curso SET nome='Engenharia Aeronáutica', sigla='ENGAERO' WHERE id=1;
SELECT * FROM tb_curso WHERE id=1;


-- DELETAR Um registro
DELETE FROM tb_curso WHERE id=2;
SELECT * FROM tb_curso WHERE id=2;

-- UPDATE SEM WHERE
UPDATE tb_curso SET nome='NA FACULDADE PODE (ENGCOMP)';

-- DELETAR tabela tb_curso
-- DROP TABLE tb_curso;


-- INSERÇÃO de um novo aluno
INSERT INTO tb_aluno (id_curso,nome) VALUES (1, 'João da Silva');
INSERT INTO tb_aluno (id_curso,nome) VALUES (2, 'José Antônio');
INSERT INTO tb_aluno (id_curso,nome) VALUES (3, 'Carlos Fernando');
INSERT INTO tb_aluno (id_curso,nome) VALUES (100, 'Ana Maria');


-- JUNÇÃO de dados de duas tabelas
SELECT a.nome, c.nome FROM tb_aluno as a INNER JOIN tb_curso as c ON (a.id_curso = c.id);
SELECT * FROM tb_aluno as a INNER JOIN tb_curso as c ON (a.id_curso = c.id);


SELECT * FROM tb_curso ORDER BY id;
SELECT * FROM tb_aluno ORDER BY id;








