
package ListBase;

public class List_linked <G> implements I_linkedlist <G>{
    private int size;
    private Node_list <G> nodoinicio ;
    private Node_list <G> nodofinal ;
    
    public List_linked(){
        this.size=0;
        this.nodoinicio=null;
        this.nodofinal=null;
    }
    //imprimir lista
    @Override
    public void printlist(){
        Node_list <G> nodolectura = this.nodoinicio;
        int count=0;
        System.out.println("-------------------------------");
        for(int i=0; i<size;i++){
            Node_list <G> nodo = nodolectura; 
            System.out.println(count+1+": "+nodo.getdata().toString());
            nodolectura=nodolectura.getnode();
            count++;
        }
        System.out.println("-------------------------------");
    }
    //busqueda de variable
    @Override
    public void printindic(String b_nombre,String b_apellido){
        Node_list <G> nodolectura = this.nodoinicio;
        int count=0;
        for(int i=0; i<size;i++){
            Node_list <G> nodo = nodolectura; 
            if(nodo.getdata().toString().equals(b_nombre+" "+b_apellido)){
                System.out.println(count+1+": "+nodo.getdata().toString());
            } 
            count++;
            nodolectura=nodolectura.getnode();
        }
    }
    //agregar estudiante
    @Override
    public void Addstudent(G obj){
        if(size == 0){
            this.nodoinicio = new Node_list <G> (obj);
            this.nodofinal=this.nodoinicio;
        }else{
            Node_list <G> nextnode = new Node_list<>(obj);
            this.nodofinal.Setnextnode(nextnode);
            this.nodofinal = nextnode;
        }size++;
    }
    
}
