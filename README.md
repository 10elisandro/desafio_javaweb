# **Bem vindo ao Projeto Java Web!**

* CRUD de Produtos.
* Maven Project.
* Servlet.
* JSP.
* CSS.
* Apache Tomcat 7.
* Banco de Dados PostgreSQL.
* Testes automatizados JUnit.

SQL para criar seu banco:
```sql
CREATE DATABASE COLOQUE_NOME_DO_SEU_BANCO
        WITH 
        OWNER = javaweb
        ENCODING = 'UTF8'
        LC_COLLATE = 'pt_BR.UTF-8'
        LC_CTYPE = 'pt_BR.UTF-8'
        TABLESPACE = pg_default
        CONNECTION LIMIT = -1;
```    
SQL para criar schema e dar permissões ao usuário no banco criado:
```sql
CREATE SCHEMA projeto;
ALTER DATABASE COLOQUE_NOME_DO_SEU_BANCO
    SET search_path TO 'projeto';

GRANT ALL ON SCHEMA projeto TO javaweb;
GRANT ALL ON DATABASE COLOQUE_NOME_DO_SEU_BANCO TO javaweb;
```
