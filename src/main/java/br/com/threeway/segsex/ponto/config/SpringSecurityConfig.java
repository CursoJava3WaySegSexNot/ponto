package br.com.threeway.segsex.ponto.config;

import br.com.threeway.segsex.ponto.domain.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	public static final String LOGIN_PROCESSING_URL = "/j_spring_security_check";

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.userDetailsService(userDetailsService)
				.passwordEncoder(passwordEncoder);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**", "/js/**", "/javax.faces.resource/**","/img/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
					.antMatchers("/admin/**").hasAnyAuthority(Permissao.ACESSAR_TELA_ADMINISTRATIVA.toString())
					.anyRequest().fullyAuthenticated()
					.and()
				.exceptionHandling()
					.accessDeniedPage("/denied.xhtml")
					.and()
				.formLogin()
					.loginPage("/login.xhtml")
					.loginProcessingUrl(LOGIN_PROCESSING_URL)
					.usernameParameter("username")
					.passwordParameter("password")
					.defaultSuccessUrl("/")
//					.failureHandler((request, response, exception) -> /* Fazer alguma coisa quando falha no login */)
//					.successHandler((request, response, authentication) -> /* Fazer alguma coisa quando login */)
					.permitAll()
					.and()
				.logout()
					.logoutUrl("/logout")
					.logoutSuccessUrl("/login.xhtml?logout")
					.invalidateHttpSession(true)
					.permitAll()
					.and()
				.csrf()
					.disable();
	}
}
