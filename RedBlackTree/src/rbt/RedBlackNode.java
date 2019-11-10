package rbt;

public class RedBlackNode {
    private int key;
    private Color color = Color.RED;
    private RedBlackNode left = null;
    private RedBlackNode right = null;
    private RedBlackNode parent = null;

    public RedBlackNode(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public RedBlackNode getLeft() {
        return left;
    }

    public void setLeft(RedBlackNode left) {
        this.left = left;
        left.setParent(this);
    }

    public RedBlackNode getRight() {
        return right;
    }

    public void setRight(RedBlackNode right) {
        this.right = right;
        right.setParent(this);
    }

    public RedBlackNode getParent() {
        return parent;
    }

    public void setParent(RedBlackNode parent) {
        this.parent = parent;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void flipColor() {
        if(color.equals(Color.RED)){
            setColor(Color.BLACK);
        }else{
            setColor(Color.RED);
        }
    }
}
