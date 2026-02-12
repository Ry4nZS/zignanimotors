CREATE TABLE carros (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        modelo VARCHAR(100) NOT NULL,
                        descricao TEXT,
                        ano INT NOT NULL,
                        km DOUBLE NOT NULL,
                        combustivel VARCHAR(30) NOT NULL,
                        cor VARCHAR(50) NOT NULL,
                        finalplaca CHAR(1) NOT NULL,
                        vendido BOOLEAN NOT NULL DEFAULT FALSE
);