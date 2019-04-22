 -- Keyspace
CREATE KEYSPACE sample_keyspace 
            WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'} 
            AND durable_writes = true;
 
 -- User table
 
CREATE TABLE sample_keyspace.user (
    cpf text,
    name text,
    domain text,
    PRIMARY KEY (cpf));


INSERT INTO sample_keyspace.user(cpf,name,domain)VALUES ('41540790851','Julio','IT');
INSERT INTO sample_keyspace.user(cpf,name,domain) VALUES('41540790852','Teste','IT');
INSERT INTO sample_keyspace.user(cpf,name,domain) VALUES('41540790853','Teste3','IT');
INSERT INTO sample_keyspace.user(cpf,name,domain) VALUES('41540790854','Teste4','IT');
INSERT INTO sample_keyspace.user(cpf,name,domain) VALUES('41540790855','Teste5','IT');
INSERT INTO sample_keyspace.user(cpf,name,domain) VALUES('41540790856','Teste6','IT');
INSERT INTO sample_keyspace.user(cpf,name,domain) VALUES('41540790857','Teste7','IT');

