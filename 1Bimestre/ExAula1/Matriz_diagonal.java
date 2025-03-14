import java.util.Scanner;
public class Matriz_diagonal {

	public static void main(String[] args) {
		Scanner gica = new Scanner(System.in);
		
		int i,j, tm = 4, num=01;
		int [] [] d = new int[tm][tm];
		for(i=0;i<tm;i++) {
			for(j=0;j<tm;j++) {
				d[i][j]= num;
				num++;
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("DIAGONAL = ");
		for(i=0;i<tm;i++) {
			for(j=0;j<tm;j++) {
				if(i == j){
					System.out.print(d[i][j]+" ");
				}
				// System.out.println(d[i][j]);
			}
		}
		
		//Outra forma de se resolver
		for(i=0;i<tm;i++) {
			//tendo o i igual ao i, tendo os mesmos valores
			System.out.println(d[i][i]);
		}
		
		gica.close();
	}

}
