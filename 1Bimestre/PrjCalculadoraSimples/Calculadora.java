import java.util.*;
public class Calculadora {

	//Istanciar o objeto tipo Scanner
	Scanner reader = new Scanner(System.in);
	
	double result;
	double num1, num2, num3 = 1;
	String operador1, operador2;
	
	public void operacao() {
		System.out.println("Insira os valores para calcular");
		do {
			
			num1 = reader.nextDouble();
			operador1 = reader.next();
			num2 = reader.nextDouble();
			operador2 = reader.next();
			if(operador1.equals("+")) {
				adicao1();
			}else if(operador1.equals("-")) {
				subtracao1();
			}else if(operador1.equals("*")) {
				multiplicacao1();
			}else if(operador1.equals("/")) {
				divisao1();
			}else if(operador1.equals("^")) {
				potencia();
			}
			
		}while(!operador2.equals("="));
		System.out.println("Resultado = "+result);
		
	}//fim do m�todo operacao
	
	//m�todo adi��o
	public void adicao1() {
		result = num1;
		result = result + num2;
	}//fim do m�todo
	public void subtracao1() {
		result = num1;
		result = result - num2;
	}
	public void multiplicacao1() {
		result = num1;
		result = result * num2;
	}
	public void divisao1() {
		result = num1;
		result = result / num2;
	}
	public void potencia() {
		for(int i=0;i<num2;i++) {
			num3 = num3*num1;
		}
		result = num3;
	}
	
	
	
}//fim da classe
