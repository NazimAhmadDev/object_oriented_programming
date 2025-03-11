package week2_Assignment3;

import java.util.*;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}

class Order {
    private int orderId;
    private List<Product> products;
    private static int idCounter = 1; // Auto-increment order ID

    Order() {
        this.orderId = idCounter++;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        if (products.isEmpty()) {
            System.out.println("No products in this order.");
        } else {
            for (Product p : products) {
                p.displayProduct();
            }
        }
        System.out.println("Total Price: $" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

class ProductCustomer {
    private String name;
    private List<Order> orders;

    ProductCustomer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet.");
        } else {
            for (Order o : orders) {
                o.displayOrder();
                System.out.println("----------------------");
            }
        }
    }
}

public class E {
    public static void main(String[] args) {
        // Creating Products
        Product p1 = new Product("Laptop", 1000.99);
        Product p2 = new Product("Phone", 499.50);
        Product p3 = new Product("Headphones", 149.99);

        // Creating Customer
        ProductCustomer customer = new ProductCustomer("Nazim Ahmad");

        // Creating Orders
        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p3);

        Order order2 = new Order();
        order2.addProduct(p2);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display customer orders
        customer.displayCustomerOrders();
    }
}

