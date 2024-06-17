package udla.aquishpe.arboles;

/*Ingreso de valores
            4
     2              7
  1    3        6        9

estructra

           4
     7              2
  6    9        1      3





     */
public class invertBinaryTree {

    public Node invertTree(Node root) {

        if (root == null)
            return null;
        Node aux = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(aux);
        return root;
    }


    }



