package rbt;


public class RedBlackTree {
    private RedBlackNode root = null;


    public void insert(int i) {
        RedBlackNode node = new RedBlackNode(i);
        if(root == null){
            node.setColor(Color.BLACK);
            setRoot(node);
        }else {
            this.setRoot(insert(node, root));
        }
    }

    private RedBlackNode insert(RedBlackNode node, RedBlackNode parent) {
        if(parent == null){
            return node;
        }

        if(node.getKey() == parent.getKey()){
            return parent;
        }

        if(node.getKey() < parent.getKey()){
            parent.setLeft(insert(node, parent.getLeft()));
            return balance(parent.getLeft());
        }else{
            parent.setRight(insert(node, parent.getRight()));
            return balance(parent.getRight());
        }

    }

    private RedBlackNode balance(RedBlackNode node) {
        //Primeiro caso
        if(node.equals(root)){
            node.setColor(Color.BLACK);
            return node;
        }

        //Segundo caso
        if(node.getParent().getColor().equals(Color.BLACK)){
            return node.getParent();
        }

        //Terceiro caso e quarto caso
        if(node.getParent().getColor().equals(Color.RED)){
            RedBlackNode uncle;
            if(node.getParent().getParent().getLeft().equals(node.getParent())){
                uncle = node.getParent().getParent().getRight();
            }else{
                uncle = node.getParent().getParent().getLeft();
            }

            //terceiro caso
            if(uncle.getColor().equals(Color.RED)){
                uncle.flipColor();
                uncle.getParent().flipColor();
                node.getParent().flipColor();
                balance(uncle.getParent());
                return node.getParent();
            }else{

            }
        }
        return node.getParent();
    }

    public RedBlackNode getRoot() {
        return root;
    }

    public void setRoot(RedBlackNode root) {
        this.root = root;
    }


}
