public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int anoPublicacion;

    public Libro(String titulo, String autor, int numeroPaginas, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAnoPublicacion(int AnoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
}
