package model.impl;

import model.Vehicle;
import visitor.Visitor;

public class Bicycle extends Vehicle {
    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
