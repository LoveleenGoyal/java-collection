package com.bridgelabz.mapInterface;

import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> orderedCart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        orderedCart.put(product, price);
        sortedCart.put(price, product);
    }

    public void displayCart() {
        System.out.println("Product Prices (HashMap - Unordered): " + productPrices);
        System.out.println("Cart (LinkedHashMap - Insertion Order): " + orderedCart);
        System.out.println("Cart (TreeMap - Sorted by Price): " + sortedCart);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 800.0);
        cart.addProduct("Phone", 500.0);
        cart.addProduct("Headphones", 150.0);
        cart.addProduct("Monitor", 300.0);
        cart.addProduct("Keyboard", 100.0);

        cart.displayCart();
    }
}

/*Product Prices (HashMap - Unordered): {Headphones=150.0, Laptop=800.0, Monitor=300.0, Phone=500.0, Keyboard=100.0}
Cart (LinkedHashMap - Insertion Order): {Laptop=800.0, Phone=500.0, Headphones=150.0, Monitor=300.0, Keyboard=100.0}
Cart (TreeMap - Sorted by Price): {100.0=Keyboard, 150.0=Headphones, 300.0=Monitor, 500.0=Phone, 800.0=Laptop}
*/