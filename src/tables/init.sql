CREATE TABLE Cliente
(
    id            SERIAL PRIMARY KEY,
    nome          VARCHAR(150) NOT NULL,
    cpf           CHAR(11)     NOT NULL,
    data_cadastro DATE
);

CREATE TABLE Servico
(
    id                SERIAL PRIMARY KEY,
    descricao_servico VARCHAR(255)   NOT NULL,
    id_cliente        INT REFERENCES Cliente (id),
    valor             NUMERIC(15, 2) NOT NULL
);