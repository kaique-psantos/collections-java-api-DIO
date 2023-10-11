package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList;

    public SomaNumeros(){
        this.numeroList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }
    public int calcularSoma(){
        int soma = 0;
        if(!numeroList.isEmpty()){
            for(Numero n : numeroList){
                soma = soma + n.getNumero();
            }
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maior=0, cont = 1;
        if(!numeroList.isEmpty()){
            for(Numero n : numeroList){
                if (cont == 1){
                    maior = n.getNumero();
                }else{
                    if(n.getNumero() > maior){
                        maior = n.getNumero();
                    }
                }
                cont++;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor=0, cont = 1;
        if(!numeroList.isEmpty()){
            for(Numero n : numeroList){
                if (cont == 1){
                    menor = n.getNumero();
                }else{
                    if(n.getNumero() < menor){
                        menor = n.getNumero();
                    }
                }
                cont++;
            }
        }
        return menor;
    }
    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(numeroList);
        }else{
            System.out.println("A lista está vazia");
        }
    }


    public static void main(String[] args){
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);

        int soma = somaNumeros.calcularSoma();
        System.out.print("Soma: " + soma);

        System.out.println("\n-------------------");
        int maior = somaNumeros.encontrarMaiorNumero();
        System.out.print("Maior número: "+ maior);
        System.out.println("\n-------------------");
        int menor = somaNumeros.encontrarMenorNumero();
        System.out.print("Menor número: "+ menor);
        System.out.println("\n-------------------");
        System.out.println("Lista: ");
        somaNumeros.exibirNumeros();


    }
}
