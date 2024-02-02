package service;

import dao.ItemDao;
import entities.Item;
import entities.KindOfItem;
import entities.Room;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemService {
    private final ItemDao itemDao = new ItemDao();

    // all items from Ikea
    public List<Item> filterByIkeaList(String name) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // all items in kitchen
    public List<Item> filteredbyKitchenList(Room room) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getRoom().equals(room))
                .collect(Collectors.toList());
    }

    // cost is more han 1000 PLN
    public List<Item> filteredby1000PLNList(double price) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCost() >  price)
                .collect(Collectors.toList());
    }

    //Cost in Ikea
    public double filteredbyCostinIkeaNList(String name) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase(name))
                .mapToDouble(Item::getCost).sum();


    }

    // tools from Castorama
    public List<Item> filteredbyCastoramaList(String name, KindOfItem kindOfItem) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase(name))
                .filter(item -> item.getKindOfItem().equals(kindOfItem))
                .collect(Collectors.toList());
    }

    // more than one piece of item
    public List<Item> filteredbyCountMoreThanOneList(int count) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCount() > count)
                .collect(Collectors.toList());
    }


}