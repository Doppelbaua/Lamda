package DoppelbauerJ22084.Beispiel4;

public class VectorCalator extends AbstractCalculator
{

    public VectorCalator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divid) {
        super(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                (x, y) -> new Number(
                        (x.getA() * y.getB()) - (x.getB() * y.getA()),
                        0),
                (x, y) -> new Number(x.getA() * y.getA() + x.getB() * y.getB(), 0)
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
        return  divid.calc(a,b);
    }
}
