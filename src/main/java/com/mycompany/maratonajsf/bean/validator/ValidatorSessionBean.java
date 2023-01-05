package com.mycompany.maratonajsf.bean.validator;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.mycompany.maratonajsf.model.Estudante;

@Named
@ViewScoped
public class ValidatorSessionBean implements Serializable{

	private Estudante estudante = new Estudante();
	
	public void save() {
		System.out.println("Salvando...");
		System.out.println(estudante.getEmail());
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
}
