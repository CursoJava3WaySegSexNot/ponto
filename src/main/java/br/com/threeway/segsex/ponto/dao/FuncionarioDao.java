package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Funcionario;
import br.com.threeway.segsex.ponto.domain.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioDao extends JpaRepository<Funcionario, Long> {

}
