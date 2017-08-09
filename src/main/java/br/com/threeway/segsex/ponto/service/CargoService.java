package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.CargoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

	@Autowired
	private CargoDao cargoDao;

}
