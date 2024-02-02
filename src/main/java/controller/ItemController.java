package controller;
import entities.Item;
import service.ItemService;


public class ItemController {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();


        System.out.println("Items which you will buy in Ikea: "
                + itemService.filterByIkeaList());

        System.out.println("Items which you will keep in Kitchen: "
                + itemService.filteredbyKitchenList());

        System.out.println("Items which you will buy for more than 1000PL: "
                + itemService.filteredby1000PLNList(100));

        System.out.println("In Ikea you will spend: "
                + itemService.filteredbyCostinIkeaNList());

        System.out.println("Tools which you will buy in Castorama: "
                + itemService.filteredbyCastoramaList());

        System.out.println("Items which you will buy more than one piece: "
                + itemService.filteredbyCountMoreThanOneList());



    }
}