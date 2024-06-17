package com.carona.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.carona.models.Veiculo;
import com.carona.models.Usuario;

public class UsuarioCarroRowMapper implements RowMapper<Usuario> {
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setNome(rs.getString("nome"));
        usuario.setEmail(rs.getString("email"));
        usuario.setPapel(rs.getString("papel"));

        Veiculo carro = new Veiculo();
        carro.setMarca(rs.getString("marca"));
        carro.setModelo(rs.getString("modelo"));
        carro.setCor(rs.getString("cor"));
        carro.setPlaca(rs.getString("placa"));
        carro.setCnh(rs.getString("cnh"));

        return usuario;
    }
}