package com.baltasarq.listacompra3.View;

import android.app.Application;

import com.baltasarq.listacompra3.Core.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Sustituye a la clase Application por defecto.
 * Created by baltasarq on 2/11/16.
 */

public class ListaCompra3App extends Application {
    private List<Item> items;
    private int pos;

    @Override
    public void onCreate()
    {
        this.items = new ArrayList<>();
    }

    /**
     * Gets the list of items
     * @return the list of items, as a List<Item>.
     */
    public List<Item> getItemList() {
        return this.items;
    }

    public void addItem(String nombre, int num) {
        Item item = new Item( nombre );
        item.setNum( num );

        this.items.add( item );
    }

    public void modifyItem(int pos, String nombre, int num) {
        Item item = new Item( nombre );
        item.setNum( num );

        this.items.set( pos, item );
    }
}
