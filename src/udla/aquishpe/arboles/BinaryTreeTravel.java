package udla.aquishpe.arboles;

public class BinaryTreeTravel {
//recorrido del arbol por recursividad
    public static void inOrderTravel(Node node){
        if(node!=null) {
            inOrderTravel(node.left); /// algoritmoinorden
            System.out.printf(node.vaule + "  ");
            inOrderTravel(node.right);

        }

    }
    // recorrido en preroden con recursividad

    public static void preOrderTravel(Node node){
        if(node!=null) {
            System.out.printf(node.vaule+"  " );
            preOrderTravel(node.left);
            preOrderTravel(node.right);
        }

    }
    public static void postOrderTravel(Node node){
        if(node!=null) {
            postOrderTravel(node.left);
            postOrderTravel(node.right);
            System.out.printf(node.vaule+"  " );

        }

    }








}
