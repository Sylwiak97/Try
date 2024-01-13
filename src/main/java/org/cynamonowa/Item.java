package org.cynamonowa;
import java.util.ArrayList;



public class Item {
    private String name;
    private double cost;
    private String shop;
    private int count;
    private Room room;
    private KindOfItem kindOfItem;



    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }


    double getCost() {
        return this.cost;
    }

    void setCost(double cost) {
        this.cost = cost;
    }

    String getShop() {
        return this.shop;
    }

    void setShop(String shop) {
        this.shop = shop;
    }

    int getCount() {
        return this.count;
    }

    void setCount(int count) {
        this.count = count;
    }



    public KindOfItem getKindOfItem() {
        return kindOfItem;
    }

    public void setKindOfItem(KindOfItem kindOfItem) {
        this.kindOfItem = kindOfItem;
    }



    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Item(String name, String shop, double cost, int count, KindOfItem kindOfItem, Room room) {
        this.name = name;
        this.shop = shop;
        this.count = count;
        this.cost = cost;
        this.kindOfItem = kindOfItem;
        this.room = room;
    }
    public Item(){}


}