package br.com.desafio2;

import java.util.Scanner;

public class View {
	
	private Scanner entrada;
	private PessoaArrayDao dao;
	private PessoaArrayDaoValidator daoValidator;

	public View(){
		entrada = new Scanner(System.in);
		dao = new PessoaArrayDao();
		daoValidator = new PessoaArrayDaoValidator();
	}
	
	public void executar(){
		String opcao = "";
		System.out.println("Gerenciador de Pessoas");

		while (opcao != "0") {
			opcao = selecionarOpcao();
			
			if (opcao.equals("1")) {
				cadastrarPessoa();
			}
			else if (opcao.equals("2")){
				editarPessoa();
			}
			else if(opcao.equals("3")){
				removerPessoa();
			}
			else if(opcao.equals("4")){
				listarPessoa();
			}
			else if(opcao.equals("5")){
				visualizarPessoa();
			}
			else if(opcao.equals("0")){
				sairDoPrograma();
				return;
			}
			else{
				System.out.println("Esta op��o � inv�lida!");
			}
		}
	}
	
	private String selecionarOpcao(){
		System.out.println("Selecione a op��o desejada:\n1. Cadastrar\n2. Editar\n3. Excluir\n4. Listar\n5. Visualizar Dados\n0. Sair");
		return entrada.nextLine();
	}

	private void cadastrarPessoa() {
		if(daoValidator.dentroDoLimite()){
			String nome = informarNome();
			int idade = informarIdade();
			boolean idadeValida = validarIdade(idade);
			if(idadeValida){
				Pessoa pessoa = new Pessoa(nome, idade);
				dao.save(pessoa);
			}
		}else{
			System.out.println("\nN�o h� espa�o para cadastrar.\n");
		}
	}
	
	private void editarPessoa() {
		String nome = informarNome();
		if(daoValidator.existeNome(nome)){
			System.out.println("E a idade:");
			int novaIdade = Integer.parseInt(entrada.nextLine());
			Pessoa pessoa = new Pessoa(nome,novaIdade);
			dao.update(pessoa);
		}else{
			System.out.println("Nome n�o existe.");
		}
	}
	
	private void removerPessoa() {
		String nome = informarNome();
		if(daoValidator.existeNome(nome)){
			dao.deleteByName(nome);
		}else{
			System.out.println("Nome n�o existe.");
		}
	}
	
	private void listarPessoa() {
		Pessoa[] pessoas = dao.getAll();
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i] != null){
				System.out.println(pessoas[i]);
			}
		}
	}
	
	private void visualizarPessoa(){
		String nome = informarNome();
		if(daoValidator.existeNome(nome)){
			Pessoa pessoa = dao.getByName(nome);
			System.out.println(pessoa);
		}else{
			System.out.println("Nome n�o existe.");
		}
	}
	
	private String informarNome() {
		System.out.println("Informe o nome da pessoa:");
		return entrada.nextLine();
	}
	
	private int informarIdade(){
		System.out.println("Informe a idade da pessoa:");
		try{
			return Integer.parseInt(entrada.nextLine());
		}
		catch(NumberFormatException e){
			System.out.println("N�o � permitido letra.");
		}
		return 0;
	}
	
	private boolean validarIdade(int idade) {
		boolean isValido = true;
		if(idade < 0){
			isValido = false;
			System.out.println("N�mero negativo � inv�lido.\n");
		}
		else if(idade > 120){
			isValido = false;
			System.out.println("A idade m�xima � at� 120.\n");
		}
		return isValido;
	}
	
	private void sairDoPrograma() {
		System.out.println("Voc� saiu do cadastro de pessoas!");
		return;
	}
}
