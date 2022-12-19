package login;

import java.util.Scanner;

public class BotaoLogin {
	
	Scanner opcaoScanner = new Scanner(System.in);

	public void etapasLogin(boolean email, boolean senha) {
		System.out.println("Digite o que você quer fazer: 1- Fazer login; 2- Entrar com um novo usuário; 3- Sair do sistema");
		int opcao = opcaoScanner.nextInt();
		
		switch (opcao) {
		case 1: {
			System.out.println("Fazendo login");
			fazerLogin(email, senha);
			break;
		} case 2: {
			System.out.println("Entrando com novo usuário");
			entrarNovoUsuario();
			break;
		} case 3: {
			System.out.println("Saindo do sistema");
			sairDoSistema();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
	}
	
	public boolean fazerLogin(boolean email, boolean senha) {
		if(email == true && senha == true) {
			System.out.println("Login efetuado com sucesso!");
			return true;
		} else {
			System.out.println("Login não efetuado");
			return false;
		}
	}
	
	public void entrarNovoUsuario() {
		Formulario form = new Formulario();
		form.fazerLoginESenha();
	}
	
	public void sairDoSistema() {
		opcaoScanner.close();
		System.exit(1);
	}
}
