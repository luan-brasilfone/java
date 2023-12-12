package com.example.myapp;

public class Main
{
    public static void main (String args[])
    {
        SingleResponsability single = new SingleResponsability();
        OpenClosed open = new OpenClosed();
        single.execute();
        open.execute();
    }
}