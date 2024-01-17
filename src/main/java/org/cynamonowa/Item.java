package org.cynamonowa;
import java.util.ArrayList;



public class Item {
    private String name;
    private int cost;
    private String shop;
    private int count;
    private Room room;
    private KindOfItem kindOfItem;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getShop() {
        return this.shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
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

    public Item(String name, String shop, int cost, int count, KindOfItem kindOfItem, Room room) {
        this.name = name;
        this.shop = shop;
        this.count = count;
        this.cost = cost;
        this.kindOfItem = kindOfItem;
        this.room = room;
    }
    public Item(){}


    @Override
    public String toString() {
        return  name + '\'' +
                ", cost=" + cost +
                ", shop='" + shop + '\'' +
                "," + count + "pc." + '\'' +
                ", what is this=" + kindOfItem +
                ", where you will place it=" + (room != null ? room : "Brak");


    }




}