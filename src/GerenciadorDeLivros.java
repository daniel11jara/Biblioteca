import java.util.Scanner;

public class GerenciadorDeLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Biblioteca biblioteca = new Biblioteca();
		
		while (true) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1. adicionar");
			System.out.println("2. remover");
			System.out.println("3. listar");
			System.out.println("4. sair");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			if (opcao == 1) {
				Livro livro = new Livro();
				
				System.out.print("Título: ");
				livro.setTitulo(scanner.nextLine());
				
				System.out.print("Autor: ");
				livro.setAutor(scanner.nextLine());
				
				System.out.print("ISBN: ");
				livro.setIsbn(scanner.nextLine());
				
				biblioteca.adicionarLivro(livro);
			}else if(opcao == 2) {
				System.out.print("Digite o livro a ser removido: ");
				String titulo = scanner.nextLine();
				
				biblioteca.removerLivro(titulo);
				
			}else if (opcao == 3) {
				
				biblioteca.exibirLivros();
				
			}else if(opcao == 4) {
				
				System.out.println("finalizando o programa");
				
			}else {
				
				System.out.println("Opção inválida");
			}
		}
		
	}

}
