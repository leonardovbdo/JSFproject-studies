package com.mycompany.maratonajsf.bean.flow;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable{

	private String userName;
	private String userLastName;
	
	public String validarUser() {
		System.out.println(" Fazendo consulta no SERASA");
		System.out.println(" Fazendo consulta no SPC");
		System.out.println(" Pedindo permissão do Admin");
		System.out.println(" Executando maluquices");
		if (true) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"Usuário não validado", "Detalhes"));
			return null;
		}
		return "proceedToRegistration3";
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	
}
