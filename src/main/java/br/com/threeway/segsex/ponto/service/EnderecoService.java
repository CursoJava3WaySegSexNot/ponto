package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.EnderecoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoDao enderecoDao;

}
