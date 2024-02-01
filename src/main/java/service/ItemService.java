package service;

import dao.ItemDao;
import entities.Item;
import entities.KindOfItem;
import entities.Room;
import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ItemService {
    private final ItemDao itemDao = new ItemDao();

    // all items from Ikea
    public List<Item> filterByIkeaList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase("Ikea"))
                .collect(Collectors.toList());
    }

    // all items in kitchen
    public List<Item> filteredbyKitchenList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getRoom().equals(Room.KITCHEN))
                .collect(Collectors.toList());
    }

    // cost is more han 1000 PLN
    public List<Item> filteredby1000PLNList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCost() > 1000)
                .collect(Collectors.toList());
    }

    //Cost in Ikea
    public List<Item> filteredbyCostinIkeaNList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase("Ikea"))
                .collect(Collectors.toList());
    }

    // tools from Castorama
    public List<Item> filteredbyCastoramaList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase("Castorama"))
                .filter(item -> item.getKindOfItem().equals(KindOfItem.TOOL))
                .collect(Collectors.toList());
    }

    // more than one piece of item
    public List<Item> filteredbyCountMoreThanOneList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCount() > 1)
                .collect(Collectors.toList());
    }


    public HashSet<Item> allFilteredItems(){
        HashSet<Item> allUsedItems = new HashSet<>();
        allUsedItems.addAll(filteredbyCastoramaList());
        allUsedItems.addAll(filterByIkeaList());
        allUsedItems.addAll(filteredbyKitchenList());
        allUsedItems.addAll(filteredby1000PLNList());
        allUsedItems.addAll(filteredbyCostinIkeaNList());
        allUsedItems.addAll(filteredbyCountMoreThanOneList());
        return allFilteredItems();
    }







}

