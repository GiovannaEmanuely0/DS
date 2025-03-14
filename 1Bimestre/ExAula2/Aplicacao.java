
public class Aplicacao {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario ();
		
		func1.cpf = "123.456.789.01";
		func1.email = "func1@gmail.com";
		func1.funcionario = "Joaozinho";
		func1.idade = 22;
		func1.fone = "(11) 947284067";
		
		Remedio rem1 = new Remedio ();
		
		rem1.descricao = "use com indicação médica";
		rem1.faixaEtaria = "uso adulto";
		rem1.nomeRemedio = "dipirona";
		rem1.tipo = "anti-inflamatório";
		rem1.validade = "01/12/2025";
		rem1.estoque = "tem em estoque";
		rem1.quant = 100;
		
		Venda vendinha = new Venda();
		
		vendinha.preco = 57;
		vendinha.produto = "remédio";
		vendinha.quantidadeProduto = 2;
		vendinha.valorTotalVenda = vendinha.preco*vendinha.quantidadeProduto;
		
		//System.out.println(vendinha.valorTotalVenda);
	}

}
