package br.unitins.books.model;

public enum TipoUsuario {
	
	ADM(1, "Adiminstrador"), FUNCIONARIO(2, "Funcionário"), CLIENTE(3,"Cliente");
	
	private int id;
	private String label;
	
	TipoUsuario(int id, String label) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.label=label;
	}
	
	public int getId() {
		return id;
	}
	public String getLabel() {
		return label;
	}
}
