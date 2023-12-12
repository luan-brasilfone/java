package com.example.myapp;

public class Main
{
    public static void main (String args[])
    {
        ProductController controller = new ProductController();
        boolean result = controller.saveProduct("teste");
        System.out.println(result);
    }
}