package main.java.list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return titulo+ ", " + autor + ", " + anoPublicacao + " | ";
    }
}
