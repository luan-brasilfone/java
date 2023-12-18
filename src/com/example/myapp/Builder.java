package com.example.myapp;

import java.util.HashSet;

public class Builder implements IExecutable
{
    public void execute ()
    {
        BurguerBuilder builder = new BurguerBuilder();
        Burguer burguer = builder.withMeatType("beef")
                                 .withBreadType("white bread")
                                 .addSalad("tomato")
                                 .addSalad("lettuce")
                                 .addSauce("mayo")
                                 .build();
        System.out.println("Builder Pattern: "+ burguer.describe());
    }
}

class Burguer
{
    public String meatType;
    public String breadType;
    public HashSet<String> salad;
    public HashSet<String> sauce;

    public Burguer(String meatType, String breadType, HashSet<String> salad, HashSet<String> sauce)
    {
        this.meatType = meatType;
        this.breadType = breadType;
        this.salad = salad;
        this.sauce = sauce;
    }

    public String describe()
    {
        return "This is a "+ this.meatType +" burguer on a "+ this.breadType +" with "+ this.salad.toString() +" and a touch of "+ this.sauce.toString();
    }
}

interface IBurguerBuilder
{
    public BurguerBuilder withMeatType(String type);
    public BurguerBuilder withBreadType(String type);
    public BurguerBuilder addSalad(String salad);
    public BurguerBuilder addSauce(String sauce);
    public Burguer build();
}

class BurguerBuilder implements IBurguerBuilder
{
    public String meatType;
    public String breadType;
    public HashSet<String> salad;
    public HashSet<String> sauce;

    public BurguerBuilder()
    {
        this.salad = new HashSet<>();
        this.sauce = new HashSet<>();
    }

    public BurguerBuilder withMeatType(String type)
    {
        this.meatType = type;
        return this;
    }

    public BurguerBuilder withBreadType(String type)
    {
        this.breadType = type;
        return this;
    }

    public BurguerBuilder addSalad(String salad)
    {
        this.salad.add(salad);
        return this;
    }

    public BurguerBuilder addSauce(String sauce)
    {
        this.sauce.add(sauce);
        return this;
    }

    public Burguer build()
    {
        return new Burguer(meatType, breadType, salad, sauce);
    }
}