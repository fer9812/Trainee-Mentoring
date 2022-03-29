package Products;

import java.util.ArrayList;

public class products {
        public ArrayList productsWaterStore(){
            ArrayList<String > tShirt1 = new ArrayList<>();
            tShirt1.add("ID : 100");
            tShirt1.add("Nike");
            tShirt1.add("Sportswear");
            tShirt1.add("23 Items");
            tShirt1.add("12.00");

            ArrayList<String> jean1 = new ArrayList<>();
            jean1.add("ID : 101");
            jean1.add("Levi's");
            jean1.add("Casual");
            jean1.add("10 items");
            jean1.add("30.00");

            ArrayList<String> shoes1 = new ArrayList<>();
            shoes1.add("ID : 102");
            shoes1.add("Nike");
            shoes1.add("Sports Shoes");
            shoes1.add("9 items");
            shoes1.add("45.00");

            ArrayList<String> allProducts = new ArrayList<>();
            allProducts.addAll(tShirt1);
            allProducts.addAll(shoes1);
            allProducts.addAll(jean1);

            return allProducts ;
        }

        public ArrayList productsEarthStore(){
            ArrayList<String > tShirt1 = new ArrayList<>();
            tShirt1.add("ID : 100");
            tShirt1.add("Nike");
            tShirt1.add("Sportswear");
            tShirt1.add("35 Items");
            tShirt1.add("23.00");


            ArrayList<String> jean1 = new ArrayList<>();
            jean1.add("ID : 101");
            jean1.add("Levi's");
            jean1.add("Casual");
            jean1.add("70 items");
            jean1.add("28.00");

            ArrayList<String> shoes1 = new ArrayList<>();
            shoes1.add("ID : 102");
            shoes1.add("Nike");
            shoes1.add("Sports Shoes");
            shoes1.add("48 items");
            shoes1.add("30.00");

            ArrayList<String> allProducts = new ArrayList<>();
            allProducts.addAll(tShirt1);
            allProducts.addAll(shoes1);
            allProducts.addAll(jean1);

            return allProducts;
        }

        public ArrayList productsWindStore(){
            ArrayList<String > tShirt1 = new ArrayList<>();
            tShirt1.add("ID : 100");
            tShirt1.add("Nike");
            tShirt1.add("Sportswear");
            tShirt1.add("09 Items");
            tShirt1.add("08.00");


            ArrayList<String> jean1 = new ArrayList<>();
            jean1.add("ID : 101");
            jean1.add("Levi's");
            jean1.add("Casual");
            jean1.add("14 items");
            jean1.add("45.00");

            ArrayList<String> shoes1 = new ArrayList<>();
            shoes1.add("ID : 102");
            shoes1.add("Nike");
            shoes1.add("Sports Shoes");
            shoes1.add("20 items");
            shoes1.add("50.00");

            ArrayList<String> allProducts = new ArrayList<>();
            allProducts.addAll(tShirt1);
            allProducts.addAll(shoes1);
            allProducts.addAll(jean1);
            return allProducts;
        }

        public ArrayList priceOfShirts(){
            ArrayList<String > tShirtFromEarthStore = new ArrayList<>();
            tShirtFromEarthStore.add("Store: Earth Store");
            tShirtFromEarthStore.add("23.00");

            ArrayList<String > tShirtFromWaterStore = new ArrayList<>();
            tShirtFromWaterStore.add("Store: Water Store");
            tShirtFromWaterStore.add("12.00");

            ArrayList<String > tShirtFromWindStore= new ArrayList<>();
            tShirtFromWindStore.add("Store: Wind Store");
            tShirtFromWindStore.add("08.00");

            ArrayList<String> allShirts = new ArrayList<>();
            allShirts.addAll(tShirtFromEarthStore);
            allShirts.addAll(tShirtFromWaterStore);
            allShirts.addAll(tShirtFromWindStore);
            return allShirts;

        }

    public ArrayList priceOfJeans(){
        ArrayList<String > tShirtFromEarthStore = new ArrayList<>();
        tShirtFromEarthStore.add("Store: Earth Store");
        tShirtFromEarthStore.add("28.00");

        ArrayList<String > tShirtFromWaterStore = new ArrayList<>();
        tShirtFromWaterStore.add("Store: Water Store");
        tShirtFromWaterStore.add("30.00");

        ArrayList<String > tShirtFromWindStore= new ArrayList<>();
        tShirtFromWindStore.add("Store: Wind Store");
        tShirtFromWindStore.add("45.00");

        ArrayList<String> allJeans = new ArrayList<>();
        allJeans.addAll(tShirtFromEarthStore);
        allJeans.addAll(tShirtFromWaterStore);
        allJeans.addAll(tShirtFromWindStore);
        return allJeans;

    }
    public ArrayList priceOfShoes(){
        ArrayList<String > FromEarthStore = new ArrayList<>();
        FromEarthStore.add("Store: Earth Store");
        FromEarthStore.add("30.00");

        ArrayList<String > FromWaterStore = new ArrayList<>();
        FromWaterStore.add("Store: Water Store");
        FromWaterStore.add("$45.00");

        ArrayList<String > FromWindStore= new ArrayList<>();
        FromWindStore.add("Store: Wind Store");
        FromWindStore.add("$50.00");

        ArrayList<String> allJeans = new ArrayList<>();
        allJeans.addAll(FromEarthStore);
        allJeans.addAll(FromWaterStore);
        allJeans.addAll(FromWindStore);
        return allJeans;
    }
}

