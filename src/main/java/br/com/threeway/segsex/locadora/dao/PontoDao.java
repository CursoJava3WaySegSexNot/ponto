package br.com.threeway.segsex.locadora.dao;

import br.com.threeway.segsex.locadora.domain.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoDao extends JpaRepository<Ponto, Long> {

}
