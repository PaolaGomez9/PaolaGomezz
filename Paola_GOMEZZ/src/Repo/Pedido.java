
package Repo;

import java.util.ArrayList;

public class Pedido{
  private int pedidoID;
  private int dia;
  private String mes;
  private int año;
  private Cliente cliente;
  private ArrayList<Orden> orden;
  //private double Total;
  

  public Pedido(int pedidoID, int dia, String mes, int año, Cliente cliente){
    this.pedidoID = pedidoID;
    this.dia = dia;
    this.mes = mes;
    this.año = año;
    this.cliente = cliente;
    orden = new ArrayList<>();
  }
  
  public void setPedidoID(int pedido){
    this.pedidoID = pedido;
  }

  public void setCliente(Cliente cliente){
    this.cliente = cliente;
  }

  public void setdia(int dia){
    this.dia = dia;
  }

  public void setMes(String mes){
  this.mes = mes;
  }

  public void setaño(int año){
    this.año = año;
  }

  public void setOrden(Orden orden){
    this.orden.add(orden);
  }

  public int getPedidoID(){
    return pedidoID;
  }

  public Cliente getCliente(){
    return cliente;
  }

  public int getDia(){
    return this.dia;
  }

  public int getAño(){
      return this.año;
  }

  public String getMes(){
    return this.mes;
  }  

  public ArrayList<Orden> getOrden(){
    return this.orden;
  }

  public double getTotal() {
    int temp = 0;
    for(int i = 0; i < this.orden.size(); ++i){
      temp += this.orden.get(i).getPostre().getPrecioUnidad() * this.orden.get(i).getCantidad();
    }
    return temp;
  }
}