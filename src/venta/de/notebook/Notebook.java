package venta.de.notebook;


public class Notebook {
    private String marca;
    private String modelo;
    private String procesador;
    private Float tamañoDisco;

    public Notebook(String marca, String modelo, String procesador, Float tamañoDisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamañoDisco = tamañoDisco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public Float getTamañoDisco() {
        return tamañoDisco;
    }
    
    
    
}
