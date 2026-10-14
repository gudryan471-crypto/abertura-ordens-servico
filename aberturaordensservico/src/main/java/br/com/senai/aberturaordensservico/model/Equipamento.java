package br.com.senai.aberturaordensservico.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "equipamento")
public class Equipamento {
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer id;

private String nome;
private double numeroPatrimonio;

@ManyToOne 
@JoinColumn (name = "setor_id")
private Setor setor;

public Equipamento() {
}

public Integer getId() {
    return id;
}

public String getNome() {
    return nome;
}

public double getNumeroPatrimonio() {
    return numeroPatrimonio;
}

public Setor getSetor() {
    return setor;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setNumeroPatrimonio(double numeroPatrimonio) {
    this.numeroPatrimonio = numeroPatrimonio;
}

public void setSetor(Setor setor) {
    this.setor = setor;
}
    
}
