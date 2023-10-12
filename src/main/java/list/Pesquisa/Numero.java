package main.java.list.Pesquisa;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int numero){
        this.numero = numero;
    }
    public int compareTo(Numero n){
        return Integer.compare(numero, n.getNumero());
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return " "+ numero + " ";
    }
}
