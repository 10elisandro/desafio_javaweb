CREATE TABLE produtos
(
    codigo serial NOT NULL,
    idcategoria integer NOT NULL,
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    descricao character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT produtos_pkey PRIMARY KEY (codigo)
);

insert into produtos(idcategoria, nome, descricao) values(0, 'Computador', 'i7');
insert into produtos(idcategoria, nome, descricao) values(2, 'Casa', '2 andares');
