
package Repo;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
      //Insumos Generales
      ArrayList<Insumo> lInsumos = new ArrayList<>();
      lInsumos.add(new Insumo(1, "Leche", "leche de Vaca"));
      lInsumos.add(new Insumo(2,"Huevos","Huevos de gallina"));
      lInsumos.add(new Insumo(3,"Azucar", "Azucar Morena"));
      lInsumos.add(new Insumo(4, "Chocolate", "Chocolate hershey"));
      lInsumos.add(new Insumo(5, "Harina", "Harina la Rosa"));
      lInsumos.add(new Insumo(6, "Vainilla", "Esencia de Vainilla"));
      lInsumos.add(new Insumo(7, "Leche Condesada", "Leche de Condensada Lata"));
      lInsumos.add(new Insumo(8, "Leche Evaporada", "Leche Evaporada litro"));
      lInsumos.add(new Insumo(9, "Galleta Oreo", "Paquete de Galletas Oreo"));

      //Postres
      ArrayList<Postre> lPostre = new ArrayList<>();
      lPostre.add(new Postre(1001, "Pastel Chocolates", 190));
      //Insumos del Postre Pastel Chocolate
      lPostre.get(0).setRecetaItem(new Receta(lInsumos.get(0), 1));
      lPostre.get(0).setRecetaItem(new Receta(lInsumos.get(1), 3));
      lPostre.get(0).setRecetaItem(new Receta(lInsumos.get(3), 4));
      lPostre.get(0).setRecetaItem(new Receta(lInsumos.get(4), 1));
      lPostre.add(new Postre(1002, "Pastel Galleta Oreo", 200));
      //Insumos del Postre Pastel Galleta Oreo
      lPostre.get(1).setRecetaItem(new Receta(lInsumos.get(8), 6));
      lPostre.get(1).setRecetaItem(new Receta(lInsumos.get(0), 1));
      lPostre.get(1).setRecetaItem(new Receta(lInsumos.get(1), 3));
      lPostre.get(1).setRecetaItem(new Receta(lInsumos.get(4), 1));
      lPostre.add(new Postre(1003, "Pastel 3 Leches", 190));
      //Insumos del Postre Pastel 3 leches
      lPostre.get(2).setRecetaItem(new Receta(lInsumos.get(4), 1));
      lPostre.get(2).setRecetaItem(new Receta(lInsumos.get(0), 1));
      lPostre.get(2).setRecetaItem(new Receta(lInsumos.get(7), 2));
      lPostre.get(2).setRecetaItem(new Receta(lInsumos.get(6), 2));
      lPostre.get(2).setRecetaItem(new Receta(lInsumos.get(1), 2));
      lPostre.get(2).setRecetaItem(new Receta(lInsumos.get(2), 3));
      lPostre.add(new Postre(1004, "Donas", 100));
      //Insumos del Postre Donas
      lPostre.get(3).setRecetaItem(new Receta(lInsumos.get(4), 1));
      lPostre.get(3).setRecetaItem(new Receta(lInsumos.get(5), 1));
      lPostre.get(3).setRecetaItem(new Receta(lInsumos.get(2), 4));
      lPostre.get(3).setRecetaItem(new Receta(lInsumos.get(1), 3));
      
      //Sucursales 
      Reposteria Butter = new Reposteria();
      Butter.setSucursal(new Sucursal("Buttercup"));
      Butter.setSucursal(new Sucursal("Los olivos"));
    
      //Sucursal Buttercup
      Butter.getSucursal().get(0).setPedido(
        new Pedido(1, 01, "Enero", 2021, new Cliente(100, "Juan"))
      );
      //orden de juan 
      Orden orden0 = new Orden(lPostre.get(0), 2);
      Butter.getSucursal().get(0).getPedidos().get(0).setOrden(orden0);
      
      //orden de Pedro
      Butter.getSucursal().get(0).setPedido(
        new Pedido(2, 01, "Enero", 2021, new Cliente(101, "Pedro"))
      );
      Orden orden1 = new Orden(lPostre.get(1), 1);
      Orden orden2 = new Orden(lPostre.get(3), 3);
      Butter.getSucursal().get(0).getPedidos().get(1).setOrden(orden1);
      Butter.getSucursal().get(0).getPedidos().get(1).setOrden(orden2);

      //orden keidy
      Butter.getSucursal().get(0).setPedido(
        new Pedido(3, 01, "Febrero", 2021, new Cliente(102, "keidy"))
      );
      Butter.getSucursal().get(0).getPedidos().get(2).setOrden(orden0);

      //Sucursal Los Olivos
      //orden de juan querendon
      Butter.getSucursal().get(1).setPedido(
        new Pedido(1, 01, "Enero", 2021, new Cliente(103, "Juan Querendon"))
      );
      Orden orden4 = new Orden(lPostre.get(2), 3);
      Butter.getSucursal().get(1).getPedidos().get(0).setOrden(orden4);

      //orden de Rafa Marquez
      Butter.getSucursal().get(1).setPedido(
        new Pedido(2, 01, "Enero", 2021, new Cliente(104, "Rafa Marquez"))
      );
      Orden orden5 = new Orden(lPostre.get(0), 1);
      Butter.getSucursal().get(1).getPedidos().get(1).setOrden(orden5);

      //orden uayeb
      Butter.getSucursal().get(1).setPedido(
        new Pedido(3, 01, "Febrero", 2021, new Cliente(105, "uayeb"))
      ); 
    Orden orden6 = new Orden(lPostre.get(0), 1);
      Butter.getSucursal().get(1).getPedidos().get(2).setOrden(orden6);
      
    //Reporte venta Diaria -> Buttercup
    System.out.println("Ventas Diaria -> Buttercup");
    Butter.getSucursal().get(0).ventaDiaria(01, "Enero", 2021);
    //Reporte venta Diaria -> Los Olivos
    System.out.println("Ventas Diaria -> Los Olivos");
    Butter.getSucursal().get(1).ventaDiaria(01, "Enero", 2021);

    //Reporte venta Mensual -> Buttercup
    System.out.println("Ventas Mensual -> Buttercup");
    Butter.getSucursal().get(0).ventaMes("Febrero", 2021);
    //Reporte venta Mensual -> Los Olivos
    System.out.println("Ventas Mensual -> Los Olivos"); 
    Butter.getSucursal().get(1).ventaMes("Febrero", 2021);

    //Reporte de Insumos General
    System.out.println("Insumos Generales"); 
    Butter.reporteInsumos(01, "Enero", 2021);
    }
    
}
