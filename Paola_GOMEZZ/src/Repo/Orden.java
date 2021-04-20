
package Repo;

import java.util.ArrayList;

public class Orden{
  private int cantidad;
  private Postre postre;
  
  public Orden(Postre postre, int cantidad){
    this.cantidad = cantidad;
    this.postre = postre;
  }

  public void setCantidad(int cantidad){
    this.cantidad = cantidad;
  }

  public int getCantidad(){
    return this.cantidad;
  }

  public Postre getPostre(){
    return this.postre;
  }

  public ArrayList<Receta> getSuministros(){
    for (int i = 0 ; i < this.postre.getRecetas().size(); ++i){
      Receta temp = this.postre.getRecetas().get(i);
      temp.setCantidad(temp.getCantidad() * this.cantidad);
    }
    return this.postre.getRecetas();
  }

  
}