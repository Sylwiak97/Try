import org.cynamonowa.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Item induction = new Item("induction_Bosh", "media_markt", 1299, 1, KindOfItem.OTHER, Room.KITCHEN);
        Item table = new Item("dinner_table", "Ikea", 799, 1, KindOfItem.FURNITURE, Room.LIVINGROOM);
        Item oven = new Item("Oven_Bosh", "media_markt", 1399, 1, KindOfItem.OTHER, Room.KITCHEN);
        Item chair = new Item("dinner_chairs", "Ikea", 199, 4, KindOfItem.FURNITURE, Room.LIVINGROOM);
        Item bed = new Item("big_bed", "Bodzio", 1900, 1, KindOfItem.FURNITURE, Room.BEDROOM);
        Item stairs = new Item("house_stairs", "mr. Schodziarz", 23000, 1,KindOfItem.OTHER,Room.LIVINGROOM);
        Item hammer = new Item("hammer_tool", "Castorama", 18, 2, KindOfItem.TOOL,Room.DAMIANS_CAVE);
        Item glue = new Item("wood_glue", "OBI", 7, 5,KindOfItem.TOOL, Room.DAMIANS_CAVE);
        Item screw = new Item("small_screw", "OBI", 1,100,KindOfItem.TOOL, Room.DAMIANS_CAVE);

        ArrayList<Item> ShopList = new ArrayList<>();
        ShopList.add(induction);
        ShopList.add(table);
        ShopList.add(oven);
        ShopList.add(chair);
        ShopList.add(bed);
        ShopList.add(stairs);
        ShopList.add(hammer);
        ShopList.add(glue);
        ShopList.add(screw);

        // all items from Ikea
        List<Item> filteredbyIkeaList= ShopList.stream().filter(item -> item.getShop().contains("Ikea")).collect(Collectors.toList());
       System.out.println("Items which you will buy in Ikea: "
               + filteredbyIkeaList);

        // all items in kitchen
        List<Item> filteredbyKitchenList= ShopList.stream().filter(item -> item.getRoom().equals(Room.KITCHEN)).collect(Collectors.toList());
        System.out.println("Items which you will keep in Kitchen: "
                + filteredbyKitchenList);

        // cost is more han 1000 PLN
        List<Item> filteredby1000PLNList= ShopList.stream().filter(item -> item.getCost() > 1000).collect(Collectors.toList());
       System.out.println("Items which you will buy for more than 1000PL: "
               + filteredby1000PLNList);

       //Cost in Ikea
        List<Item> filteredbyCostinIkeaNList= ShopList.stream().filter(item -> item.getShop().contains("Ikea")).collect(Collectors.toList());
        int ikeaCost = filteredbyCostinIkeaNList.stream().collect(Collectors.summingInt(Item::getCost));
        System.out.println("In Ikea you will spend: "
                + ikeaCost);

        // tools from Castorama
        List<Item> filteredbyCastoramaList= ShopList.stream().filter(item -> item.getShop().contains("Castorama")).filter(item -> item.getKindOfItem().equals(KindOfItem.TOOL)).collect(Collectors.toList());
        System.out.println("Tools which you will buy in Castorama: "
                + filteredbyCastoramaList);

        // more than one piece of item
        List<Item> filteredbyCountMoreThanOneList= ShopList.stream().filter(item -> item.getCount() > 1).collect(Collectors.toList());
        System.out.println("Items which you will buy more than one piece: "
                + filteredbyCountMoreThanOneList);

        // else items with we will buy
//       List<List<Item>> RestList = new ArrayList<>();
//
//        RestList.add(filteredby1000PLNList);
//
//        myHashSet.add(filteredbyIkeaList);
//        myHashSet.add(filteredbyCountMoreThanOneList);
//        myHashSet.add(filteredbyCostinIkeaNList);
//        myHashSet.add(filteredbyKitchenList);
//
//        HashSet<List<List<Item>>> restOfItems = new HashSet<>();
//        restOfItems.add(Collections.singletonList(filteredbyCastoramaList));
//        System.out.println(restOfItems);
//
//        Set<List<Item>> myHashSet = new HashSet<>();
//
//        myHashSet.add(filteredby1000PLNList);
//        myHashSet.add(filteredbyIkeaList);
//        myHashSet.add(filteredbyCountMoreThanOneList);
//        myHashSet.add(filteredbyCostinIkeaNList);
//        myHashSet.add(filteredbyKitchenList);
//        myHashSet.add(ShopList);
//        myHashSet.add(filteredbyCastoramaList);
//
//
//        for (List<Item> itemList : myHashSet) {
//            System.out.println("Unikalna Lista: " + itemList);
//
//
        ShopList.removeAll(filteredby1000PLNList);
        ShopList.removeAll(filteredbyIkeaList);
        ShopList.removeAll(filteredbyCountMoreThanOneList);
        ShopList.removeAll(filteredbyCostinIkeaNList);
        ShopList.removeAll(filteredbyKitchenList);
        ShopList.removeAll(filteredbyCastoramaList);
        System.out.println(ShopList);


        //                .filter(e -> !filteredby1000PLNList.contains(e))
//                .filter(e -> !filteredbyCastoramaList.contains(e))
//                .filter(e -> !filteredbyCountMoreThanOneList.contains(e))
//                .filter(e -> !filteredbyKitchenList.contains(e))
//                .filter(e -> !filteredbyCostinIkeaNList.contains(e))
//
//        List<Item> unikalneElementy = ShopList.stream()
//                .filter(e -> !filteredbyIkeaList.contains(e))
//                .collect(Collectors.toList());
//
//        List<Item> unikalneElementy = ShopList.stream()
//                .filter(e -> !filteredbyIkeaList.contains(e)).filter(e -> !filteredbyCastoramaList.contains(e))
//                .collect(Collectors.toList());
//
//        System.out.println("to ta jebana lista" + unikalneElementy);


    }

    }












