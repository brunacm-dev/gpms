package com.carona.dbeaver;

public class ComandosDBeaver {
	/*
	 -- Procedure para ver o perfil do usuário
CREATE PROCEDURE VerPerfilUsuario(IN p_id_usuario INT)
BEGIN
    SELECT * FROM Usuarios WHERE id_usuario = p_id_usuario;
END;

-- Procedure para atualizar o perfil do usuário
CREATE PROCEDURE AtualizarPerfilUsuario(IN p_id_usuario INT, IN p_nome VARCHAR(255), IN p_reputacao INT)
BEGIN
    UPDATE Usuarios SET nome = p_nome, reputacao = p_reputacao WHERE id_usuario = p_id_usuario;
END;

-- Procedure para pedir uma carona
CREATE PROCEDURE PedirCarona(IN p_id_usuario INT, IN p_id_viagem INT)
BEGIN
    INSERT INTO Passageiros(id_passageiro, id_caronas) VALUES (p_id_usuario, p_id_viagem);
END;

-- Procedure para oferecer uma carona
CREATE PROCEDURE OferecerCarona(IN p_id_usuario INT, IN p_id_viagem INT, IN p_id_veiculo INT, IN p_lugares_disponiveis INT)
BEGIN
    INSERT INTO Caronas(id_motorista, id_viagem, id_veiculo, lugares_disponiveis) VALUES (p_id_usuario, p_id_viagem, p_id_veiculo, p_lugares_disponiveis);
END;

-- Procedure para listar todas as caronas
CREATE PROCEDURE ListarCaronas()
BEGIN
    SELECT * FROM Caronas;
END;

-- Procedure para ver o perfil de uma carona
CREATE PROCEDURE VerPerfilCarona(IN p_id_caronas INT)
BEGIN
    SELECT * FROM Caronas WHERE id_caronas = p_id_caronas;
END;


CREATE TABLE Usuarios (
    id_usuario INT PRIMARY KEY,
    nome VARCHAR(255),
    reputacao INT
);

CREATE TABLE Veiculos (
    id_veiculo INT PRIMARY KEY,
    nome_veiculo VARCHAR(255),
    cor VARCHAR(255),
    placa VARCHAR(255),
    cnh VARCHAR(255)
);

CREATE TABLE PontosFixos (
    id_ponto_fixo INT PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE Viagens (
    id_viagem INT PRIMARY KEY,
    local_partida VARCHAR(255),
    local_destino VARCHAR(255),
    data_partida DATE,
    hora_partida TIME,
    embarque_imediato BOOLEAN,
    quantidade_passageiros INT,
    status VARCHAR(255),
    id_ponto_fixo INT,
    FOREIGN KEY (id_ponto_fixo) REFERENCES PontosFixos(id_ponto_fixo)
);

CREATE TABLE Caronas (
    id_caronas INT PRIMARY KEY,
    id_viagem INT,
    id_motorista INT,
    id_veiculo INT,
    lugares_disponiveis INT,
    FOREIGN KEY (id_viagem) REFERENCES Viagens(id_viagem),
    FOREIGN KEY (id_motorista) REFERENCES Usuarios(id_usuario),
    FOREIGN KEY (id_veiculo) REFERENCES Veiculos(id_veiculo)
);

CREATE TABLE Passageiros (
    id_passageiro INT PRIMARY KEY,
    id_caronas INT,
    FOREIGN KEY (id_passageiro) REFERENCES Usuarios(id_usuario),
    FOREIGN KEY (id_caronas) REFERENCES Caronas(id_caronas)
);

ALTER TABLE Usuarios
ADD COLUMN email VARCHAR(255) UNIQUE,
ADD COLUMN senha VARCHAR(255);

CREATE TABLE Carro (
    id INT AUTO_INCREMENT,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    cor VARCHAR(255),
    placa VARCHAR(255),
    cnh VARCHAR(255),
    usuario_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);
	 */

}
