/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta.de.notebook;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VentaDeNotebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numOrden = 0;
        int cantidad = 0;
        float precioUnitario = 0;
        String modelo, marca, procesador;
        Float tamañoDisco;

        int dni;
        String nombreCliente;

        Notebook notebook;
        DetalleOrden detalle;
        Date fechHoy = new Date();
        Cliente cliente;
        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\nIngrese num de orden o Ingrese 0 para SALIR!");
        numOrden = entrada.nextInt();
        while (numOrden != 0) {
            Orden orden = new Orden(numOrden, fechHoy);
           // System.out.print(orden.toString());

            System.out.print("\n\nIngrese Nombre del  cliente:  ");
            nombreCliente = entrada.nextLine();
            String saltoDeLinea = entrada.nextLine();
            System.out.print("Ingrese DNI cliente:  ");
            dni = entrada.nextInt();
            cliente = new Cliente(nombreCliente, dni);

            for (int i = 0; i < 2; i++) {
                System.out.print("\n\nIngrese precio unitario de notebook:  ");
                precioUnitario = entrada.nextFloat();

                System.out.print("Ingrese cantidad de notebook:  ");
                cantidad = entrada.nextInt();

                saltoDeLinea = entrada.nextLine();

                System.out.print("Ingrese Marca de notebook:  ");
                marca = entrada.nextLine();

                System.out.print("Ingrese Modelo de notebook:  ");
                modelo = entrada.nextLine();

                System.out.print("Ingrese Procesador de notebook:  ");
                procesador = entrada.nextLine();

                System.out.print("Ingrese Disco Rigido de  notebook:  ");
                tamañoDisco = entrada.nextFloat();

                notebook = new Notebook(marca, modelo, procesador, tamañoDisco);
                detalle = new DetalleOrden(notebook, precioUnitario, cantidad);                
                orden.agregarItem(detalle);

            }
            Float totalOrden = orden.calcularTotalOrden();
            //Imprime factura
            System.out.println("\n\n*********************************************************************");
            System.out.print(orden.toString());
            System.out.println("\nTOTAL:      $"+ totalOrden);
            System.out.println("*********************************************************************");
            cliente.addOrden(orden);

            System.out.print("\n\nIngrese num de orden:  ");
            numOrden = entrada.nextInt();
        }
        

    }

}
