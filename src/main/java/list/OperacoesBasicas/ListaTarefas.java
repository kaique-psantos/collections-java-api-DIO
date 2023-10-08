package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
       tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("O número total de elementos é: " + lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos é: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos é: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();
    }
}
