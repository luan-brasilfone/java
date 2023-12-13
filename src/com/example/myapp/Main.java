package com.example.myapp;

public class Main
{
    public static void main (String args[])
    {
        IExecutable[] executable = {
            new SingleResponsability(),
            new OpenClosed(),
            new LiskovSubstitution()
        };

        for (IExecutable iExecutable : executable)
            iExecutable.execute();
    }
}