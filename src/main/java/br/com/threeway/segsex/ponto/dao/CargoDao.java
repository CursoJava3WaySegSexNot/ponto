package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Cargo;
import br.com.threeway.segsex.ponto.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoDao extends JpaRepository<Cargo, Long> {

}
