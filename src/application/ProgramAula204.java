package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entitie.Product204;
import model.service.CalculationService204;

public class ProgramAula204 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product204> list = new ArrayList<Product204>();
		
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] filds = line.split(",");
				list.add(new Product204(filds[0], Double.parseDouble(filds[1])));
				line = br.readLine();
			}
			
			Product204 x = CalculationService204.max(list);
			
			System.out.println("Most expensive: ");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("error:" + e.getMessage());
		}

	}

}
