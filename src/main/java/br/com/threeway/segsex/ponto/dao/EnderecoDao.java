package br.com.threeway.segsex.ponto.dao;

import br.com.threeway.segsex.ponto.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoDao extends JpaRepository<Endereco, Long> {

}
