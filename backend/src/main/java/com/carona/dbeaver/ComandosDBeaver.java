package com.carona.dbeaver;

public class ComandosDBeaver {
	/*
	CREATE TABLE usuarios (
    id_usuario int NOT NULL AUTO_INCREMENT,
    nome varchar(255) DEFAULT NULL,
    reputacao int DEFAULT NULL,
    email varchar(255) DEFAULT NULL,
    senha varchar(255) DEFAULT NULL,
    PRIMARY KEY (id_usuario),
    UNIQUE KEY email (email)
    );

    CREATE TABLE PontosFixos (
        id_ponto_fixo INT PRIMARY KEY,
        nome VARCHAR(255)
    );

    CREATE TABLE Viagens (
        id_viagem INT AUTO_INCREMENT,
        PRIMARY KEY (id_viagem),
        
        local_partida VARCHAR(255),
        local_destino VARCHAR(255),
        data_partida DATE,
        hora_partida TIME,
        quantidade_passageiros INT,
        
        id_ponto_fixo INT,
        FOREIGN KEY (id_ponto_fixo) REFERENCES PontosFixos(id_ponto_fixo),
        
        id_veiculo INT,
        FOREIGN KEY (id_veiculo) REFERENCES Veiculos(id_veiculo),
        
        id_motorista INT,
        FOREIGN KEY (id_motorista) REFERENCES Usuarios(id_usuario)
    );

    CREATE TABLE Passageiros (
        id_passageiro INT PRIMARY KEY,
        id_viagem INT,
        FOREIGN KEY (id_passageiro) REFERENCES Usuarios(id_usuario),
        FOREIGN KEY (id_viagem) REFERENCES Viagens(id_viagem)
    );

    create table Veiculos (
        id_veiculo INT primary key AUTO_INCREMENT,
        id_usuario INT not NULL,
        marca varchar(255) DEFAULT NULL,
        modelo varchar(255) DEFAULT NULL,
        cor varchar(255) DEFAULT NULL,
        placa varchar(255) DEFAULT NULL,
        cnh varchar(255) DEFAULT NULL,
        FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario)
    );

    CREATE PROCEDURE eventos.verificar_email(
        IN p_email VARCHAR(255),
        OUT existe BOOLEAN
    )
    BEGIN
        SELECT EXISTS(SELECT 1 FROM usuarios WHERE email = p_email) INTO existe;
    END;
	 */

}
