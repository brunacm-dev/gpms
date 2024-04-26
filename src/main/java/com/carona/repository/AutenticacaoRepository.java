package com.carona.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carona.logins.UsuarioLoginDTO;

@Repository
public class AutenticacaoRepository {

    private static final String QUERY_FIND_BY_EMAIL = "SELECT * FROM Usuario WHERE email = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UsuarioLoginDTO findByEmail(String email) {
        try {
            return jdbcTemplate.queryForObject(QUERY_FIND_BY_EMAIL, new BeanPropertyRowMapper<>(UsuarioLoginDTO.class), email);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
