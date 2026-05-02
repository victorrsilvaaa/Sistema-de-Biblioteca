public class Livro {

    private String tintulo;
    private String autor;
    private boolean emprestado;

    public Livro(String autor, String tintulo) {
        this.autor = autor;
        this.emprestado = false;
        this.tintulo = tintulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getTintulo() {
        return tintulo;
    }

    public void setTintulo(String tintulo) {
        this.tintulo = tintulo;
    }

    @Override
    public String toString() {
        return "\n=== LIVRO ===" +
                "\nAutor: " + autor +
                "\nTítulo: " + tintulo +
                "\nEmprestado: " + (emprestado ? "Sim" : "Não");
    }

    }

