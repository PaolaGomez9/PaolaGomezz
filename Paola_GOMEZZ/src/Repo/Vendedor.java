
package Repo;

import java.util.*;

public class Vendedor {
  private String nombreVendedor;
  private int NumVenta;

  public Vendedor() {

  }

  public Vendedor(String nombreVendedor, int NumVenta) {
    this.nombreVendedor = nombreVendedor;
    this.NumVenta = NumVenta;
  }

  public String getNombreVendedor() {
    return nombreVendedor;
  }

  public void setNombreVendedor(String nombreVendedor) {
    this.nombreVendedor = nombreVendedor;
  }

  public int getNumVenta() {
    return NumVenta;
  }

  public void setNumVenta(int NumVenta) {
    this.NumVenta = NumVenta;
  }

}