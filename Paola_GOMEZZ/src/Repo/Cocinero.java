
package Repo;

public class Cocinero {
    private String id;
    private String nombre;
    private int NumeroCocinero;// Numero cocinero tendra el numero del cocinero que este en turno 

   public Cocinero(){
   
   } 
    
    
    public Cocinero(String id, String nombre, int NumeroCocinero) {
        this.id = id;
        this.nombre = nombre;
        this.NumeroCocinero = NumeroCocinero;
    }

   
    

    @Override
    public String toString() {
        return "Cocinero{" + "id=" + id 
                + ", nombre=" + nombre + 
                ", NumeroCocinero=" + NumeroCocinero + '}';
    } 
}
