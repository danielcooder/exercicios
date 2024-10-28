package fundamentos.operadores;

public class Ternario {

	
	
	public static void main(String[] args) {
		
		//exemplo 1 feito pelo professor
		double media = 1.6;
		
		String resultadoFinal = media >= 7.0 ?
				"aprovado." : " em recuperação.";
		
		System.out.println("O aluno está " + resultadoFinal);
		

		//exemplo 2 - venda de lote e casa
		double saldoConta = 800;
	
		String loteDisponivel = saldoConta > 50000 ? "Casa no bairro 13 disponivel" : "Casa na praia disponivel";
		System.out.println("\nDe acordo com seu valor monetario a disponibilidade é de " + loteDisponivel);
		
		
		//exemplo 3 gato faminto
		boolean temRacao = false;
		
		String quantidade = temRacao ? "Que comida incrivel" : "Estou com fome meu Deus";
		System.out.println("\nMiau, disse o gatinho de rua " + quantidade);
		
		
		
	}
	
}
