import java.util.Scanner;
public class ExercicioRevisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String use;
		String senha;
		String confirmacao;
		
		System.out.println("Digite o nome de usu�rio:");
		use = sc.nextLine();
		System.out.println("Digite a senha:");
		senha = sc.next();
		System.out.println("Confirmar senha:");
		confirmacao = sc.next();
		
		if(senha.equals(confirmacao)) {
			System.out.println("Nome: "+use+" Congratulations Bro!!!");
		}else {
			System.out.println("Nome: "+use+" Senhas incompat�veis!");
		}
		
		//Deixa todas as letras mai�sculas
		System.out.println(use.toUpperCase());
		//Tira os espa�os do em branco do come�o e do final, mas n�o do meio
		System.out.println(use.trim());
		//O m�todo length conta os caracteres da String
		System.out.println(use.trim().length());
		
		sc.close();
	}

}
