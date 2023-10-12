package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.java.list.Pesquisa.Numero;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }
    public List<Numero> ordenarAscendente(){
        List<Numero> numerosPorAscendente = new ArrayList<>(numeroList);
        Collections.sort(numerosPorAscendente);
        return numerosPorAscendente;
    }
    public List<Numero> ordenarDescendente(){
        List<Numero> numerosPorDescendente = new ArrayList<>(numeroList);
        Collections.reverse(numerosPorDescendente);
        return numerosPorDescendente;
    }

    public static void main (String[] args){
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(50);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.adicionarNumero(70);

        System.out.println("Ordem Ascendente: ");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println("------------------------------");
        System.out.println("Ordem descendente: ");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
