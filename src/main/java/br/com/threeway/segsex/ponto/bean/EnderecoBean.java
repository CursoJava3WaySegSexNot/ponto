package br.com.threeway.segsex.ponto.bean;

import br.com.threeway.segsex.ponto.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class EnderecoBean {

	@Autowired
	private EnderecoService enderecoService;

}
