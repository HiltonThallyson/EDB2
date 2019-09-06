package br.ufrn.imd.edb2.hilton.aula09;

public class Main {

    public static void main(String[] args) {
        Node root = new Node("Raiz");
        Node child = root.addChild("Filho 1");
        node child2 = root.addChild("Filho 2")
        root.addChild(child2);

        child.addChild(new Node("Neto 1"));
    }
}
