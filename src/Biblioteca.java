import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public boolean adicionarLivro(Livro livro) {
		if (encontrarLivroPorTitulo(livro.getTitulo()) != null) {
			System.out.println("Livro já existe");
			return false;
		} else if(livros.add(livro)) {
			System.out.println("Livro adicionado");
		}
		return true;
		
		
	}
	
	public boolean removerLivro(String titulo) {
		Livro livro = encontrarLivroPorTitulo(titulo);
		
		if (livro != null) {
			livros.remove(livro);
			System.out.println("Livro removido");
			return true;
		}else {
			System.out.println("Livro não encontrado");
			return false;
		}
	}
	
	private Livro encontrarLivroPorTitulo(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		
		return null;
	}
	
	public void exibirLivros() {
		
		if (livros.isEmpty()) {
			System.out.println("Lista está vazia");
		}else {
			System.out.println("---LISTA DE LIVROS---");
			
			for (Livro livro : livros) {
				System.out.println("Título: " + livro.getTitulo() + " | Autor: " + livro.getAutor() + " | ISBN: " + livro.getIsbn());
			}
		}
	}
	
	
	
	
	
	

}
