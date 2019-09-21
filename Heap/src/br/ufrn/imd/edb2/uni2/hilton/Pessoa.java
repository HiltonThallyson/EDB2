package br.ufrn.imd.edb2.uni2.hilton;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private final List<Listener> listeners = new ArrayList<>();


    //Métodos Especiais

    public void addListener(FilaBanco fila){
        listeners.add(fila);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        for(Listener l : listeners){
            l.notifyEvent();
        }
    }


}
