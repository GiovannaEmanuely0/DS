import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Enfermaria ferm = new Enfermaria();
		int i = 1;
		ferm.cadastrarFunc();
		System.out.println("Dados do funcionário "+i);
		ferm.apresentarInfo();
		
		read.close();
	}

}
