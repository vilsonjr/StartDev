package br.com.desafio2;

public class PessoaArrayDaoValidator {
	
	private PessoaArrayDao dao;
	
	public PessoaArrayDaoValidator(){
		dao = new PessoaArrayDao();
	}
	
	public boolean existeNome(String nome){
		Pessoa[] pessoas = dao.getAll();
		for(int i = 0; i < pessoas.length; i++)
			if(pessoas[i] != null && pessoas[i].getNome().equals(nome)) return true;
		return false;
	}
	
	public boolean dentroDoLimite(){
		Pessoa[] pessoas = dao.getAll();
		for(int i = 0; i < pessoas.length; i++)
			if(pessoas[i] == null) return true;
		return false;
	}
}
