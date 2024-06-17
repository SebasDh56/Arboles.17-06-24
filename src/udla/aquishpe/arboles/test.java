package udla.aquishpe.arboles;

public class test {

    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node (2);
        root.right=new Node(7);



        root.left.left=new Node (1);
        root.left.right=new Node (3);

        root.right.left=new Node (6);
       root.right.right=new Node (9);

        System.out.printf("IN-Order ");
        BinaryTreeTravel.inOrderTravel(root);
        System.out.println("  " );

        System.out.printf("Preorden  ");
        BinaryTreeTravel.preOrderTravel(root);
        System.out.println("  " );

        System.out.printf("Postorden  ");
        BinaryTreeTravel.postOrderTravel(root);
        System.out.println("  " );
        System.out.println("  " );
        System.out.println("  " );

        invertBinaryTree ibn=new invertBinaryTree();
        ibn.invertTree(root);

        System.out.printf("IN-Order ");
        BinaryTreeTravel.inOrderTravel(root);
        System.out.println("  " );

        System.out.printf("Preorden  ");
        BinaryTreeTravel.preOrderTravel(root);
        System.out.println("  " );

        System.out.printf("Postorden  ");
        BinaryTreeTravel.postOrderTravel(root);
        System.out.println("  " );




    }
}
