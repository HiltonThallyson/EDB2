package br.ufrn.imd.edb2.unidadeii.hilton;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1,10);

        System.out.println(tree);
        tree.insert(1,20);
        System.out.println(tree);
        tree.insert(2,30);
        tree.insert(4,25);
        tree.insert(3,400);
        System.out.println(tree);
    }
}
