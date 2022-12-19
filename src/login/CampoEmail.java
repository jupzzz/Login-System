package login;

import java.util.Scanner;

public class CampoEmail {

	String email = "";
	Scanner entrada = new Scanner(System.in);
	
	public boolean validaEmail() {
		System.out.println("Digite o e-mail: ");
		email = entrada.next();
		
		if(email.equals("juliapenz_@hotmail.com")) {
			System.out.println("Verdadeiro");
			return true;
		} else {
			System.out.println("Falso");
			return false;
		}
	}
}
