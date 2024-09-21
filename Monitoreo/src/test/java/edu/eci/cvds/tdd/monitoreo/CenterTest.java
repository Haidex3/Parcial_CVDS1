package edu.eci.cvds.tdd.monitoreo;

import edu.eci.cvds.tdd.monitoreo.Center;
import edu.eci.cvds.tdd.monitoreo.producto.Producto;



import static org.junit.Assert.*;
import org.junit.Test;
public class CenterTest {
    @Test
    public void shouldAddProducto() {
        Center center= new Center();
        Producto producto=new Producto("XBOX",1000000,"CONSOLAS");
        center.addProducto(producto,5); 
        assertEquals(5, center.getProductCount(producto));
    }


    @Test
    public void shouldModificStock() {
        Center center= new Center();
        Producto producto=new Producto("XBOX",1000000,"CONSOLAS");
        center.addProducto(producto,5); 
        center.modificStock(producto,-1); 
        assertEquals(4, center.getProductCount(producto));
    }

}