package com.mycompany.maratonajsf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.inject.Named;

import com.mycompany.maratonajsf.model.enums.Turno;

public class Estudante implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome = "Leonardo";
	private String sobrenome = "Vilasboas";
	private double nota1 = 20;
	private double nota2;
	private double nota3 = 10;
	private Turno turno = Turno.MATUTINO;
	private String email;
	private transient boolean editing;

	public Estudante() {

	}

	public Estudante(String nome, String sobrenome, double nota1) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nota1 = nota1;
	}

	public Estudante(Integer id, String nome, String sobrenome, double nota1) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nota1 = nota1;
	}

	public Estudante(Integer id, String nome, String sobrenome, double nota1, String email) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nota1 = nota1;
		this.email = email;
	}

	public static List<Estudante> estudanteList() {
		return new ArrayList<>(Arrays.asList(new Estudante(1, "Ikki", "Fenix", 10, "ikkizinho@outlook.com"),
				new Estudante(2, "Leonardo", "de Oliveira", 8, "leonardovbdo@gmail.com"),
				new Estudante(3, "Rachel", "Castro", 7, "raquelinacastro@hotmail.com"),
				new Estudante(4, "José Maria", "da Silva", 10, "josemariasilva@gmail.com")));
	}

	public boolean isEditing() {
		return editing;
	}

	public void setEditing(boolean editing) {
		this.editing = editing;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
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

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", sobrenome=" + sobrenome + ", turno=" + turno + ", email=" + email + "]";
	}

}
