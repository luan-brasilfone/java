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

interface Vehicle
{
    public String drive ();
    public String fly ();
    public String sail ();
}

class Car implements Vehicle
{
    public String drive ()
    {
        return "Driving";
    }

    public String fly ()
    {
        throw new UnsupportedOperationException("Cars cannot fly");
    }

    public String sail ()
    {
        throw new UnsupportedOperationException("Cars cannot sail");
    }
}

class Plane implements Vehicle
{
    public String drive ()
    {
        return "Driving";
    }

    public String fly ()
    {
        return "Flying";
    }

    public String sail ()
    {
        throw new UnsupportedOperationException("Planes cannot sail");
    }
}

class Boat implements Vehicle
{
    public String drive ()
    {
        throw new UnsupportedOperationException("Boats cannot drive");
    }

    public String fly ()
    {
        throw new UnsupportedOperationException("Boats cannot fly");
    }

    public String sail ()
    {
        return "Sailing";
    }
}