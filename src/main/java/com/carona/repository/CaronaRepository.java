package com.carona.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carona.exceptions.ProcedureException;

import jakarta.annotation.Resource;



@Repository
public class CaronaRepository {
    
    private static final String ERRO_QUERY = "QUERY RETORNOU SEM DADOS: ";

    private static final String PROCEDURE_SELECT_CARONA = "{call VerPerfilUsuario(?)}";
    private static final String PROCEDURE_INSERT_CARONA = "{call AtualizarPerfilUsuario(?, ?)}";
    private static final String PROCEDURE_UPDATE_CARONA = "{call PedirCarona(?, ?)}";
    private static final String PROCEDURE_DELETE_CARONA = "{call OferecerCarona(?, ?, ?, ?)}";
    private static final String PROCEDURE_LIST_CARONA = "{call ListarCaronas()}";

    /*@Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private "" mapperLista;

    public "" select(int idUsuario) {
        try {
            Object[] params = new Object[] {idUsuario};
            
            return jdbcTemplate.queryForObject(PROCEDURE_SELECT_CARONA, new ""(), params);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public void cadastro(int idUsuario, String nome) {		      	
        try {
            Object[] params = new Object[] {idUsuario, nome};

            jdbcTemplate.update(PROCEDURE_INSERT_CARONA, params);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = ERRO_QUERY + PROCEDURE_INSERT_CARONA;
            throw new ProcedureException(mensagem, e);
        }
    }

    public void update(int idUsuario, int idViagem) {		
        try {
            Object[] params = new Object[] {idUsuario, idViagem};

            jdbcTemplate.update(PROCEDURE_UPDATE_CARONA, params);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = ERRO_QUERY + PROCEDURE_UPDATE_CARONA;
            throw new ProcedureException(mensagem, e);
        }
    }

    public void delete(int idUsuario, int idViagem, int idVeiculo, int lugaresDisponiveis) {	
        try {
            Object[] params = new Object[] {idUsuario, idViagem, idVeiculo, lugaresDisponiveis};

            jdbcTemplate.update(PROCEDURE_DELETE_CARONA, params);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = ERRO_QUERY + PROCEDURE_DELETE_CARONA;
            throw new ProcedureException(mensagem, e);
        }
    }

    public List<""> list() {		
         try {
            return jdbcTemplate.queryForObject(PROCEDURE_LIST_CARONA, mapperLista);
        } catch (EmptyResultDataAccessException e) {
            List<""> lista = new ArrayList<>();
            return lista;
        }
    }*/
}
