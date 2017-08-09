package br.com.threeway.segsex.ponto.bean;

import br.com.threeway.segsex.ponto.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class AdministradorBean {

	@Autowired
	private AdministradorService administradorService;

}
