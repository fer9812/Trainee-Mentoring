package Stores;

import Products.products;

import java.util.ArrayList;

public class stores {
        public ArrayList<String> waterStore() {
            ArrayList<String> waterStoreArray = new ArrayList<>();
            waterStoreArray.add("001");
            waterStoreArray.add("Water Store");
            waterStoreArray.add("First floor");
            products getInfo = new products();
            ArrayList clothes = getInfo.productsWaterStore();
            waterStoreArray.add(String.valueOf(clothes));

            return waterStoreArray;
}
        public ArrayList<String> EarthStore(){
            ArrayList<String> earthStoreArray = new ArrayList<>();
            earthStoreArray.add("002");
            earthStoreArray.add("Earth Store");
            earthStoreArray.add("Second Floor");
            products getInfo = new products();
            ArrayList clothes = getInfo.productsEarthStore();
            earthStoreArray.add(String.valueOf(clothes));

            return earthStoreArray;
        }

        public ArrayList<String> WindStore(){
            ArrayList<String> windStoreArray = new ArrayList<>();
            windStoreArray.add("003");
            windStoreArray.add("Wind Store");
            windStoreArray.add("Third Floor");
            products getInfo = new products();
            ArrayList clothes = getInfo.productsWindStore();
            windStoreArray.add(String.valueOf(clothes));

            return windStoreArray;
        }
}
