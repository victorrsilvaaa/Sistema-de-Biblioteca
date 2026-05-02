import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        BibliotecaService bibliotecaService = new BibliotecaService();
        bibliotecaService.execute(sc, livros);


    }
}
