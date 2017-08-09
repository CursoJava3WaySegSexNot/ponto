package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.FuncionarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioDao funcionarioDao;

}
