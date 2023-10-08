package main.java.list.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for(item i : carrinho){
                if(i.getNome().equals(nome)){
                    itensParaRemover.add(i);
                }
            }
            carrinho.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia!");

        }

    }
    public double calcularValorTotal(){
        double soma=0d;
        if (!carrinho.isEmpty()) {
            for(item i : carrinho){
                soma = soma + (i.getPreco() * ((double)i.getQuantidade()));
            }
            return soma;
        }else {
            System.out.println("A lista está vazia!");
            return 0d;
        }
    }
    public void exibirItens(){
        if (!carrinho.isEmpty()) {
            System.out.println(carrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 5.50, 2);
        carrinho.adicionarItem("Feijão", 6.50, 2);
        carrinho.adicionarItem("Macarrão", 2.50, 2);
        carrinho.exibirItens();
        System.out.println("Valor total dos itens: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Arroz");
        carrinho.exibirItens();
        System.out.println("Valor total dos itens: " + carrinho.calcularValorTotal());



    }

}
