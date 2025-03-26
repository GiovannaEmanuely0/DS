import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Exercicios exercicio = new Exercicios();
		
		System.out.println("Digitar o nome = 1");
		System.out.println("Maior ou menor de idade = 2");
		System.out.println("Digitar CEP = 3");
		System.out.println("Dados pessoais = 4");
		System.out.println("Números pares = 5");
		System.out.println("Escolha o seu exercício..."); 
		int escolha = read.nextInt();
		
		if(escolha == 1) {
			exercicio.nomeUse(read.next());
		}else if(escolha == 2) {
			exercicio.maiorIdade();
		}else if (escolha == 3) {
			System.out.println(exercicio.cep());
		}else if (escolha == 4) {
			exercicio.dados(read.next(), read.next(), read.nextInt(), read.nextDouble());
		} else {
			exercicio.pares();
		}
		
		read.close();

	}

}
