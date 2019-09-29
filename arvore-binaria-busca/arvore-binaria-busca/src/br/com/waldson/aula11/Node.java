package br.com.waldson.aula11;

import java.util.Objects;

public class Node {
    private Node left = null;
    private Node right = null;
    private int value;

    //Métodos especiais
    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    //Métodos públicos

    public int getHeight() {
        int leftHeight = 0;
        int rightHeight = 0;

        if(getLeft() == null && getRight() == null){
            return 0;
        }

        if(this.getLeft() != null){
            leftHeight = this.getLeft().getHeight();
        }
        if(this.getRight() != null){
            rightHeight = this.getRight().getHeight();
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }
        return null;
    }

    public Node removeNode(Node node, int key){
        if(node == null){
            return node;
        }
        if(key > node.getValue()){
            node.right = removeNode(node.right, key);
        }else if (key < node.getValue()){
            node.left = removeNode(node.left, key);
        }else{
            if(key == node.getValue()){
                if(node.getLeft() == null && node.getRight() == null){
                    return null;
                }else if(node.getLeft() == null){
                    return node.getRight();
                }else if(node.right == null){
                    return node.getLeft();
                }else{
                    Integer min = minValue(node.right);
                    node.value = min;
                    node.right = removeNode(node.right, node.getValue());
                }
            }
        }
        return node;
    }

    private int minValue(Node node) {
        if(node.left != null){
            return minValue(node.left);
        }
        return node.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || o.getClass() != this.getClass()){
            return false;
        }

        Node node = (Node)o;
        return Objects.equals(o,this);
    }

    public boolean isBalanced() {

        if(getRight() == null && getLeft() == null){
            return true;
        }

        int leftHeight = 0;
        int rightHeight = 0;
        boolean leftBalanced = true;
        boolean rightBalanced = true;

        if(getLeft() != null){
           leftHeight =  getLeft().getHeight();
           leftBalanced = getLeft().isBalanced();
        }
        if(getRight() != null) {
            rightHeight = getRight().getHeight();
            rightBalanced = getRight().isBalanced();
        }

        if(Math.abs(leftHeight - rightHeight) <= 1 && leftBalanced && rightBalanced){
            return true;
        }
        return false;
    }
}


