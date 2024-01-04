package org.cynamonowa;

public class Item {
    private String name;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    private double cost;

    double getCost() {
        return this.cost;
    }

    void setCost(double cost) {
        this.cost = cost;
    }

    private String shop;

    String getShop() {
        return this.shop;
    }

    void setShop(String shop) {
        this.shop = shop;
    }

    private int count;

    int getCount() {
        return this.count;
    }

    void setCount(int count) {
        this.count = count;
    }

    private KindOfItem KindOfItem;

    public org.cynamonowa.KindOfItem getKindOfItem() {
        return KindOfItem;
    }

    public void setKindOfItem(KindOfItem kindOfItem) {
        KindOfItem = kindOfItem;
    }

    private Room Room;

    public org.cynamonowa.Room getRoom() {
        return Room;
    }

    public void setRoom(Room room) {
        Room = room;
    }

    public Item(String name, String shop, double cost, int count) {
        this.name = name;
        this.shop = shop;
        this.count = count;
        this.cost = cost;
    }
    public Item(){}

}