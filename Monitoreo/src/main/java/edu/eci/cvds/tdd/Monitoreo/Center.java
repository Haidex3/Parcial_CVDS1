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

}
