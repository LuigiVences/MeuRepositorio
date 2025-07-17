CREATE TABLE permissoes (
	id serial NOT NULL,
	nome varchar(100) UNIQUE NOT NULL,
	descricao varchar,
	data_criacao timestamp NULL,
	ativo boolean DEFAULT TRUE NULL,
	data_desativacao timestamp NULL,
	CONSTRAINT permissoes_pk PRIMARY KEY (id)
);