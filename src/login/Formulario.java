package login;

import java.util.Scanner;

public class Formulario {

	CampoEmail campoEmail = new CampoEmail();
	CampoSenha campoSenha = new CampoSenha();
	BotaoLogin botaoLogin = new BotaoLogin();
	Scanner entrada = new Scanner(System.in);
	
	public void fazerLoginESenha() {
		botaoLogin.etapasLogin(campoEmail.validaEmail(), campoSenha.validaSenha());
	}
}
