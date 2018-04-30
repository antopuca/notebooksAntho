package venta.de.notebook;


import venta.de.notebook.DetalleOrden;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        items= new ArrayList<>();
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }
    
    
    
    public int getNroItems(){
    return items.size();
    }
    
    public void agregarItem(DetalleOrden detalle){
    items.add(detalle);
    }
    //Punto 2
    public float calcularTotalOrden(){
       // float subTotal=0;
        float totalOrden=0;
        DetalleOrden item;
        for(int i=0;i<items.size();i++){
            item= (DetalleOrden) items.get(i);
           // subTotal=orden.getCantidad()*orden.getPrecioUnitario();
            totalOrden+=item.getCantidad()*item.getPrecioUnitario();
        }
    return totalOrden;
    }
    
    
    public String toString(){
    return"Orden n°: "+id+"                    Fecha: "+creacion+"\n";
            }
    
    
    
    
    
    
    
    
    
}
