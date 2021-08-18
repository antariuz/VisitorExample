package visitor.impl;

import model.impl.Bicycle;
import model.impl.Scooter;
import visitor.Visitor;

public class VehicleVisitor implements Visitor {
    @Override
    public void visit(Scooter scooter) {
        System.out.println(scooter.getModel());
    }

    @Override
    public void visit(Bicycle bicycle) {
        System.out.println(bicycle.getModel());
    }
}
