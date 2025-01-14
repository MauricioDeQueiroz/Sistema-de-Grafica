CREATE DATABASE SistemaGrafica;
USE SistemaGrafica;

CREATE TABLE clientes (
id_cliente INT primary key,
nm_nome VARCHAR(100) NOT NULL,
nu_telefone VARCHAR(15),
de_email VARCHAR(100),
de_endereco VARCHAR(255)
);

CREATE TABLE produtos (
id_produto INT AUTO_INCREMENT PRIMARY KEY,
nm_nome VARCHAR(100) NOT NULL,
de_descricao TEXT,
vl_preco DECIMAL(10,2) NOT NULL,
qnt_estoque INT NOT NULL
);

CREATE TABLE servicos (
id_servico INT  PRIMARY KEY,
nm_nome VARCHAR(100) NOT NULL,
de_descricao TEXT,
vl_preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE vendas(
id_venda int primary key,
data_venda DATETIME DEFAULT CURRENT_TIMESTAMP,
vl_total DECIMAL (10,2) NOT NULL,
id_cliente INT,
foreign key (id_cliente) references clientes(id_cliente)
);

CREATE TABLE vendas_itens (
id_venda_item INT PRIMARY KEY,
qnt_quantidade INT NOT NULL,
preco_unitario DECIMAL(10,2) NOT NULL,
id_venda INT,
id_produto INT,
id_servico INT,
FOREIGN KEY (id_venda) REFERENCES vendas(id_venda),
FOREIGN KEY (id_produto) REFERENCES produtos(id_produto),
FOREIGN KEY (id_servico) REFERENCES servicos(id_servico)
);

describe produtos;

SELECT * FROM produtos;


    



