package br.com.waldson.aula11;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(new Node(6));
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        tree.insert(1);
        tree.insert(0);

        System.out.println(tree.getHeight());
        System.out.println(tree.isBalanced());


//        Node n = tree.search(80);
//        if (n != null) {
//            System.out.println("Elemento encontrado");
//        } else {
//            System.out.println("Elemento não encontrado");
//        }
//
//        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(tree);
//        JFrame frame = new JFrame("Visualizador de ABB");
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//        frame.add(view);
////
//        frame.setVisible(true);
////        tree.remove(6);
////        tree.remove(8);
//        System.out.println(tree.isBalanced());
    }
}
