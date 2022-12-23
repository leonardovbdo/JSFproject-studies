package com.mycompany.maratonajsf.bean.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable{

	private List<String> categoriaList;
	
	@PostConstruct
	public void init() {
		System.out.println(" Entrou o PostConstruct do ApplicationScoped ");
		categoriaList = Arrays.asList("RPG", "Sci-Fi", "Terror");
	}
	
	public void mudarLista() {
		categoriaList = Arrays.asList("Comédia", "Românce", "Drama");
	}
	
	public List<String> getCategoriaList() {
		return categoriaList;
	}
	
	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}
}
