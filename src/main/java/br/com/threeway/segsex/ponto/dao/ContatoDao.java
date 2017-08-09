package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Administrador;
import br.com.threeway.segsex.ponto.domain.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoDao extends JpaRepository<Contato, Long> {

}
