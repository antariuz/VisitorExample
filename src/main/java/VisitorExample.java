import model.Vehicle;
import model.impl.Bicycle;
import model.impl.Scooter;
import visitor.Visitor;
import visitor.impl.VehicleVisitor;

import java.util.Arrays;
import java.util.List;

public class VisitorExample {
    public static void main(String[] args) {
        List<Vehicle> list = Arrays.asList(
                new Scooter("X100"),
                new Scooter("TURBO_EDITION"),
                new Bicycle("GOLD GUN"),
                new Bicycle("Just a bike")
        );
        Visitor visitor = new VehicleVisitor();
        for (Vehicle vehicle : list) {
            vehicle.Accept(visitor);
        }
    }
}
