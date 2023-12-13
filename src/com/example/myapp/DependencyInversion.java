package com.example.myapp;

import java.util.HashSet;

public class DependencyInversion implements IExecutable
{
    public void execute ()
    {
        PersistenceDirector persistenceDirector = new PersistenceDirector();
        PersistenceService persistenceService = persistenceDirector.getPersistenceService();

        boolean result = persistenceService.save("test");

        System.out.println("Dependency Inversion: " + result);
    }
}

class PersistenceDirector
{
    public PersistenceService getPersistenceService ()
    {
        HashSet<String> database = new HashSet<>();
        return new PersistenceService(database);
    }
}

class PersistenceService
{
    private HashSet<String> database;

    public PersistenceService (HashSet<String> database)
    {
        this.database = database;
    }

    public boolean save (String entity)
    {
        return this.database.add(entity);
    }

    public boolean delete (String entity)
    {
        return this.database.remove(entity);
    }
}