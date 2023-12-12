package com.example.myapp;

import java.util.HashSet;

public class OpenClosed
{
    public void execute ()
    {
        Customer customer = new Customer();
        Vendor vendor = new Vendor();

        HashSet<String> orderList = customer.getOrders();
        HashSet<String> productList = vendor.getProducts();

        System.out.print("Open-Closed: ");
        System.out.print(orderList);
        System.out.println(productList);
    }
}

class Customer
{
    private int Id;
    private String name;

    private HashSet<String> orderList = new HashSet<>();

    public Customer ()
    {
        this.orderList.add("Apple");
    }

    public HashSet<String> getOrders ()
    {
        return orderList;
    }
}

class Vendor
{
    private int Id;
    private String name;

    private HashSet<String> productList = new HashSet<>();

    public Vendor ()
    {
        this.productList.add("Apple");
        this.productList.add("Banana");
    }

    public HashSet<String> getProducts ()
    {
        return productList;
    }
}