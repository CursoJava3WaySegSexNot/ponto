package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);

}
