import java.util.Scanner;
public class ExercicioRevisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String use;
		String senha;
		String confirmacao;
		
		System.out.println("Digite o nome de usuário:");
		use = sc.nextLine();
		System.out.println("Digite a senha:");
		senha = sc.next();
		System.out.println("Confirmar senha:");
		confirmacao = sc.next();
		
		if(senha.equals(confirmacao)) {
			System.out.println("Nome: "+use+" Congratulations Bro!!!");
		}else {
			System.out.println("Nome: "+use+" Senhas incompatíveis!");
		}
		
		//Deixa todas as letras maiúsculas
		System.out.println(use.toUpperCase());
		//Tira os espaços do em branco do começo e do final, mas não do meio
		System.out.println(use.trim());
		//O método length conta os caracteres da String
		System.out.println(use.trim().length());
		
		sc.close();
	}

}
