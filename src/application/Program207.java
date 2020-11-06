package application;

import model.entitie.Cadastro207;

public class Program207 {

	public static void main(String[] args) {
		
		Cadastro207 cd = new Cadastro207("Marcelo", "marcelo@gmail.com");
		Cadastro207 cd2 = new Cadastro207("Marcelo2", "marcelo2@gmail.com");
		
		System.out.println(cd.hashCode());
		System.out.println(cd2.hashCode());
		System.out.println(cd.equals(cd2));
		
		System.out.println(cd == cd2); // s�o diferentes porque apontam para objetos diferentes
		
		// no caso do equals e hash eles comparam so atributos n�o as referencias, logo dependendo da situa��o 
		// convem utilizar equal e hash ou por compara��o de referencias a ojetos
		// algumas classes como String trantam de forma diferente, portanto a compara��o sera verdareira caso n�o seja criado um objeto

	}

}
