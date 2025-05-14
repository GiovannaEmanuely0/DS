
public class Livro {
	
	public Livro() {}
	
	Autor autor = new Autor();
	
	private String titulo;
	private int numPaginas;
	private String dataLancamento;
	private String genero;
	private String editora;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public int i = 1;
	
	public void showAll() {
		System.out.println("Dados do livro "+i+":");
		System.out.println("Título: "+getTitulo());
		System.out.println("Autor: "+autor.getNome());
		System.out.println("Editora: "+getEditora());
		System.out.println("Número de páginas: "+getNumPaginas());
		System.out.println("Gênero: "+getGenero());
		System.out.println("Data de lançamento: "+getDataLancamento());
		
	}

}
