CREATE TABLE permissoes_papeis (
	permissao_id INTEGER NOT NULL,
	papel_id INTEGER NOT NULL,
	PRIMARY KEY (permissao_id, papel_id),
	FOREIGN KEY (permissao_id) REFERENCES permissoes(id) ON DELETE CASCADE,
	FOREIGN KEY (papel_id) REFERENCES papeis(id) ON DELETE CASCADE
);