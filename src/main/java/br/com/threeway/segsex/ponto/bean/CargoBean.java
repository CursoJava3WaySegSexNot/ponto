package br.com.threeway.segsex.ponto.bean;

import br.com.threeway.segsex.ponto.domain.Cargo;
import br.com.threeway.segsex.ponto.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
public class CargoBean {

	@Autowired
	private CargoService cargoService;

	private Cargo cargo = new Cargo();

	public Cargo getCargo(){
		return cargo;
	}

	public void setCargo(Cargo cargo){
		this.cargo = cargo;
	}

	public void save(){
		cargoService.save(cargo);
		FacesContext msg = FacesContext.getCurrentInstance();
		msg.addMessage(null,new FacesMessage("Sucesso","Cargo "+cargo.getNomeDoCargo()+" cadastrado"));
		cargo = new Cargo();
	}

	public void delete(){
		cargoService.delete(cargo);
	}

	public List<Cargo> getCargos(){
		return cargoService.list();
	}

}
