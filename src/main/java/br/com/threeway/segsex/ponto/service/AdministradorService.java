package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.AdministradorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {

	@Autowired
	private AdministradorDao administradorDao;

}
