package com.gigan.polymorphism;

interface DAO{
    void save();
    void update();
    void delete();
}

class MySQL implements DAO {
    @Override
    public void save() {
        System.out.println("Saving ...");
    }

    @Override
    public void update() {
        System.out.println("Updating ...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting ...");
    }
}


class PostgreSQL implements DAO {
    @Override
    public void save() {
        System.out.println("Saving ...");
    }

    @Override
    public void update() {
        System.out.println("Updating ...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting ...");
    }
}

class MongoDB implements DAO {
    @Override
    public void save() {
        System.out.println("Saving ...");
    }

    @Override
    public void update() {
        System.out.println("Updating ...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting ...");
    }
}

public class BDD {
    public static void main(String[] args) {

    }
}
