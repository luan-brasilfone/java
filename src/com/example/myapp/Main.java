package com.example.myapp;

public class Main
{
    public static void main (String args[])
    {
        SingleResponsability single = new SingleResponsability();
        boolean result = single.execute("teste");
        System.out.println(result);
    }
}