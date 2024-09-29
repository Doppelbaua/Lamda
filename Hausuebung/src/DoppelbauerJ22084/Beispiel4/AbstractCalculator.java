package DoppelbauerJ22084.Beispiel4;

public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divid;


    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divid) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divid = divid;
    }

    public abstract Number add(Number a, Number b);

    public abstract Number substract(Number a, Number b);

    public abstract Number multiply(Number a, Number b);

    public abstract Number divide(Number a, Number b);
}
