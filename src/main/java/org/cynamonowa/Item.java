package org.cynamonowa;

public class Item {
   private String name;
   String getName(){
       return this.name;
   }
   void setName(String name){
       this.name = name;
   }
   private double cost;
    double getCost(){
        return this.cost;
    }
    void setCost(double cost){
        this.cost = cost;
    }
   private String shop;
    String getShop(){
        return this.shop;
    }
    void setShop(String shop){
        this.shop = shop;
    }
   private int count;
    int getCount(){
        return this.count;
    }
    void setCount(int count){
        this.count = count;
    }



}