package com.carona.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carona.models.Veiculo;
import com.carona.models.Viagem;
import com.carona.models.requests.OferecerCaronaRequestDTO;
import com.carona.models.requests.PedirCaronaRequestDTO;
import com.carona.models.requests.ListarCaronaRequestDTO;

import jakarta.annotation.Resource;



@Repository
public class CaronaRepository {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void oferecerCarona(Integer id_motorista, OferecerCaronaRequestDTO carona)
    {
        String sql = """
            INSERT INTO viagens (
                id_motorista,
                id_veiculo,
                local_partida, 
                local_destino, 
                data_partida, 
                hora_partida, 
                quantidade_passageiros, 
                id_ponto_fixo
            ) VALUES (
                ?,
                ?,
                ?,
                ?,
                ?,
                ?,
                ?,
                ?
            )
            """;

		jdbcTemplate.update(
            sql, 
            id_motorista,
            carona.getIdVeiculo(),
            carona.getLocalPartida(),
            carona.getLocalDestino(),
            carona.getDataPartida(),
            carona.getHoraPartida(),
            carona.getQuantidadePassageiros(),
            carona.getIdPontoFixo());
    }

    public List<Viagem> listarCarona(ListarCaronaRequestDTO carona){
        String sql = """
            SELECT * FROM viagens WHERE
            (
            (local_partida like ? AND
            local_destino like ?) OR
            id_ponto_fixo = ?) AND
            quantidade_passageiros = ? AND
            data_partida BETWEEN CURDATE() AND ?
        """;

		try {
            LocalDate localDate = "imediato".equals(carona.getTipoEmbarque()) ? LocalDate.now() : LocalDate.parse("9999-01-01");
            java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);

			return jdbcTemplate.query(
                sql, 
                new BeanPropertyRowMapper<>(Viagem.class), 
                new Object[] {
                    "%" + carona.getLocalPartida() + "%",
                    "%" + carona.getLocalDestino() + "%",
                    carona.getIdPontoFixo(),
                    carona.getQuantidadePassageiros(),
                    sqlDate
                }
            );
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
    }

    public void pedirCarona(Integer id_passageiro, PedirCaronaRequestDTO carona)
    {
        String sql = """
            INSERT INTO viagens (
                local_partida, 
                local_destino, 
                id_ponto_fixo
            ) VALUES (
                ?,
                ?,
                ?,
                ?,
                ?
            )
            """;

		jdbcTemplate.update(
            sql, 
            carona.getLocalPartida(),
            carona.getLocalDestino(),
            carona.getIdPontoFixo());
    }
}
