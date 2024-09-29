package DoppelbauerJ22084.Beispiel4;

public class ComplexCalulator extends AbstractCalculator {
    public ComplexCalulator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divid) {
        super(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                (x, y) -> new Number(
                        x.getA() * y.getA() - x.getB() * y.getB(),
                        x.getA() * y.getB() + x.getB() * y.getA()),
                (x, y) -> {
                    double divisor = y.getA() * y.getA() + y.getB() * y.getB();
                    return new Number(
                            (x.getA() * y.getA() + x.getB() * y.getB()) / divisor,
                            (x.getB() * y.getA() - x.getA() * y.getB()) / divisor
                    );
                }
        );
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number substract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divid.calc(a,b);
    }
}
