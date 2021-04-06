
package ListBase;

public class Node_list <G> {
    private G Container;
    private Node_list Nextnode;
    
    //nodo
    public Node_list(G data, Node_list next){
        this.Container=data;
        this.Nextnode=next;
    }
    //nodo final
    public Node_list(G data){
        this.Container=data;
        this.Nextnode=null;
    }
    //retorna datos
    public G getdata(){
        return Container;
    } 
    //cambio de nodo
    public void Setnextnode(Node_list next){
        this.Nextnode=next;
    } 
    //retorna el siguiente nodo
    public Node_list getnode(){
        return Nextnode;
    }
}
