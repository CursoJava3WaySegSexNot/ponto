package br.com.threeway.segsex.ponto.bean;

import br.com.threeway.segsex.ponto.domain.Contato;
import br.com.threeway.segsex.ponto.domain.Endereco;
import br.com.threeway.segsex.ponto.domain.Funcionario;
import br.com.threeway.segsex.ponto.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@ViewScoped
public class FuncionarioBean {

	@Autowired
	private FuncionarioService funcionarioService;

	private Funcionario funcionario;
	private String busca="";

	public FuncionarioBean() {
		funcionario = new Funcionario();
		funcionario.setContato(new ArrayList<>());
		funcionario.setEndereco(new Endereco());
	}


}
