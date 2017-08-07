package br.com.threeway.segsex.locadora.bean;

import br.com.threeway.segsex.locadora.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class PontoBean {

	@Autowired
	private PontoService pontoService;

}
