package com.mycompany.maratonajsf.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
//Transient
public class TesteConversationBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	
	@Inject
	private Conversation conversation;
	
	public void init() {
		System.out.println(" Entrou o PostConstruct do ConversationScoped ");
		personagens = Arrays.asList("Gon", "Killua", "Kurapika");
		if (conversation.isTransient()) {
			//Long Running
			conversation.begin();
			System.out.println(" Iniciando ConversationScoped, ID = "+conversation.getId());
		}
	}
	
	public boolean eTransiente() {
		if (conversation.isTransient()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String endConversation() {
		if (!conversation.isTransient()) {
			conversation.end();
		}
		return "conversation?faces-redirect=true";
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
	
	public Conversation getConversation() {
		return conversation;
	}
	
	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}
}
