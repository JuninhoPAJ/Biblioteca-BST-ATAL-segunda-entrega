import java.util.Scanner;

public class GerenciadorLivros {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU - GERENCIADOR DE LIVROS =====");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros em ordem alfabética");
            System.out.println("3. Buscar livros por autor");
            System.out.println("4. Buscar livros por ano");
            System.out.println("5. Recomendar livros por intervalo de anos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Adicionar Livro ===");
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer

                    arvore.adicionarLivro(new Livro(titulo, autor, ano));
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== Lista de Livros (Ordem Alfabética) ===");
                    arvore.listarLivros();
                    break;

                case 3:
                    System.out.println("\n=== Buscar Livros por Autor ===");
                    System.out.print("Digite o nome do autor: ");
                    String autorBusca = scanner.nextLine();
                    System.out.println("\nLivros do autor '" + autorBusca + "':");
                    arvore.listarLivrosPorAutor(autorBusca);
                    break;

                case 4:
                    System.out.println("\n=== Buscar Livros por Ano ===");
                    System.out.print("Digite o ano de publicação: ");
                    int anoBusca = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    System.out.println("\nLivros publicados no ano " + anoBusca + ":");
                    arvore.listarLivrosPorAno(anoBusca);
                    break;

                case 5:
                    System.out.println("\n=== Recomendar Livros por Intervalo de Anos ===");
                    System.out.print("Digite o ano inicial: ");
                    int anoInicio = scanner.nextInt();
                    System.out.print("Digite o ano final: ");
                    int anoFim = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    System.out.println("\nLivros publicados entre " + anoInicio + " e " + anoFim + ":");
                    arvore.recomendarLivrosPorIntervalo(anoInicio, anoFim);
                    break;

                case 0:
                    System.out.println("\nSaindo do sistema... Obrigado por usar o Gerenciador de Livros!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
