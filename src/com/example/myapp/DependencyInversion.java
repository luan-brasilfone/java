package com.example.myapp;

import java.util.HashSet;

public class DependencyInversion implements IExecutable
{
    public void execute ()
    {
        PersistenceService persistenceService = new PersistenceService();

        boolean result = persistenceService.save("test");

        System.out.println("Dependency Inversion: " + result);
    }
}

class PersistenceService
{
    HashSet<String> database = new HashSet<>();

    public boolean save (String entity)
    {
        return database.add(entity);
    }

    public boolean delete (String entity)
    {
        return database.remove(entity);
    }
}