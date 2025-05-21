
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner Bia = new Scanner (System.in);
		
		System.out.println("Digite 1 para Gerente e 2 para Assistente: ");
		
		int num;
		num = Bia.nextInt();
		
		if (num==1) {
			Gerente ge = new Gerente();
			
			ge.lerDados();
			System.out.println(" ");
			ge.listarDados();
		
		} else {
			Assistente assi = new Assistente();
			
			assi.lerDados();
			System.out.println(" ");
			assi.listarDados();
		}
	}

}
