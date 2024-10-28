package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		// caso 1
		String s = "Boa tarde, Neymar";
		s = s.replace("tarde", "noite");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		
		System.out.println(s);
		
		//caso 2
		String x = "myke o gatinho atrapalhado".toUpperCase();
		System.out.println(x);
		
		// caso 3
		String y = "Bom dia X"
					.replace("X", "James")
					.toUpperCase()
					.concat("!!!");
		System.out.println(y);
	
	
		// Tipos primitivos não tem o operador "."
		int a = 3;
		
	}
	
	
}
