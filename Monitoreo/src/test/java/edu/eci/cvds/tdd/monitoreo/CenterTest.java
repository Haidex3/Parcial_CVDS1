package edu.eci.cvds.tdd.monitoreo;

import edu.eci.cvds.tdd.monitoreo.Center;
import edu.eci.cvds.tdd.monitoreo.producto.Producto;
import java.util.logging.ConsoleHandler; 
import java.util.logging.FileHandler; 
import java.util.logging.Handler; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.SimpleFormatter;


import static org.junit.Assert.*;
import org.junit.Test;
public class CenterTest {
    private final static Logger LOG_MONITORING = Logger.getLogger("com.tests.project");

    @Test
    public void shouldAddProducto() {
        Center center= new Center();
        Producto producto=new Producto("XBOX",1000000,"CONSOLAS");
        center.addProducto(producto,5); 
        assertEquals(5, center.getProductCount(producto));
        center.addProducto(producto,10); 
        assertEquals(15, center.getProductCount(producto));
    }


    @Test
    public void shouldModificStock() {
        Center center= new Center();
        Producto producto=new Producto("XBOX",1000000,"CONSOLAS");
        center.addProducto(producto,5); 
        center.modificStock(producto,6,true); 
        assertEquals(5, center.getProductCount(producto));
        center.modificStock(producto,2,false);
        center.modificStock(producto,4,true);
    }

}