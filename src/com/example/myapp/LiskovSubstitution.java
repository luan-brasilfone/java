package com.example.myapp;

public class LiskovSubstitution implements IExecutable
{
    public void execute ()
    {
        Bird bird = new Bird();
        Penguim penguim = new Penguim();

        System.out.print("Liskov Substition: ");
        System.out.print("Bird peck and fly: " + bird.peck() + ", " + bird.fly());
        System.out.println(" - Penguim peck and fly: " + penguim.peck() + ", " + penguim.fly());
    }
}

class Bird
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

class Penguim extends Bird
{
    @Override
    public String fly ()
    {
        return this.jump();
    }

    public String jump ()
    {
        return "Jumping";
    }
}