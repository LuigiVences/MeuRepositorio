CREATE TABLE usuarios_papeis (
	usuario_id INTEGER NOT NULL,
	papel_id INTEGER NOT NULL,
	nome varchar(100) UNIQUE NOT NULL,
	PRIMARY KEY (usuario_id, papel_id),
	FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE,
	FOREIGN KEY (papel_id) REFERENCES papeis(id) ON DELETE CASCADE
);