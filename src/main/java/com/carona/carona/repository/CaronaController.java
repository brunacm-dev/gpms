package com.carona.carona.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class CaronaRepository {
	
	private static final String ERRO_QUERY = "QUERY RETORNOU SEM DADOS: ";

    private static final String PROCEDURE_SELECT = "{call [].[dbo].[NOMEPROC](?, ?, ?, ?)}";
	private static final String PROCEDURE_INSERT = "{call [].[dbo].[NOMEPROC](?, ?, ?, ?, ?)}";
    private static final String PROCEDURE_UPDATE = "{call [].[dbo].[NOMEPROC](?, ?, ?, ?, ?)}";
	private static final String PROCEDURE_DELETE = "{call [].[dbo].[NOMEPROC](?, ?, ?, ?)}";
    private static final String PROCEDURE_LIST   = "{call [].[dbo].[NOMEPROC ](?, ?)}";


    @Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
    
    @Autowired
	private XXXXXXXListaMapper mapperLista;

    public XXXXXXX select(XXXXXXX key) {
    	try {
            Object[] params = new Object[] {
            		key.getIdPceroSpi(),
            		key.getInstcPartcPagto(),
            		key.getTpoNotifPcero(),
            		key.getCtrlNotifPcero()
            };
            
            return jdbcTemplate.queryForObject(PROCEDURE_SELECT, new XXXXXXXMapper(), params);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public void insert(XXXXXXX url) {		      	
    	try {
            Object[] params = new Object[] {
            		url.getIdPceroSpi(),
            		url.getInstcPartcPagto(),
            		url.getTpoNotifPcero(),
            		url.getCtrlNotifPcero(),
            		url.getUrlNotifPceroSpi()
            };

            jdbcTemplate.update(PROCEDURE_INSERT_WEBHOOK, params);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = ERRO_QUERY + PROCEDURE_INSERT_WEBHOOK;
            throw new ProcedureException(mensagem, e);
        }
    }

    public void update(XXXXXXX  url) {		
    	try {
            Object[] params = new Object[] {
            		url.getIdPceroSpi()
            		
            };

            jdbcTemplate.update(PROCEDURE_UPDATE, params);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = ERRO_QUERY + PROCEDURE_UPDATE;
            throw new ProcedureException(mensagem, e);
        }
    }

    
    public void delete(XXXXXXX key) {	
    	try {
            Object[] params = new Object[] {
            		key.get()
            };

            jdbcTemplate.update(PROCEDURE, params);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = ERRO_QUERY + PROCEDURE;
            throw new ProcedureException(mensagem, e);
        }

    }



    public List<XXXXXXX> list(XXXXXXX url) {		
     	try {
            Object[] params = new Object[] {
            		url.getIdPceroSpi()

            };

            return jdbcTemplate.queryForObject(PROCEDURE_LIST, mapperLista, params);
        } catch (EmptyResultDataAccessException e) {
            List<XXXXXXX> lista = new ArrayList<>();
            return lista;
        }

    	
    }
    

}