package com.example.myapp;

import java.util.Set;
import java.util.HashSet;

public class ProductController
{
    private Set<String> database = new HashSet<>();

    public boolean saveProduct (String product)
    {
        if (!this.validateProduct(product))
            return false;

        database.add(product);

        return true;
    }

    public boolean validateProduct (String product)
    {
        if (product == "false")
            return false;

        return true;
    }
}