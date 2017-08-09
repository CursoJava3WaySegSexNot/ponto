package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Administrador;
import br.com.threeway.segsex.ponto.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorDao extends JpaRepository<Administrador, Long> {

}
