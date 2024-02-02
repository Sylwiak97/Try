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
    public List<Item> filteredby1000PLNList(double price) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCost() >  price)
                .collect(Collectors.toList());
    }

    //Cost in Ikea
    public double filteredbyCostinIkeaNList() {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase("Ikea"))
                .mapToDouble(Item::getCost).sum();


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


//    public HashSet<Item> allFilteredItems() {
//        HashSet<Item> allUsedItems = new HashSet<>();
//        allUsedItems.addAll(filteredbyCastoramaList());
//        allUsedItems.addAll(filterByIkeaList());
//        allUsedItems.addAll(filteredbyKitchenList());
//        allUsedItems.addAll(filteredby1000PLNList(1000));
//        allUsedItems.addAll(filteredbyCountMoreThanOneList());
//        return allUsedItems;
//
//    }

//    public List<Item> restList() {
//        List<Item> restItemsList = new ArrayList<>(itemDao.getShopList());
//
//    }

}