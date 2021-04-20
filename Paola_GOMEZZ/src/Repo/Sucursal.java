
package Repo;

import java.util.ArrayList;

public class Sucursal {
  private String nombre;
  private ArrayList<Pedido> pedidos;

  public Sucursal(String nombre) {
    this.nombre = nombre;
    this.pedidos = new ArrayList<>();
  }

  public void setPedido(Pedido pedido) {
    this.pedidos.add(pedido);
  }

  public ArrayList<Pedido> getPedidos() {
    return this.pedidos;
  }

  public String getNombre() {
    return this.nombre;
  }

  private int existeOrden(ArrayList<Orden> detalle, String origen) {
    for (int i = 0; i < detalle.size(); ++i) {
      if (origen.equals(detalle.get(i).getPostre().getNombrePostre())) {
        return i;
      }
    }
    return -1;
  }

  void ventaDiaria(int dia, String mes, int año) {
    ArrayList<Orden> tempOrdArr;
    for (int i = 0; i < this.pedidos.size(); ++i) {
      tempOrdArr = new ArrayList<>();
      Pedido temp = this.pedidos.get(i);
      if (dia == temp.getDia() && mes.equals(temp.getMes()) && año == temp.getAño()) {
        for (int j = 0; j < temp.getOrden().size(); ++j) {
          Orden tempOrd = temp.getOrden().get(j);
          int pos = existeOrden(tempOrdArr, tempOrd.getPostre().getNombrePostre());
          if (pos == -1) {
            tempOrdArr.add(tempOrd);
          } else {
            tempOrdArr.get(pos).setCantidad(tempOrdArr.get(pos).getCantidad() + tempOrd.getCantidad());
          }
        }
      }
      String fecha = dia + " de " + mes + " del " + año;
      if (i == 0) {
        print(fecha, tempOrdArr, temp.getTotal(), true);
      } else {
        print(fecha, tempOrdArr, temp.getTotal(), false);
      }
    }
  }

  void ventaMes(String mes, int año) {
    ArrayList<Orden> tempOrdArr;
    for (int i = 0; i < this.pedidos.size(); ++i) {
      tempOrdArr = new ArrayList<>();
      Pedido temp = this.pedidos.get(i);
      if (mes.equals(temp.getMes()) && año == temp.getAño()) {
        for (int j = 0; j < temp.getOrden().size(); ++j) {
          Orden tempOrd = temp.getOrden().get(j);
          int pos = existeOrden(tempOrdArr, tempOrd.getPostre().getNombrePostre());
          if (pos == -1) {
            tempOrdArr.add(tempOrd);
          } else {
            tempOrdArr.get(pos).setCantidad(tempOrdArr.get(pos).getCantidad() + tempOrd.getCantidad());
          }
        }
      }
      String fecha = mes.toUpperCase() + " - " + año;
      if (i == 0) {
        print(fecha, tempOrdArr, temp.getTotal(), true);
      } else {
        print(fecha, tempOrdArr, temp.getTotal(), false);
      }
    }

  }

  private void print(String fecha, ArrayList<Orden> temp, double total, boolean header) {
    if (header) {
      System.out.println("+-----------+---------------+------------+--------------+---------------+-----------+");
      System.out.println("+   Fecha   +  Postre ID   +   Nombre   +   Cantidad   +   Precio U.   +   Total   +");
      System.out.println("+-----------+---------------+------------+--------------+---------------+-----------+");
      for (int i = 0; i < temp.size(); ++i) {
        System.out.println("| " + fecha + " | " + temp.get(i).getPostre().getPostreID() + " | "
            + temp.get(i).getPostre().getNombrePostre() + " |" + temp.get(i).getCantidad() + " | "
            + temp.get(i).getPostre().getPrecioUnidad() + " | " + total + " |");
      }
    } else {
      for (int i = 0; i < temp.size(); ++i) {
        System.out.println("| " + fecha + " | " + temp.get(i).getPostre().getPostreID() + " | "
            + temp.get(i).getPostre().getNombrePostre() + " |" + temp.get(i).getCantidad() + " | "
            + temp.get(i).getPostre().getPrecioUnidad() + " | " + total + " |");
      }
    }
  }
}