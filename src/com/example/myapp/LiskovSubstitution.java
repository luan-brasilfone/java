package com.example.myapp;

public class LiskovSubstitution implements IExecutable
{
    public void execute ()
    {
        Bird bird = new Bird();
        Penguim penguim = new Penguim();

        System.out.print("Liskov Substition: ");
        System.out.print("Bird peck and fly: " + bird.peck() + ", " + bird.fly());
        System.out.println(" - Penguim peck and fly: " + penguim.peck() + ", " + penguim.jump());
    }
}

interface Flier
{
    public String fly();
}

interface Pecker
{
    public String peck();
}

interface Jumper
{
    public String jump();
}

class Bird implements Flier, Pecker
{
    public String peck ()
    {
        return "Pecking";
    }

    public String fly ()
    {
        return "Flying";
    }
}

class Penguim implements Pecker, Jumper
{
    public String jump ()
    {
        return "Jumping";
    }

    public String peck ()
    {
        return "Pecking"; 
    }
}