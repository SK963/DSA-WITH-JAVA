import java.util.HashMap;

public class Ceil_In_BST {

    static int findCeil(Node root, int x) {
        
        HashMap<Node , Node> par = new HashMap<>();
        
        
        Node curr = root;
        while(curr.data != x){
            if(curr.data > x){
                if(curr.left != null){
                    par.put(curr.left , curr);
                    curr = curr.left;
                }
                else return curr.data;
                
            }
            else if(curr.data < x){
                if(curr.right != null){
                    par.put(curr.right, curr);
                    curr = curr.right;
                }
                else {
                    
                    while(par.get(curr) != null && par.get(curr).data < x ){
                        curr = par.get(curr);
                    }
                    curr = par.get(curr);
                    if(curr != null && curr.data > x) return curr.data;
                    else return -1;
                }
            }
            
        }
        
        return curr.data;
        
    }


    public static void main(String[] args) {
        System.out.println(findCeil(new GFGBST().buildTree(new String[]{"5", "1", "7", "N", "2", "N", "N", "N", "3"}), 3));
    }

    
}
