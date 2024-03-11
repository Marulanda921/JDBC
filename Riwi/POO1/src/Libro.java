public class Libro {
    //1. Atributos
    private String titulo;
    private String autor;
    private String publicacion;
    private boolean prestado;


    //CONSTRUCTOR

    public Libro(String titulo, String autor, String publicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.prestado = prestado;
    }


    //2. Métodos

    //GETTERS AND SETTERS DE LA CLASE


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void cambiarEstado() {
        this.prestado = !this.prestado;
        System.out.println("Estado Actualizado: " + this.prestado);
    }

    //TOSTRING


    //Polimorfismo

    @Override //CUANDO APARECE LOS @SON DECORADORES
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", publicacion='" + publicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}


