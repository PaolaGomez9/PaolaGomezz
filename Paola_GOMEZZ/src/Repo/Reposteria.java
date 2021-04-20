
package Repo;

import java.util.ArrayList;

public class Reposteria {
  private ArrayList<Sucursal> sucursales;

  public Reposteria() {
    this.sucursales = new ArrayList<>();
  }

  public void setSucursal(Sucursal sucursal) {
    this.sucursales.add(sucursal);
  }

  public ArrayList<Sucursal> getSucursal(){
    return this.sucursales;
  }

  public void reporteInsumos(int dia, String mes, int año) {
    ArrayList<Receta> tempRecArr;
    for (int i = 0; i < this.sucursales.size(); ++i) {
      tempRecArr = new ArrayList<>();
      Sucursal tempS = this.sucursales.get(i);
      for (int j = 0; j < tempS.getPedidos().size(); ++j) {
        Pedido tempP = tempS.getPedidos().get(j);
        if (dia == tempP.getDia() && mes.equals(tempP.getMes()) && año == tempP.getAño()) {
          for (int k = 0; k < tempP.getOrden().size(); ++k) {
            ArrayList<Receta> tempOrd = tempP.getOrden().get(k).getSuministros();
            for (int l = 0; l < tempOrd.size(); ++l) {
              Receta tempRec = tempOrd.get(l);
              int pos = existeInsumo(tempRecArr, tempRec.getInsumo().getNombre());
              if (pos == -1) {
                tempRecArr.add(tempRec);
              } else {
                tempRecArr.get(pos).setCantidad(tempRecArr.get(pos).getCantidad() + tempRec.getCantidad());
              }
            }
          }
        }
      }
      String fecha = dia + " de " + mes + " del " + año;
      if (i == 0){
        print(fecha, tempS.getNombre(), tempRecArr, true);
      }else{
        print(fecha, tempS.getNombre(), tempRecArr, false);
      }
    }
  }

  private int existeInsumo(ArrayList<Receta> detalle, String origen) {
    for (int i = 0; i < detalle.size(); ++i) {
      if (origen.equals(detalle.get(i).getInsumo().getNombre())) {
        return i;
      }
    }
    return -1;
  }

  private void print(String fecha, String sucursal, ArrayList<Receta> temp, boolean header){
    if (header){
      System.out.println("+-----------+--------------+------------+--------------+");
      System.out.println("+   Fecha   +   Sucursal   +   Insumo   +   Cantidad   +");
      System.out.println("+-----------+--------------+------------+--------------+");
      for(int i = 0; i < temp.size(); ++i){
        System.out.println("| " + fecha +" | " + sucursal + " | " + temp.get(i).getInsumo().getNombre() +" |" + temp.get(i).getCantidad() +" |");
      }
    }else{
      for(int i = 0; i < temp.size(); ++i){
        System.out.println("| " + fecha +" | " + sucursal + " | " + temp.get(i).getInsumo().getNombre() +" |" + temp.get(i).getCantidad() +" |");
      }
    }
  }
}