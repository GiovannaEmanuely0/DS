import java.util.Scanner;
public class Exercicios {
Scanner read = new Scanner(System.in);
	
	public void nomeUse(String nome) {
		int cont = nome.length();
		
		if (cont <3) {
			System.out.println("Nome inválido, favor digite novamente um nome válido");
		} else {
			System.out.println("Nome Válido!");
			System.out.println("Seu nome: "+nome);
		}
	}//fim do método
	
	public void maiorIdade() {
		System.out.print("Idade: ");
		int idade = read.nextInt();
		if(idade <18) {
			System.out.println("Menor de idade!");
		}else {
			System.out.println("Maior de idade!");
		}
	}//fim do método
	
	public String cep() {
		String cep, resultado;
		System.out.println("CEP: ");
		cep = read.nextLine();
		
		resultado = cep.trim().substring(0,5);
		resultado = resultado +"-"+ cep.trim().substring(5,8);
		return resultado;
	}//fim do método
	
	public void dados(String nome, String email, int idade, double peso) {
		System.out.println("Nome: "+nome.toUpperCase());
		System.out.println("E-mail: "+email.toLowerCase());
		System.out.println("Idade: "+idade);
		System.out.printf("Peso %.2f",peso);
		
	}//fim do método
	
	public void pares () {
		for (int i = 100;i >0; i=i-2) {
			System.out.println(i);
		}
	}// fim do método
}
