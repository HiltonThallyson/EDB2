package br.ufrn.imd.edb2.hilton.aula11;

public class ArvoreBuscaBinaria {

    private Node root = null;

    public void insert(Node node){
        if(root == null){
            root = node;
            return;
        }
        root.insert(node);
    }

    public void insert(int value){
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int k){
        if(root == null){
            return null;
        }
        return root.search(k);
    }

    public class Node{
        private int key;
        private Node left = null;
        private Node right = null;

        public Node(int k) {
            key = k;
        }

        public int getKey() {
            return key;
        }

        public void insert(Node no){
            if(no.key>this.key){
                if(right == null){
                    this.right = no;
                }else{
                    this.right.insert(no);
                }
            }

            else if(no.key<this.key) {
                if(left == null){
                    this.left = no;
                }else{
                    this.left.insert(no);
                }

            }
        }

        public Node search(int k){
            if(k == this.key) {
                return this;
            }

            if(k > this.key){
                if(right == null){
                    return null;
                }
                return right.search(k);
            }
            if(k < this.key){
                if(left == null){
                    return null;
                }
                return left.search(k);
            }
            return null;
        }
    }
}

