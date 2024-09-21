package edu.eci.cvds.tdd.monitoreo;

import edu.eci.cvds.tdd.monitoreo.producto.Producto;
import edu.eci.cvds.tdd.monitoreo.Center;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Center{
    private final Map<Producto, Integer> productos;
    public Center(){
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

    public void modificStock(Producto producto, int amount){
        if (productos.getOrDefault(producto, 0)+amount<0){
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
