package com.example.myapp;

public class InterfaceSegregation implements IExecutable
{
    public void execute ()
    {
        Car car = new Car();
        Plane plane = new Plane();
        Boat boat = new Boat();

        System.out.print("Interface Segregation: ");
        System.out.print("Car drive: " + car.drive());
        System.out.print(" - Plane fly: " + plane.fly());
        System.out.println(" - Boat sail: " + boat.sail());
    }
}

interface Driveable
{
    public String drive ();
}

interface Flyable
{
    public String fly ();
}

interface Sailable
{
    public String sail ();
}

class Car implements Driveable
{
    public String drive ()
    {
        return "Driving";
    }
}

class Plane implements Driveable, Flyable
{
    public String drive ()
    {
        return "Driving";
    }

    public String fly ()
    {
        return "Flying";
    }
}

class Boat implements Sailable
{
    public String sail ()
    {
        return "Sailing";
    }
}