package br.com.threeway.segsex.ponto;

import br.com.threeway.segsex.ponto.config.SpringSecurityConfig;
import br.com.threeway.segsex.ponto.dao.PapelDao;
import br.com.threeway.segsex.ponto.dao.UsuarioDao;
import br.com.threeway.segsex.ponto.domain.Papel;
import br.com.threeway.segsex.ponto.domain.Permissao;
import br.com.threeway.segsex.ponto.domain.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
@PropertySource({"classpath:datasource.properties"})
public class PontoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PontoApplication.class, SpringSecurityConfig.class);
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(PontoApplication.class, args);
	}
}
