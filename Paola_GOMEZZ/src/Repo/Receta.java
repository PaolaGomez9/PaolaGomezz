package Repo;

public class Receta{
  private int cantidad;
  private Insumo insumo;
  
  public Receta(Insumo insumo, int cantidad){
    this.cantidad = cantidad;
    this.insumo = insumo;
  }

  public void setCantidad(int cantindad){
    this.cantidad = cantindad;
  }

  public int getCantidad(){
    return this.cantidad;
  }

  public Insumo getInsumo(){
    return this.insumo;
  }
}