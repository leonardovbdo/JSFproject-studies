package com.mycompany.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mycompany.maratonajsf.bean.dependent.TesteDependentBean;
import com.mycompany.maratonajsf.bean.session.TesteSessionBean;

@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable{

	private String nome;
	private String sobrenome;
	private Date data = new Date();
	
	public void imprimirAtributos() {
		String initParameter = FacesContext.getCurrentInstance()
			.getExternalContext()
			.getInitParameter("images.location");
		
		System.out.println(initParameter);
	}
	
	public String save() {
		System.out.println(nome);
		System.out.println(sobrenome);
		return "comunicacao2?faces-redirect=true&nome="+nome+"&sobrenome="+sobrenome;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobernome) {
		this.sobrenome = sobernome;
	}
	
	
}
