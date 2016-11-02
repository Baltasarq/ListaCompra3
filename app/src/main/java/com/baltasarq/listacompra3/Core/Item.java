package com.baltasarq.listacompra3.Core;

/**
 * Representa un item a comprar.
 * Created by baltasarq on 27/10/16.
 */

public class Item {
    private String nombre;
    private int num;

    public Item(String n)
    {
        this.nombre = n;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString()
    {
        return this.getNombre() + ". Num.: " + this.getNum();
    }
}
