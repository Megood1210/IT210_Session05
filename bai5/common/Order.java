package com.restaurant.bai5.common;

public class Order {
    private int id;
    private String dishName;
    private int quantity;
    private double price;
    private double total;

    public Order() {}

    public Order(int id, String dishName, int quantity, double price) {
        this.id = id;
        this.dishName = dishName;
        this.quantity = quantity;
        this.price = price;
        this.total = price * quantity;
    }

    public int getId() { return id; }
    public String getDishName() { return dishName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public double getTotal() { return total; }
}