package classes;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date dtaNasc;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String email, Date dtaNasc) {
		this.nome = nome;
		this.email = email;
		this.dtaNasc = dtaNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtaNasc() {
		return dtaNasc;
	}

	public void setDtaNasc(Date dtaNasc) {
		this.dtaNasc = dtaNasc;
	}
	
}
