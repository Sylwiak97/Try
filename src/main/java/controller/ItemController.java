package controller;

import entities.Item;
import entities.KindOfItem;
import entities.Room;
import service.ItemService;


public class ItemController {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();


        System.out.println("Items which you will buy in Ikea: "
                + itemService.filterByIkeaList("Ikea"));

        System.out.println("Items which you will keep in Kitchen: "
                + itemService.filteredbyKitchenList(Room.KITCHEN));

        System.out.println("Items which you will buy for more than 1000PL: "
                + itemService.filteredby1000PLNList(100));

        System.out.println("In Ikea you will spend: "
                + itemService.filteredbyCostinIkeaNList("Ikea"));

        System.out.println("Tools which you will buy in Castorama: "
                + itemService.filteredbyCastoramaList("Castorama", KindOfItem.TOOL));

        System.out.println("Items which you will buy more than one piece: "
                + itemService.filteredbyCountMoreThanOneList(1));

        System.out.println("Entire list "
                + itemService.listWithAddedItems(new Item("small_screw", "OBI", 1, 6, KindOfItem.TOOL, Room.DAMIANS_CAVE)));

        System.out.println("Updated list"
                + itemService.updateItems(1, new Item("floors", "OBI", 1, 6, KindOfItem.TOOL, Room.KITCHEN)));

        System.out.println("Deleted list"
                + itemService.deleteItem(1));

        System.out.println("List after deletion of piece"
                + itemService.deletePiece(0,8));




    }
}