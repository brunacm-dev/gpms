package com.carona.carona.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class SpringJdbcConfig {
        	
	/*@Value("${database.bspid001.driver}")
	private String driver;

	@Value("${database.bspid001.connectionString}")
	private String connectionString;

	@Value("${DATABASE_USERNAME}")
	private String username;

	@Value("${DATABASE_PASSWORD}")
	private String password;
	
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(connectionString);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

	@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }*/
}
