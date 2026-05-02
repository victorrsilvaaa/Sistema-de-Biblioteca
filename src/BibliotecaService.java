import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaService {

    public void execute(Scanner sc ,ArrayList<Livro> livros){
        System.out.println("ESCOLHA UMA DAS OPÇÕES PARA ACESSO A BIBLIOTECA");

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("1- Cadastrar livro");
            System.out.println("2- Listar Livros");
            System.out.println("3- Emprestar Livros");
            System.out.println("4- Devolver Livros");
            System.out.println("5- Buscar Livros");
            System.out.println("6- Sair");
            System.out.println();
            System.out.println("Escolha a opção:");

            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    cadastrarLivro(sc, livros);
                    break;
                case 2:
                    listarLivros(livros);
                    break;

                case 3:
                    pegarEmprestado(sc, livros);
                    break;
                case 4:
                    devolverLivro(sc, livros);
                    break;
                case 5:
                    buscarLivros(sc, livros);
                    break;

                case 6:
                    sairBiblioteca();
                    break;

                default:
                    System.out.println("Opção invalida, escolha novamente!");
                    System.out.println();
                    break;
            }

        }
    }

     private void cadastrarLivro(Scanner sc, ArrayList<Livro> livros) {
        System.out.println("Digite o Titulo do Livro:");
        String nomeTitulo = sc.nextLine();

        System.out.println("Digite o nome do autor:");
        String nomeAutor = sc.nextLine();

        livros.add(new Livro(nomeAutor, nomeTitulo));

        System.out.println("Livro Cadastrado!");
    }

     private void listarLivros(ArrayList<Livro> livros) {
        for (Livro a : livros) {
            System.out.println(a);

        }

    }

     private void pegarEmprestado(Scanner sc, ArrayList<Livro> livros) {
        System.out.println("Digite o Titulo do Livro que Deseja Pegar Emprestado:");
        String emprestado = sc.nextLine();
        var foiEncontrado = false;
        for (Livro a : livros) {

            if (emprestado.equalsIgnoreCase(a.getTintulo())) {
                foiEncontrado = true;
                if (a.isEmprestado()) {
                    System.out.println("Livro encontrado, porem já foi emprestado!");
                    break;
                }

                a.setEmprestado(true);
                System.out.println("Livro: " + a.getTintulo() + " Emprestado!");

            }
        }
        if (!foiEncontrado) {
            System.out.println("Livro Não encontrado");
        }

    }

     private void devolverLivro(Scanner sc, ArrayList<Livro> livros) {
        System.out.println("Digite o nome do Livro que deseja devolver:");
        String devolucao = sc.next();
        var foiDevolvido = false;

        for (Livro d : livros) {
            if (devolucao.equalsIgnoreCase(d.getTintulo())) {
                d.setEmprestado(false);
                System.out.println("Devolucao feita!");
                foiDevolvido = true;
                break;

            }
        }
        if (!foiDevolvido) {
            System.out.println("Livro que deseja devolver não encontrado!");
        }
    }

     private void buscarLivros(Scanner sc, ArrayList<Livro> livros) {
        System.out.println("Livros Encontrados:");

        for (Livro a : livros) {
            System.out.println(a.getTintulo());
        }
    }

     private void sairBiblioteca() {
        System.out.println("Saindo da biblioteca!");
    }
}
