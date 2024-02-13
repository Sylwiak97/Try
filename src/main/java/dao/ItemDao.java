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
        if (checkIfItemAlreadyExists(item)) {
            addItemToCount(item);
            System.out.println("Item added to count.");

        } else {
            System.out.println("Item is new.");
            itemList.add(item);
        }
        return null;
    }

    public List<Item> deleteItemAll(final int index) {
            if (index >= 0 && index < getShopList().size()) {
               Item deletedItem = itemList.get(index);
                itemList.remove(deletedItem);
                System.out.println("Item deleted.");

        } else {
            System.out.println("There is no such a Item");
        }
        return null;
    }

    public static boolean checkIfItemAlreadyExists(final Item item) {
        for (Item listItem : itemList) {
            if (listItem.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }


    public List<Item> updateItem(final int index, Item item) {
      if(checkIfItemAlreadyExists(item)){
      }
        if (index >= 0 && index < getShopList().size()) {
            Item oldItem = itemList.get(index);
                  oldItem.setName(item.getName());
                  oldItem.setShop(item.getShop());
                  oldItem.setCost(item.getCost());
                  oldItem.setCount(item.getCount());
                  oldItem.setRoom(item.getRoom());
                  oldItem.setKindOfItem(item.getKindOfItem());
            System.out.println("Item updated");
        }else{
            System.out.println("There is no subject with such an index");
        }

        return null;
    }
            public void addItemToCount (final Item item){
                for (Item listItem : itemList) {
                    int afterAddCount = listItem.getCount() + item.getCount();
                    listItem.setCount(afterAddCount);
                }
            }

    public void deleteItemFromCount(final int index, int count) {
        for (Item listItem : itemList) {
            Item deletedItem = itemList.get(index);
            if (count <= deletedItem.getCount()) {
                int afterDeletion = deletedItem.getCount() - count;
                deletedItem.setCount(afterDeletion);

            } else {
                itemList.remove(deletedItem);
                System.out.println("Because you wanted to delete a greater or equal pieces of item, the entire item was deleted from the list");
            } break;
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