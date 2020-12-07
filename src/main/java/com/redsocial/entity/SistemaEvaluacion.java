package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sistemaevaluacion")
@Getter
@Setter
public class SistemaEvaluacion {

	@Id
	private int idSistemaEvaluacion;
	private String formula;
	private String estado;
}




