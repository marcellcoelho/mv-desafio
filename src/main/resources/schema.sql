DROP TABLE IF EXISTS CNES;
CREATE TABLE CNES AS SELECT * FROM CSVREAD('classpath:cnes_ativo.csv');
