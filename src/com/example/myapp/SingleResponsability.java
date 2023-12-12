package com.example.myapp;

import java.util.Set;
import java.util.HashSet;

public class SingleResponsability
{
    public void execute ()
    {
        ProductController controller = new ProductController();

        boolean result = controller.saveProduct("teste");
        System.out.println("Single Responsabilty: " + result);
    }
}

class ProductController
{
    private Database database = new Database();
    private ProductValidator validator = new ProductValidator();

    public boolean saveProduct (String product)
    {
        if (!validator.validateProduct(product))
            return false;

        database.store(product);

        return true;
    }

}

class ProductValidator
{
    public boolean validateProduct (String product)
    {
        if (product == "false")
            return false;

        return true;
    }
}

class Database
{
    private Set<String> database = new HashSet<>();

    public void store (String product)
    {
        database.add(product);
    }
}