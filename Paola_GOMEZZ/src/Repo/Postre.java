
package Repo;

import java.util.ArrayList;

public class Postre{
    private int PostreID;
    private String NombrePostre;
    private int PrecioUnidad;
    private ArrayList<Receta> receta;
   
   public Postre(){
     
   }
    public Postre( int PostreID, String NombrePostre, int PrecioUnidad) {
        this.PostreID = PostreID;
        this.NombrePostre = NombrePostre;
        this.PrecioUnidad = PrecioUnidad;
        this.receta = new ArrayList<>();
    }

    public void setPostreID(int PostreID) {
        this.PostreID = PostreID;
    }

    public void setNombrePostre(String NombrePostre) {
        this.NombrePostre = NombrePostre;
    }

    public void setRecetaItem(Receta receta) {
        this.receta.add(receta);
    }

    public void setPrecioUnidad(int PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    public int getPostreID() {
        return PostreID;
    }

    public String getNombrePostre() {
        return NombrePostre;
    }

    public int getPrecioUnidad() {
        return PrecioUnidad;
    } 

    public ArrayList<Receta> getRecetas(){
      return this.receta;
    }
}