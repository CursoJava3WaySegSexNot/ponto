package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoDao extends JpaRepository<Ponto, Long> {

}
