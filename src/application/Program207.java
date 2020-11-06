package application;

import model.entitie.Cadastro207;

public class Program207 {

	public static void main(String[] args) {
		
		Cadastro207 cd = new Cadastro207("Marcelo", "marcelo@gmail.com");
		Cadastro207 cd2 = new Cadastro207("Marcelo2", "marcelo2@gmail.com");
		
		System.out.println(cd.hashCode());
		System.out.println(cd2.hashCode());
		System.out.println(cd.equals(cd2));
		
		System.out.println(cd == cd2); // são diferentes porque apontam para objetos diferentes
		
		// no caso do equals e hash eles comparam so atributos não as referencias, logo dependendo da situação 
		// convem utilizar equal e hash ou por comparação de referencias a ojetos
		// algumas classes como String trantam de forma diferente, portanto a comparação sera verdareira caso não seja criado um objeto

	}

}
