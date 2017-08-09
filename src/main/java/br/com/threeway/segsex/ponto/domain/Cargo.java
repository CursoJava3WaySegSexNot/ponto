package br.com.threeway.segsex.ponto.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cargo {

    @Id
    @GeneratedValue
    private Long id;
    private String nomeDoCargo;
    private Double salario;
    private Double cargaHoraria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoCargo() {
        return nomeDoCargo;
    }

    public void setNomeDoCargo(String nomeDoCargo) {
        this.nomeDoCargo = nomeDoCargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
