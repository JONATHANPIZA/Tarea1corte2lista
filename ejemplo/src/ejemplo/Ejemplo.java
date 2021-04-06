
package ejemplo;
import ListBase.*;

public class Ejemplo {

    public static void main(String[] args) {
        
         List_linked<Estudiante> estudiantes = new List_linked<>();
         //ingresar variables
         estudiantes.Addstudent(new Estudiante("Jonathan","Piza"));
         estudiantes.Addstudent(new Estudiante("Camilo","Castro"));
         estudiantes.Addstudent(new Estudiante("Andres","Roa"));
         estudiantes.Addstudent(new Estudiante("Nicolas","Roa"));
         estudiantes.Addstudent(new Estudiante("Maikol","Alvarez"));
         estudiantes.Addstudent(new Estudiante("Jonathan","Piza"));
         //impresion de la lista
         estudiantes.printlist();
         //impresion de la variable buscada
         estudiantes.printindic("Jonathan","Piza");
    }   
    
   
}
