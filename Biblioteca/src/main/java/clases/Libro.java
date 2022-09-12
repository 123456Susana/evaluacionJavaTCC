package clases;

public class Libro {
    private String nombre;
    private String codigo;
    private int numeroDePaginas;
    private int numeroDeEjemplares;
    private String autor;

    public Libro() {
    }

    public Libro(String nombre, String codigo, int numeroDePaginas, int numeroDeEjemplares, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroDePaginas = numeroDePaginas;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
