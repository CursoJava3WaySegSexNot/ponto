package br.com.threeway.segsex.ponto.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Funcionario extends Usuario{

    @ManyToOne
    private Cargo cargo;
}
