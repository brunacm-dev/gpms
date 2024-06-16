package com.carona.repository;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.carona.mappers.UsuarioCarroRowMapper;
import com.carona.models.Usuario;

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

	public void criarUsuario(String nome, String reputacao, String email, String senha, String papel, String marca, String modelo, String cor, String placa, String cnh) {
	    SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate)
	        .withProcedureName("criar_usuario");

	    SqlParameterSource params = new MapSqlParameterSource()
	    	    .addValue("p_nome", nome)
	    	    .addValue("p_reputacao", reputacao)
	    	    .addValue("p_email", email)
	    	    .addValue("p_senha", senha)
	    	    .addValue("p_papel", papel)
	    	    .addValue("p_marca", marca)
	    	    .addValue("p_modelo", modelo)
	    	    .addValue("p_cor", cor)
	    	    .addValue("p_placa", placa)
	    	    .addValue("p_cnh", cnh);

	    	call.execute(params);
	}

	public Usuario carregarUsuario(String email){
		String sql = "SELECT * FROM usuarios WHERE email = ?";

		try {
			return jdbcTemplate.queryForObject(sql, new UsuarioCarroRowMapper(), new Object[] { email });
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
