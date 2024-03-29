package service;

import dao.ItemDao;
import entities.Item;
import entities.KindOfItem;
import entities.Room;
import java.util.List;
import java.util.stream.Collectors;

public class ItemService {
    private final ItemDao itemDao = new ItemDao();

    // all items from Ikea
    public List<Item> filterByIkeaList(final String name) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // all items in kitchen
    public List<Item> filteredbyKitchenList(final Room room) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getRoom().equals(room))
                .collect(Collectors.toList());
    }

    // cost is more han 1000 PLN
    public List<Item> filteredby1000PLNList(final double price) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCost() >  price)
                .collect(Collectors.toList());
    }

    //Cost in Ikea
    public double filteredbyCostinIkeaNList(final String name) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase(name))
                .mapToDouble(Item::getCost).sum();


    }

    // tools from Castorama
    public List<Item> filteredbyCastoramaList(final String name, KindOfItem kindOfItem) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getShop().equalsIgnoreCase(name))
                .filter(item -> item.getKindOfItem(item.getKindOfItem(KindOfItem.TOOL)).equals(kindOfItem))
                .collect(Collectors.toList());
    }

    // more than one piece of item
    public List<Item> filteredbyCountMoreThanOneList(final int count) {
        return itemDao.getShopList().stream()
                .filter(item -> item.getCount() > count)
                .collect(Collectors.toList());
    }
    public List<Item> listWithAddedItems(final Item item) {
        itemDao.addItemToList(item);
        return itemDao.getShopList();

    }
        public List<Item> updateItems(final int index, Item item){
            itemDao.updateItem(index, item);
            return itemDao.getShopList();
        }
    public List<Item> deleteItem(final int index){
        itemDao.deleteItemAll(index);
        return itemDao.getShopList();
    }

    public List<Item> deletePiece(final int index, int count){
        itemDao.deleteItemFromCount(index, count);
        return itemDao.getShopList();
    }



}