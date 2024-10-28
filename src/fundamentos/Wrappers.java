package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 127;
		Short s = 1000;
		
		Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 10000000L;
		
		System.out.println(b.byteValue() + " demonstra o valor do byte");
		System.out.println(s.toString() + " Short = s foi transformado para String");
		System.out.println(i * 3 + " multiplicacao");
		System.out.println(l / 3 + " divisao");
		
		Float f = 123.10F;
		System.out.println(f); // será impresso como float o valor de f
		
		Double d = 1234.5678;
		System.out.println(d); // será impresso o valor como double
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "..." ); //Caractere - será impresso o caractere atribuido a letra informada
		
		 entrada.close();
		
	}
	
}
