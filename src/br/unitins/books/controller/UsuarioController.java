package br.unitins.books.controller;


import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.books.application.Util;
import br.unitins.books.model.TipoUsuario;
import br.unitins.books.model.Usuario;

@Named
@ViewScoped
public class UsuarioController implements Serializable {
	
	private static final long serialVersionUID = -563227102506849534L;
	
	private Usuario usuario;
	private List<Usuario>  listaUsuario;
	

	public void incluir() {
		if(getUsuario().getNome().isBlank()) {
			Util.addErrorMessage("O campo nome deve ser informado!");
			return;
		}
		getUsuario().setId(proximoId());
		getListaUsuario().add(getUsuario());
		System.out.println("Nome: "+getUsuario().getNome());
		limpar();
	}
	
	public void alterar() {
		listaUsuario.set(listaUsuario.indexOf(getUsuario()), getUsuario());
		limpar();
	}
	public void excluir() {
		getListaUsuario().remove(getUsuario());
	}
	public void limpar() {
		usuario=null;
	}
	
	public void editar(Usuario usu) {
		setUsuario(usu.getClone());
	}
	
	private int proximoId() {
		int resultado=0;
		for (Usuario usuario : getListaUsuario()) {
			if(usuario.getId()>resultado)
				resultado=usuario.getId();
		}
		return ++resultado;
	}

	public List<Usuario> getListaUsuario() {
		if(listaUsuario==null)
			listaUsuario=new ArrayList<Usuario>();
		return listaUsuario;
	}

	public Usuario getUsuario() {
		if(usuario==null)
			usuario=new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public TipoUsuario[] getListaTipoUsuario() {
		return TipoUsuario.values();
	}
}
