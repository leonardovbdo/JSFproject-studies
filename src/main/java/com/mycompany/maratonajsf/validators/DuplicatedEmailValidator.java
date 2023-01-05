package com.mycompany.maratonajsf.validators;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import com.mycompany.maratonajsf.bean.login.LoginBean;

@FacesValidator
public class DuplicatedEmailValidator implements Validator {

	private List<String> emailsDB = Arrays.asList("leonardovbdo@hotmail.com", "contato@maluco.com", "melao@papaya.com");
	@Inject
	private LoginBean loginBean;

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		System.out.println(loginBean.getLanguage());
		String email = (String) value;
		if (emailsDB.contains(email)) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Este email já foi cadastrado.", "");
			throw new ValidatorException(message);
		}
	}

}
