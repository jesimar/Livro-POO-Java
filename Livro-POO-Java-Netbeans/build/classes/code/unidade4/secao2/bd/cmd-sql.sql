-- Código 4.9
CREATE DATABASE `bd_empresa`;

-- Código 4.10
CREATE TABLE `bd_empresa`.`clientes`(
    `nome` VARCHAR(100) DEFAULT NULL,
    `idade` INT(4) DEFAULT NULL,
    `profissao` VARCHAR(100) DEFAULT NULL,
    `cidade` VARCHAR(100) DEFAULT NULL,
    `estado` VARCHAR(100) DEFAULT NULL,
    `codigo` INT(10) NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(`codigo`)
) ENGINE = INNODB AUTO_INCREMENT = 28 DEFAULT CHARSET = latin1;

-- Código 4.11
INSERT INTO `bd_empresa`.`clientes`(
    `nome`, `idade`, `profissao`, `cidade`, `estado`
)
VALUES(
    'Adriano', 56, 'Escritor', 'Rio de Janeiro', 'Rio de Janeiro'
),(
    'Barbara', 34, 'Médica', 'Belo Horizonte', 'Minas Gerais'
),(
    'João', 18, 'Estudante', 'São Paulo', 'São Paulo'
),(
    'Márcio', 22, 'Jornalista', 'São Carlos', 'São Paulo'
),(
    'Renata', 37, 'Professora', 'Florianópolis', 'Santa Catarina'
);

-- Código 4.13
CREATE DATABASE `bd_simulador_robo`;

CREATE TABLE `bd_simulador_robo`.`rota`(
    `posx` DECIMAL(10) DEFAULT NULL,
    `posy` DECIMAL(10) DEFAULT NULL,
    `codigo` INT(10) NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(`codigo`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = latin1;