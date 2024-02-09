package controller;

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
                + itemService.filterallItems());

        System.out.println("Updated list"
                + itemService.updateItems());


    }
}