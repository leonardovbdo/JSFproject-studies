package com.mycompany.maratonajsf.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.mycompany.maratonajsf.model.Estudante;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable{

	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	private Estudante estudante;
	
	@PostConstruct
	public void init() {
		System.out.println(" Entrou o PostConstruct do SessionScoped ");
		personagens = Arrays.asList("Goku", "Vegeta", "Gohan");
		logar();
	}
	
	public void logar() {
		estudante = new Estudante();
	}
	
	public void selecionarPersonagem() {
		int index =ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado.add(personagem);
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "session?faces-redirect = true";
	}
	
	public Estudante getEstudante() {
		return estudante;
	}
	
	public List<String> getPersonagemSelecionado() {
		return personagemSelecionado;
	}
	
	public void setPersonagemSelecionado(List<String> personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}
	
}
