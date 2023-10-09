package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //TESTES:

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println("Livros do Autor: Robert C. Martin");
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
        System.out.println("--------------------------------------");

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println("Livros do Autor: Autor Inexistente");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
        System.out.println("--------------------------------------");

        // Exibindo livros dentro de um intervalo de anos
        System.out.println("Intervalo 2010 - 2022");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
        System.out.println("--------------------------------------");

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println("Intervalo 2025 - 2030");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));
        System.out.println("--------------------------------------");

        // Exibindo livros por título
        System.out.println("Titulo: Java Guia Programador");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
        System.out.println("--------------------------------------");

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println("Titulo Inexistente");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
        System.out.println("--------------------------------------");
    }

}