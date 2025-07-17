CREATE TABLE papeis (
	id serial NOT NULL,
	nome varchar(50) UNIQUE NOT NULL,
	data_criacao timestamp NULL,
	ativo boolean DEFAULT TRUE NULL,
	data_desativacao timestamp NULL,
	CONSTRAINT papeis_pk PRIMARY KEY (id)
);