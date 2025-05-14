
public class App {

	public static void main(String[] args) {
		
		Livro book = new Livro();
		Autor autor = new Autor();
		
		book.setTitulo("Dom Casmurro");
		autor.setNome("Machado de Assis");
		book.setEditora("Principis");
		book.setGenero("Realismo psicológico, romance impressionista.");
		book.setDataLancamento("5 de dezembro de 1899");
		book.setNumPaginas(208);
		
		book.showAll();

	}

}
