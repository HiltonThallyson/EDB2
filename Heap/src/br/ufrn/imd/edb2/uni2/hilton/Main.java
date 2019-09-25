package br.ufrn.imd.edb2.uni2.hilton;

public class Main {

    public static void main(String[] args) {
        //heap / Priority queue

        FilaBanco fila = new FilaBanco();
        Pessoa m = new Pessoa("maria", 25);
        fila.addPessoa("fulano", 20);
        fila.addPessoa("Sicrano", 10);
        fila.addPessoa("vovó", 64);
        fila.addPessoa("Tio", 50);
        fila.addPessoa(m);
        fila.addPessoa(new Pessoa("beltrano", 5));


        m.setIdade(1);

        while (fila.getSize() > 0) {
            Pessoa p = fila.peek();
            System.out.println(p.getNome() + " está sendo atendido.");
            fila.remove();
        }

        //TODO atualizar prioridade quando mudar idade
        //Procurar por eventos(Como criar, disparar,etc), interface e visibilidade dos metodos;
    }
}
