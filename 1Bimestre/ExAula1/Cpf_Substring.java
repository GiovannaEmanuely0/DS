import java.util.Scanner;
public class Cpf_Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cpf;
		System.out.println("Digite o n�mero do seu cpf:");
		cpf = sc.nextLine();
		
		if(cpf.trim().length() == 11) {
			System.out.print("O seu cpf eh: "+cpf.trim().substring(0, 3)+".");
			System.out.print(cpf.trim().substring(3, 6)+".");
			System.out.print(cpf.trim().substring(6, 9)+"-");
			System.out.print(cpf.trim().substring(9));
		}else {
			System.out.println("CPF inv�lido! Digite novamente");
		}
				
		sc.close();
	}

}
