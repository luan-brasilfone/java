package com.example.myapp;

import java.util.HashSet;

public class OpenClosed implements IExecutable
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

abstract class Entity
{
    private int Id;
    private String name;

    protected HashSet<String> myList = new HashSet<>();

    public HashSet<String> getList ()
    {
        return myList;
    }
}

class Customer extends Entity
{
    public Customer ()
    {
        this.myList.add("Apple");
    }

    public HashSet<String> getOrders ()
    {
        return this.myList;
    }
}

class Vendor extends Entity
{
    public Vendor ()
    {
        this.myList.add("Apple");
        this.myList.add("Banana");
    }

    public HashSet<String> getProducts ()
    {
        return this.myList;
    }
}