package projeto;

import java.util.ArrayList;

public class Conta {
	private String nome;
	private String email;
	private String senha;
	private ArrayList<Livro> livrosUsuario = new ArrayList<Livro>();
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Livro> getLivrosUsuario() {
		return livrosUsuario;
	}
	public void setLivrosUsuario(Livro livrosUsuario) {
		this.livrosUsuario.add(livrosUsuario);
	}
	

}
