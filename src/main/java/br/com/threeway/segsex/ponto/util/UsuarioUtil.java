package br.com.threeway.segsex.ponto.util;

import br.com.threeway.segsex.ponto.domain.Usuario;
import org.springframework.security.core.context.SecurityContextHolder;

public class UsuarioUtil {

	public static Usuario getUsuario() {
		return (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

}
