package com.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item (write operation)
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items (read operation)
    public List<T> getItems() {
        return items;
    }
}