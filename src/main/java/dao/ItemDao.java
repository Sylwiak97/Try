package dao;


import entities.Item;
import entities.KindOfItem;
import entities.Room;
import java.util.ArrayList;
import java.util.List;

public class ItemDao {
    private static final List<Item> itemList = new ArrayList<>(setupItemList());

    public List<Item> getShopList() {
        return itemList;
    }

    public List<Item> addItemToList(final Item item) {
        if (checkIfItemAlreadyExists(item))  {
            addItemtoCount(item);
            System.out.println("Item added to count.");

        } else {
            System.out.println("Item is new.");
            itemList.add(item);
        }
        return null;
    }



    private static boolean checkIfItemAlreadyExists(Item item) {
      for (Item listItem : itemList) {
            if (listItem.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
    private void addItemtoCount(Item item){
        int currentCount = item.getCount();
        int afterAddCount = ++currentCount;
        for (Item listItem : itemList)
            if (item.equals(listItem.getName())) {
                item.setCount(afterAddCount);
            }
    }




    public static List<Item> setupItemList() {
        Item induction = new Item("induction_Bosh", "media_markt", 1299, 1, KindOfItem.OTHER, Room.KITCHEN);
        Item table = new Item("dinner_table", "Ikea", 799, 1, KindOfItem.FURNITURE, Room.LIVINGROOM);
        Item oven = new Item("Oven_Bosh", "media_markt", 1399, 1, KindOfItem.OTHER, Room.KITCHEN);
        Item chair = new Item("dinner_chairs", "Ikea", 199, 4, KindOfItem.FURNITURE, Room.LIVINGROOM);
        Item bed = new Item("big_bed", "Bodzio", 1900, 1, KindOfItem.FURNITURE, Room.BEDROOM);
        Item stairs = new Item("house_stairs", "mr. Schodziarz", 23000, 1, KindOfItem.OTHER, Room.LIVINGROOM);
        Item hammer = new Item("hammer_tool", "Castorama", 18, 2, KindOfItem.TOOL, Room.DAMIANS_CAVE);
        Item glue = new Item("wood_glue", "OBI", 7, 5, KindOfItem.TOOL, Room.DAMIANS_CAVE);
        Item screw = new Item("small_screw", "OBI", 1, 100, KindOfItem.TOOL, Room.DAMIANS_CAVE);


        ArrayList<Item> shopList = new ArrayList<>();
        shopList.add(induction);
        shopList.add(table);
        shopList.add(oven);
        shopList.add(chair);
        shopList.add(bed);
        shopList.add(stairs);
        shopList.add(hammer);
        shopList.add(glue);
        shopList.add(screw);
        return shopList;
    }



}