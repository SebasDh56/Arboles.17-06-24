package udla.aquishpe.arboles;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println("  " );
        System.out.println("  " );



        ListOfDepths listOfDepths=new ListOfDepths();
        System.out.printf("Lista Arboñ Anchura  ");

        List<LinkedList<Node>> result=listOfDepths.ListOfDepths(root);
        assertEquals(4,result.get(0).get(0).vaule);
        assertEquals(2,result.get(1).get(0).vaule);
        assertEquals(7,result.get(1).get(1).vaule);
        assertEquals(1,result.get(2).get(0).vaule);
        assertEquals(3,result.get(2).get(1).vaule);
        assertEquals(6,result.get(2).get(2).vaule);
        assertEquals(9,result.get(2).get(3).vaule);








    }
}
