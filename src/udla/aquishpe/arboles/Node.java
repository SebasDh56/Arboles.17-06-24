package udla.aquishpe.arboles;

public class Node {

    public int vaule;
    public Node left;
    public Node right;

    public Node(int vaule) {
        this.vaule = vaule;
    }

    public int getVaule() {
        return vaule;
    }

    public void setVaule(int vaule) {
        this.vaule = vaule;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

