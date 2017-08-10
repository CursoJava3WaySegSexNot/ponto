package br.com.threeway.segsex.ponto.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
public class Papel implements GrantedAuthority {

	@Id
	private String nome;

	@ElementCollection(targetClass = Permissao.class)
	@Enumerated(EnumType.STRING)
	@CollectionTable(name="permissoes")
	@Column(name="permissao")
	private List<Permissao> permissoes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	@Override
	public String getAuthority() {
		return "ROLE_" + nome.toUpperCase();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Papel papel = (Papel) o;

		return nome.equals(papel.nome);
	}

	@Override
	public int hashCode() {
		return nome.hashCode();
	}
}
