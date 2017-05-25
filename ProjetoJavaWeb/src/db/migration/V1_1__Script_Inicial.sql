CREATE TABLE projeto.clientes
(
    codigo serial NOT NULL,
    idtipo integer NOT NULL,
    nome character varying COLLATE pg_catalog."default",
    telefone character varying COLLATE pg_catalog."default",
    CONSTRAINT clientes_pkey PRIMARY KEY (codigo)
);