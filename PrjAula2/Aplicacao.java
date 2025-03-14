
public class Aplicacao {

	public static void main(String[] args) {
		//Declaração de um novo objeto, usando a minha classe Aluno
		//Ele é um objeto por ter o new na frente
		Aluno alu1 = new Aluno();
		
		//Aqui está a minha classe Scanner, com o meu objeto sc
		//Scanner sc = new Scanner(System.in); - este é um exemplo de objeto
		//Scanner sc; - Este seria um exemplo de atributos
		
		//Utilizando a minha classe junto com seus atributos
		alu1.nome = "Beatriz";
		alu1.idade = 16;
		alu1.email = "beatrizpereiram2021@gmail.com";
		alu1.cpf = "282.653.148-41";
		
		System.out.println(alu1.nome);
		

	}

}
