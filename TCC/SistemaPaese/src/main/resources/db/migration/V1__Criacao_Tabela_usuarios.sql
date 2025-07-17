CREATE TABLE usuarios (
	id serial NOT NULL,
	nome varchar(80) NOT NULL,
	login varchar(15) NOT NULL,
	email varchar(60) NOT NULL,
	senha varchar NOT NULL,
	data_criacao timestamp NULL,
	ativo boolean DEFAULT TRUE NULL,
	data_desativacao timestamp NULL,
	CONSTRAINT usuarios_pk PRIMARY KEY (id)
);