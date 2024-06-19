package udla.aquishpe.arboles;



/*
                4
        2                 7
     1     3
  9

*/
public class maxProfundidad {

    public int mP(Node root){

        if(root==null) return 0;

        int dletf=mP(root.left)+1;   /// el nodo raiz cuenta como nivel 0
        int dright=mP(root.right)+1;

        return Math.max(dletf,dright);


    }

}
