package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.CargoDao;
import br.com.threeway.segsex.ponto.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CargoService {

	@Autowired
	private CargoDao cargoDao;

	@Transactional
	public void save(Cargo cargo){
		cargoDao.save(cargo);
	}

	@Transactional
	public void delete(Cargo cargo){
		cargoDao.delete(cargo);
	}

	public List<Cargo> list(){
		return cargoDao.findAll();
	}

}
