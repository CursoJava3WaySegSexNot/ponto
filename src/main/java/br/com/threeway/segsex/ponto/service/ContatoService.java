package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.ContatoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

	@Autowired
	private ContatoDao contatoDao;

}
