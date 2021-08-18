package model.impl;

import model.Vehicle;
import visitor.Visitor;

public class Scooter extends Vehicle {
    public Scooter(String model) {
        super(model);
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
