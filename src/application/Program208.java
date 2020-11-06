package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program208 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));
		
		//uni�o - os elemetos de a e b ser�o apresentados, os repetidos(est�o nas duas listas) aparaceam uma unica vez
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		//Intersec��o - ou seja somente os numeros em comum
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//Diferen�a - ou seja p que tem somente no a (no exemplo)
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
