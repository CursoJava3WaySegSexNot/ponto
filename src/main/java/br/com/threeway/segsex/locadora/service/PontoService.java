package br.com.threeway.segsex.locadora.service;

import br.com.threeway.segsex.locadora.dao.PontoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PontoService {

	@Autowired
	private PontoDao pontoDao;

}
