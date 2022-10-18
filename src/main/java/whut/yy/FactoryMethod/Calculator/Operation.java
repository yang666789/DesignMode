package whut.yy.FactoryMethod.Calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public abstract double getResult();
}
