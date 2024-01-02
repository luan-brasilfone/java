package com.example.myapp;

public class SimpleFactory implements IExecutable
{
    public void execute ()
    {
        Writer pen = WriterFactory.createWriter("pen");
        Writer pencil = WriterFactory.createWriter("pencil");

        System.out.print("Simple Factory Pattern: ");
        System.out.print(pen.write("I don't like pencils! "));
        System.out.println(pencil.write("I prefer pens!"));
    }
}

interface Writer
{
    public String write (String message);
}

class Pen implements Writer
{
    public String write (String message)
    {
        return "Write using pen: " + message;
    }
}

class Pencil implements Writer
{
    public String write (String message)
    {
        return "Write using pencil: " + message;
    }
}

class WriterFactory
{
    public static Writer createWriter (String type)
    {
        switch (type) {
            case "pen":
                return new Pen();

            case "pencil":
                return new Pencil();

            default:
                throw new IllegalArgumentException("Invalid type for Writer.");
        }
    }
}