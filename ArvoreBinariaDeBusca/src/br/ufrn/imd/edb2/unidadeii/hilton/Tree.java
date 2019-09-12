package br.ufrn.imd.edb2.unidadeii.hilton;

public class Tree {
    private Node root;

    //Construtor
    public Tree(){
        this.root = null;
    }

    //Métodos Especiais

    @Override
    public String toString() {
        return root.toString();
    }

    //Métodos Públicos
    private void insert(Node node){
        root.insert(node);
    }
    public void insert(int key, int value){
        Node node = new Node(key,value);
        if(root == null){
            this.root = node ;
        }else{
            insert(node);
        }
    }
    public class Node{
        private int key;
        private int value;
        private Node right = null;
        private Node left = null;

        //Construtor
        public Node(int key, int value){
           this.key = key;
           this.value = value;
        }
        //Métodos Especiais

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", right=" + right +
                    ", left=" + left +
                    '}';
        }

        //Métodos Públicos
        public void insert(Node node) {
            if(node.key == this.key){
                this.value = node.value;
            }else if(node.key > this.key){
                if(this.right == null){
                    this.right = node;
                }else{
                    this.right.insert(node);
                }
            }else{
                if(this.left == null){
                    this.left = node;
                }else{
                    this.left.insert(node);
                }
            }
        }
    }
}
