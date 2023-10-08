package main.java.list.OperacoesBasicas;

import com.sun.source.tree.BreakTree;

public class item {
    private String nome;
    private double preco;
    private int quantidade;

    public item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return  quantidade + " " + nome;
    }
}