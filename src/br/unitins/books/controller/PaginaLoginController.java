package br.unitins.books.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PaginaLoginController {
	private String login;
	private String senha;
	

	public String entrar() {
		System.out.println("Login: "+getLogin()+"\nSenha: "+getSenha());
		return "a";
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
	
}
