package visitor;

import model.impl.Bicycle;
import model.impl.Scooter;

public interface Visitor {
    void visit(Scooter scooter);
    void visit(Bicycle bicycle);
}
