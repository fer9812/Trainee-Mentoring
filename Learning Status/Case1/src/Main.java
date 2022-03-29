import Products.products;
import Stores.stores;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menuOption = 3;

        if(menuOption == 3) {
            System.out.println("Please select an option:");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1 - Search by product name.");
            System.out.println("2 - Search by store name.");
            System.out.println("0 - Exit.");

            Scanner inputMenu = new Scanner(System.in);
            menuOption = inputMenu.nextInt();

            if (menuOption == 1) {
                System.out.println("Select an option: ");
                System.out.println("-----------------------");
                System.out.println("1 - Search the stores with the name of product. ");
                System.out.println("2 - Compare prices in all stores with the name of product. ");

                Scanner inputProduct = new Scanner(System.in);
                int numberProduct = inputProduct.nextInt();

                if (numberProduct == 1){
                    System.out.println("Please introduce the name of product:  ");
                    Scanner name1 = new Scanner(System.in);
                    String nameOfProduct = name1.nextLine();

                    if(nameOfProduct.toLowerCase().equals("shirt") ||nameOfProduct.toLowerCase().equals("shoes") ||
                            nameOfProduct.toLowerCase().equals("jeans") ) {
                        stores getInfoStoreWater = new stores();
                        stores getInfoStoreEarth = new stores();
                        stores getInfoStoreWind = new stores();

                        ArrayList store1 = getInfoStoreWater.waterStore();
                        ArrayList store2 = getInfoStoreEarth.EarthStore();
                        ArrayList store3 = getInfoStoreWind.WindStore();


                                String stores = String.valueOf(store1.get(0));  //We print the water store
                                String stores1 = String.valueOf(store1.get(1));
                                String stores2 = String.valueOf(store1.get(2));
                                System.out.println("The ID: " + stores);
                                System.out.println("The name: " + stores1);
                                System.out.println("The location: " + stores2);
                                System.out.println("");

                                String stores3 = String.valueOf(store2.get(0));  //We print the earth store
                                String stores4 = String.valueOf(store2.get(1));
                                String stores5 = String.valueOf(store2.get(2));
                                System.out.println("The ID: " + stores3);
                                System.out.println("The name: " + stores4);
                                System.out.println("The location: " + stores5);
                                System.out.println("");

                                String stores6 = String.valueOf(store3.get(0));  //We print the wind store
                                String stores7 = String.valueOf(store3.get(1));
                                String stores8 = String.valueOf(store3.get(2));
                                System.out.println("The ID: " + stores6);
                                System.out.println("The name: " + stores7);
                                System.out.println("The location: " + stores8);
                                System.out.println("");



                    }else{
                        System.out.println("The product does not exist!! ");
                    }



                }else if(numberProduct == 2){
                    System.out.println("Please introduce the name of product:  ");
                    Scanner name2 = new Scanner(System.in);
                    String nameOfProduct2 = name2.nextLine();

                    if(nameOfProduct2.toLowerCase().equals("shirt")){
                        products getPrices = new products();
                        ArrayList prices = getPrices.priceOfShirts();
                        System.out.println(prices);
                    }else if(nameOfProduct2.toLowerCase().equals("jeans")){
                        products getPrices = new products();
                        ArrayList prices = getPrices.priceOfJeans();
                        System.out.println(prices);
                    }else if(nameOfProduct2.toLowerCase().equals("shoes")){
                        products getPrices = new products();
                        ArrayList prices = getPrices.priceOfShoes();
                        System.out.println(prices);
                    }


                }else{
                    System.out.println("The product does not exist!! ");

                }
            }else if (menuOption == 2){
                System.out.println("Select an option: ");
                System.out.println("-----------------------");
                System.out.println("1 - Search the location with the name of store. ");
                System.out.println("2 - Search all products in a store introducing the name of the store. ");

                Scanner inputStore = new Scanner(System.in);
                int nameStore = inputStore.nextInt();
                if (nameStore == 1){
                    System.out.println("Please introduce the name of store:  ");
                    Scanner name1 = new Scanner(System.in);
                    String nameOfStores = name1.nextLine();

                    if(nameOfStores.toLowerCase().equals("water store")) {
                        stores  locationWater = new stores();
                        ArrayList StoreWater = locationWater.waterStore();
                        String location = String.valueOf(StoreWater.get(2));
                        System.out.println(location);
                    }else if(nameOfStores.toLowerCase().equals("earth store")){
                        stores  locationEarth = new stores();
                        ArrayList StoreEarth = locationEarth.EarthStore();
                        String location = String.valueOf(StoreEarth.get(2));
                        System.out.println(location);
                    }else if(nameOfStores.toLowerCase().equals("wind store")){
                        stores  locationWind = new stores();
                        ArrayList StoreWind = locationWind.WindStore();
                        String location = String.valueOf(StoreWind.get(2));
                        System.out.println(location);
                    }else{
                        System.out.println("The Store does not exist!! ");
                    }



                }else if(nameStore == 2){
                    System.out.println("Please introduce the name of store:  ");
                    Scanner name2 = new Scanner(System.in);
                    String nameOfProduct2 = name2.nextLine();

                    if(nameOfProduct2.toLowerCase().equals("water store")){
                       stores getInfo = new stores();
                       ArrayList storeWater = getInfo.waterStore();
                        System.out.println(storeWater);

                    }else if(nameOfProduct2.toLowerCase().equals("earth store")){
                        stores getInfo = new stores();
                        ArrayList storeEarth = getInfo.EarthStore();
                        System.out.println(storeEarth);
                    }else if(nameOfProduct2.toLowerCase().equals("wind store")){
                        stores getInfo = new stores();
                        ArrayList storeWind = getInfo.WindStore();
                        System.out.println(storeWind);
                    }else{
                        System.out.println("The store does not exist!!!");
                    }
                }

            }
        }

    }
}

