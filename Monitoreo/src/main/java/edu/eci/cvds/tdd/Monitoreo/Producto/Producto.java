package edu.eci.cvds.tdd.monitoreo.producto;


public class Producto
{
    public String name;
    private int value;
    private int amount;
    private String cate;
    public Producto(String NewName, int NewValue, String NewCate)
    {
        name=NewName;
        value=NewValue;
        cate=NewCate;
    }

}