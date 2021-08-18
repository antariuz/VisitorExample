package model;

import visitor.Visitor;

public abstract class Vehicle {
    private final String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void Accept(Visitor visitor);

    public String getModel() {
        return model;
    }

}
