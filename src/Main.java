public class Main {
    public static void main(String[] args) {
        Libro librouno = new Libro("El principito", "Antoine de Saint-Exupéry", 96, 1943);
        Libro librodos = new Libro("Cien años de soledad", "Gabriel García Márquez", 417, 1967);

        System.out.println("Libro 1:");
        System.out.println("Titulo: " + librouno.getTitulo());
        System.out.println("Autor: " + librouno.getAutor());
        System.out.println("Numero de paginas: " + librouno.getNumeroPaginas());
        System.out.println("Año de publicación: " + librouno.getAnoPublicacion());

        System.out.println("\nLibro 2:");
        System.out.println("Titulo: " + librodos.getTitulo());
        System.out.println("Autor: " + librodos.getAutor());
        System.out.println("Numero de paginas: " + librodos.getNumeroPaginas());
        System.out.println("Año de publicación: " + librodos.getAnoPublicacion());

        librouno.setNumeroPaginas(100);

        System.out.println("\nLibro 1 actualizado:");
        System.out.println("Titulo: " + librouno.getTitulo());
        System.out.println("Autor: " + librouno.getAutor());
        System.out.println("Numero de paginas: " + librouno.getNumeroPaginas());
        System.out.println("Año de publicación: " + librouno.getAnoPublicacion());

    }
}