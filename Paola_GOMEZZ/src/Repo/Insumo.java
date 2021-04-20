
package Repo;

public class Insumo{
  private int id;
  private String nombre;
  private String descripcion;


  public Insumo(int id, String nombre, String descripcion){
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public void setId(int id){
    this.id = id;
  } 

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }

  public int getId(){
    return this.id;
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getDescripcion(){
    return this.descripcion;
  }

  public String toString(){
    return "Id: " + getId() + " Nombre: " + getNombre() + " Descripcion: " + getDescripcion();
  }  
}