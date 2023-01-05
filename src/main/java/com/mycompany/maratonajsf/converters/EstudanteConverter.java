package com.mycompany.maratonajsf.converters;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.mycompany.maratonajsf.model.Estudante;

@FacesConverter(value = "estudanteConverter")
public class EstudanteConverter implements Converter{

	List<Estudante> estudanteList = Estudante.estudanteList();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null || !value.matches("\\d+")) {
			return null;
		}
//		Estudante estudante = new Estudante();
//		estudante.setId(Integer.parseInt(value));
//		int index = estudanteList.indexOf(estudante);
//		return estudanteList.get(index);
		return this.getAttributesFrom(component).get(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null && !value.equals("")) {
			Estudante estudante = (Estudante) value;
			if (estudante.getId() != null) {
				this.addAttribute(component, estudante);
				return estudante.getId().toString();
			}
		}
		return null;
	}
	
	private Map<String, Object> getAttributesFrom(UIComponent component){
		return component.getAttributes();
	}
	
	private void addAttribute(UIComponent component, Estudante estudante) {
		this.getAttributesFrom(component).put(estudante.getId().toString(), estudante);
	}

}
