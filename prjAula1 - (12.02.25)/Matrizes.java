public class Matrizes {

	public static void main(String[] args) {
		
		int i,j, soma=0;
		
		String nome = "GiovannaBeatriz";
		int idade = 16;
		double peso = 57.000;
		
		System.out.println(nome + " " + idade + " " + peso);
		
		// %s - tipo String, %d - tipo inteiro, %f - tipo double
		System.out.printf("nome: %s idade %d peso %.1f", nome, idade, peso);
		
		System.out.println();
		
		//vetores
		
		int[] v = new int[5];
		
		v[0] = 2;
		v[1] = 5;
		v[2] = 6;
		v[3] = 3;
		v[4] = 4;
		
		for(i = 0;i<5;i++) {
			System.out.println("Vetor "+i+" = "+v[i]);
		}
		
		System.out.println();
		
		//matrizes          //L  C
		int [] [] m = new int[2][3];
		
		m[0][0] = 2;
		m[0][1] = 4;
		m[0][2] = 6;
		m[1][0] = 8;
		m[1][1] = 10;
		m[1][2] = 12;
		
		//for dentro de um for para matrizes
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(m[i][j]+" ");
				soma = soma + m[i][j];			
			}
			System.out.println();
		}
		System.out.println("A soma dos valores da matriz é: "+soma);
		
	}

}
