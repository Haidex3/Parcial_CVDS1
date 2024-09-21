package edu.eci.cvds.tdd.monitoreo;

import edu.eci.cvds.tdd.monitoreo.producto.Producto;
import edu.eci.cvds.tdd.monitoreo.Center;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.logging.ConsoleHandler; 
import java.util.logging.FileHandler; 
import java.util.logging.Handler; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.SimpleFormatter;

/*
    *This class is the "center of the sistem" she manage the data of products
*/
public class Center{
    private final static Logger LOG_MONITORING = Logger.getLogger("com.tests.project");

    private final Map<Producto, Integer> productos;
    public Center(){
        String res = "";
         try { Handler consoleHandler = new ConsoleHandler();
            Handler fileHandler = new FileHandler("C:/Users/haider.rodriguez-m/Documents/CVDS/PARCIAL_CVDS1", true);}
            catch (Exception e) {
                LOG_MONITORING.log(Level.SEVERE, e.getMessage()); res = "Error, check with your service provider"; }
        productos= new HashMap<>();

    }

    public void addProducto(Producto producto, int amount){
        if(productos.containsKey(producto)){
            productos.put(producto, productos.get(producto) + amount);
        }
        else {
            productos.put(producto, amount);
        }
    }

    public int getProductCount(Producto producto) {
        return productos.getOrDefault(producto, 0);
    }

    public void modificStock(Producto producto, int amount, boolean isLess){
        if(isLess){
            amount=amount*(-1);
        }
        if (productos.getOrDefault(producto, 0)+amount<0){
            LOG_MONITORING.log(Level.INFO, "No hay la suficiente cantidad de este producto");
            System.out.printf("No hay la suficiente cantidad de este producto");
        }
        else if (productos.getOrDefault(producto, 0)+amount<5){
            productos.put(producto, productos.get(producto) + amount);
            System.out.printf("Hay menos de5 de este producto");
        }
        else{
            productos.put(producto, productos.get(producto) + amount);
        }

    }

}
