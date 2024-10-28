package fundamentos;

public class TiposStrings {

	public static void main(String[] args) {
		
		//este método .charAt() busca em forma de array a posiçãp começando do indice zero.
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		
		//um metodo para concatenar/unir/juntar concat();
		System.out.println(s.concat(" !!!"));
		
		//outro metodo comum de concatenar
		System.out.println(s + " $$");
		
		 //start with é um metodo que siginifica "Inicia com()?"
		System.out.println(s.startsWith(""));
		
		// transforma toda string em letras minusculas e startwith = Inicio com?
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		// este é o inverso dessa de cima... para maiscula e endWith = Termina em..?
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		
		//conta o tamanho da string. Inclusive os espaços em branco.
		System.out.println(s.length());
		
		// confirmando se minha variavel "s" é EXATAMENTE igual a string passada("Boa tarde").
		System.out.println(s.equals("Boa tarde"));
		
		//aqui ela ignora se tem letras maiuscula ou minisculas... ela compara apenas se a informação bate
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Daniel";
		var sobrenome = "Oliveira Santos";
		var idade = 29;
		double salario = 1234.5987;
		var numeroId = 999;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome 
				+ "\nIdade: " + idade + "\nSalario: " + salario +
				"\nNumero de registro: " + numeroId +  "\n\n");
		
		
		System.out.printf("O senhor %s %s tem %d anos e "
				+ "ganha R$ %.2f por mês.%n", nome, sobrenome, idade, salario, numeroId);
		
		
		String frase = String.format("O senhor %s %s tem %d anos e "
				+ "ganha R$ %.2f por dia.%n", nome, sobrenome, idade, salario, numeroId);
		
		System.out.println(frase);
		
		System.out.println("Ola sem bem vindo ao meu mundo".length());
	}
}
