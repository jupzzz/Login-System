package login;

import java.util.Scanner;

public class CampoSenha {

	String senha = "";
	Scanner entrada = new Scanner(System.in);
	
	public boolean validaSenha() {
		System.out.println("Digite a senha: ");
		senha = entrada.next();
		
		if(senha.equals("0okm6tfc")) {
			System.out.println("Verdadeiro");
			return true;
		} else {
			System.out.println("Falso");
			return false;
		}
	}
}
