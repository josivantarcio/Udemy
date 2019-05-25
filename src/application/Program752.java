package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program752 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Joao");
		lista.add("Maria");
		lista.add("Lucas");
		lista.add("Matheus");
		lista.add("Marta");
		lista.add("Zacarias");

		lista.add(3, "Marcos");
		
		
		for(String nomes : lista) {
			System.out.print(nomes+". ");
		}
		System.out.print("\n---------------");
		System.out.println();
		lista.removeIf(i -> i.charAt(0) == 'M');
		for(String newNames : lista) {
			System.out.print(newNames+". ");
		}
		
		System.out.println();
		System.out.print(lista.indexOf("Lucas"));
		System.out.print("\n-----------------");
		System.out.println();
		
		
		List<String> lista2 = lista.stream().filter(i -> i.charAt(0) != 'M').collect(Collectors.toList());
		for(String l2 : lista2) {
			System.out.println(l2);
		}
		
		
	}

}
