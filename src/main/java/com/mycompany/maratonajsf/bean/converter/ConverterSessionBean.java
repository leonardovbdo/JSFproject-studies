package com.mycompany.maratonajsf.bean.converter;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.mycompany.maratonajsf.model.Estudante;

@Named
@ViewScoped
public class ConverterSessionBean implements Serializable{

	private List<Estudante> estudanteList = Estudante.estudanteList();
	private Estudante estudante;
	
	public void save() {
		System.out.println("Salvando...");
		System.out.println(estudante);
	}

	public List<Estudante> getEstudanteList() {
		return estudanteList;
	}



	public void setEstudanteList(List<Estudante> estudanteList) {
		this.estudanteList = estudanteList;
	}



	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
}
