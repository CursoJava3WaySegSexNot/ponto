package br.com.threeway.segsex.ponto.config;

import br.com.threeway.segsex.ponto.domain.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

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
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
//					.antMatchers("/login.xhtml").permitAll()
					.antMatchers("/admin/*").hasAnyAuthority(Permissao.ACESSAR_TELA_ADMINISTRATIVA.toString())
					.anyRequest().authenticated()
					.and()
				.exceptionHandling()
					.accessDeniedPage("/denied.xhtml")
					.and()
				.formLogin()
					.loginPage("/login.xhtml")
					.defaultSuccessUrl("/")
					.permitAll()
					.and()
				.logout()
					.logoutUrl("/logout")
					.logoutSuccessUrl("/login.xhtml?logout")
					.invalidateHttpSession(true)
					.permitAll();
	}
}
