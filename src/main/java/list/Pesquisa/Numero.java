package main.java.list.Pesquisa;

public class Numero {
    private int numero;

    public Numero(int numero){
        this.numero = numero;
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
