package com.mycompany.maratonajsf.bean.login;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.mycompany.maratonajsf.model.Estudante;

@Named
@SessionScoped
public class LoginBean implements Serializable {

	private String login;
	private String senha;
	private Estudante estudante;
	private String language;
	private int qtdMensagens;
	
	private List<Locale> localeList = Arrays.asList(new Locale("en"), new Locale("pt"));
	
	public String logar() {
		//Faz uma busca pelo banco
		if (login.equals("W") && senha.equals("1")) {
			estudante = new Estudante();
			qtdMensagens++;
			return "/restricted/iniciosistema.xhtml?faces-redirect=true";
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new 
				FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário e/ou senha estão incorretos",""));
		return null;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		estudante = null;
		return "/login?faces-redirect = true";
	}

	public String getLanguage() {
		return language;
	}
	
	public int getQtdMensagens() {
		return qtdMensagens;
	}
	
	public void setQtdMensagens(int qtdMensagens) {
		this.qtdMensagens = qtdMensagens;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Locale> getLocaleList() {
		return localeList;
	}

	public void setLocaleList(List<Locale> localeList) {
		this.localeList = localeList;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}	
}
