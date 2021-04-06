
package ejemplo;

public class Estudiante {
    String Nombre_estudiante;
    String Apellido_estudiante;
    //constructor
    public Estudiante (String Nombre_estudiante, String Apellido_estudiante){
        this.Nombre_estudiante=Nombre_estudiante;
        this.Apellido_estudiante=Apellido_estudiante;
    }
    //retorna variables
    public String toString(){
        return this.Nombre_estudiante+" "+this.Apellido_estudiante;    
    }
}
