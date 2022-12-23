package com.mycompany.maratonajsf.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable{

	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		System.out.println(" Entrou o PostConstruct do RequestScoped ");
		personagens = Arrays.asList("Yusuke", " Hiei", " Kurama");
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
