package com.carona.repository;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.carona.mappers.UsuarioCarroRowMapper;
import com.carona.models.Usuario;
import com.carona.models.Veiculo;

@Repository
public class UsuarioRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean emailExiste(String email) {
	    SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate)
	        .withProcedureName("verificar_email")
	        .declareParameters(
	            new SqlParameter("p_email", Types.VARCHAR),
	            new SqlOutParameter("existe", Types.BOOLEAN));

	    SqlParameterSource params = new MapSqlParameterSource()
	        .addValue("p_email", email);

	    Map<String, Object> result = call.execute(params);

	    return (boolean) result.get("existe");
	}

	public void criarUsuario(String nome, String reputacao, String email, String senha) {
	    String sql = "INSERT INTO usuarios(nome, reputacao, email, senha) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, nome, reputacao, email, senha);
	}

	public List<Veiculo> verVeiculos(String email){
		String sql = "SELECT * FROM veiculos v join usuarios u on u.id_usuario = v.id_usuario where u.email = ?";

		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Veiculo.class), new Object[] { email } );
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public Usuario carregarUsuario(String email){
		String sql = "SELECT * FROM usuarios WHERE email = ?";

		try {
			return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Usuario.class), new Object[] { email });
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public void criarVeiculo(Integer id_usuario, String marca, String modelo, String cor, String placa, String cnh){
		String sql = "INSERT INTO veiculos(id_usuario, marca, modelo, cor, placa, cnh) VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, id_usuario, marca, modelo, cor, placa, cnh);
	}

}
