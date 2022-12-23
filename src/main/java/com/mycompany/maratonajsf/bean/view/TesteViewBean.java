package com.mycompany.maratonajsf.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TesteViewBean implements Serializable{

	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		System.out.println(" Entrou o PostConstruct do ViewScoped ");
		personagens = Arrays.asList("Naruto", " Sasuke", "Sakura");
	}
	
	public void selecionarPersonagem() {
		int index =ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado.add(personagem);
	}
	
	public List<String> getPersonagemSelecionado() {
		return personagemSelecionado;
	}
	
	public void setPersonagemSelecionado(List<String> personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}
}
