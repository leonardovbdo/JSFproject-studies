package com.mycompany.maratonajsf.bean.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mycompany.maratonajsf.bean.dependent.TesteDependentBean;
import com.mycompany.maratonajsf.bean.session.TesteSessionBean;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

	private List<String> categoriaList;
	private final TesteDependentBean dependentBean;
	private final TesteSessionBean sessionBean;
	
	@Inject
	public TesteApplicationBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
		super();
		this.dependentBean = dependentBean;
		this.sessionBean = sessionBean;
	}

	@PostConstruct
	public void init() {
		System.out.println(" Entrou o PostConstruct do ApplicationScoped ");
		categoriaList = Arrays.asList("RPG", "Sci-Fi", "Terror");
		dependentBean.getCategoriasList().addAll(Arrays.asList("Paulera", "Loucura", "Musical"));
		sessionBean.selecionarPersonagem();
	}

	public void mudarLista() {
		categoriaList = Arrays.asList("Comédia", "Românce", "Drama");
	}
	
	public TesteSessionBean getSessionBean() {
		return sessionBean;
	}
	
	public TesteDependentBean getDependentBean() {
		return dependentBean;
	}

	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}
}
