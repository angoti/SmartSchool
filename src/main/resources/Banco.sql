CREATE TABLE `administrador` (
  `cod_adm` int NOT NULL,
  `login` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_adm`),
  KEY `login` (`login`),
  CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`login`) REFERENCES `usuario` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `aluno` (
  `matricula` varchar(14) NOT NULL,
  `nome_mae` varchar(100) DEFAULT NULL,
  `nome_pai` varchar(100) DEFAULT NULL,
  `data_matricula` date NOT NULL,
  `tel_responsavel` int DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `login` (`login`),
  CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`login`) REFERENCES `usuario` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `professor` (
  `cod_professor` int NOT NULL,
  `login` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_professor`),
  KEY `login` (`login`),
  CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`login`) REFERENCES `usuario` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sala` (
  `cod_sala` int NOT NULL,
  `turma` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_sala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usuario` (
  `login` varchar(10) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `rg` int NOT NULL,
  `telefone` int DEFAULT NULL,
  `data_nasc` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` int NOT NULL,
  `endereço` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
