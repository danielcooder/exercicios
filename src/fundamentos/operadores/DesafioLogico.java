package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean semEmprego = !trabalhoTerca && !trabalhoQuinta;
		
		System.out.println(comprouTV50 + " \nOs dois trabalhos deram certo!! \nIremos comprar uma Tv"
				+ "de 50 polegadas neste final de semana."
				+ "\nAproveitaremos para tomarmos sorvete! (っ◔◡◔)っ ♥ \n");
		
		System.out.println(comprouTV32 + "\nConsegui garantir apenas 1 trabalho,"
					+ "vamos comprar uma Tv menor de 32 porém mesmo assim tomaremos sorvete\n");
		
		
		System.out.println(semEmprego + "\nNão consegui emprego... "
					+ "infelizmente ficaremos em casa e não comparemos a Tv nem tomaremos sorvete\n");
			
	}
}
