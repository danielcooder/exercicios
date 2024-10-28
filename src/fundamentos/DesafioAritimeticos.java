package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
	
		int a = 6 * (3 + 2);
		int b = (int)Math.pow(a, 2);
		int c = 3 * 2;
		
		Double resultado1 = (double) ( b / c);
	
		int d = (1 - 5) * (2 - 7);
		int e = d/2;
		int f = (int)Math.pow(e, 2);
		
		Double resultado2 = (double) f;
		
		int calculo1 = (int) (resultado1 - resultado2);
		int g = (int) Math.pow(calculo1, 3);
		int h = (int)Math.pow(10, 3);
		int i = (g/h);
		
		System.out.println("O resultado final deste calculo é: " + i);
		
	}
	
}
