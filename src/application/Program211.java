package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entitie.LogAcesso;

/*Um site de internet registra um log de acessos dos usu�rios. Um
registro de log consiste no nome de usu�rio (apenas uma palavra) e o
instante em que o usu�rio acessou o site no padr�o ISO 8601,
separados por espa�o, conforme exemplo. Fazer um programa que leia
o log de acessos a partir de um arquivo, e da� informe quantos usu�rios
distintos acessaram o site.*/

public class Program211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<LogAcesso> lista = new HashSet<LogAcesso>();
			
			String linha = br.readLine();			
			while (linha != null) {
				String[] campo = linha.split(" ");
				String nome = campo[0];
				Date data = Date.from(Instant.parse(campo[1]));
				lista.add(new LogAcesso(nome, data));
				linha = br.readLine();				
			}			
			
			
			System.out.println("tamanho: " + lista.size());
			
		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}
		
		
		sc.close();
		

	}

}
