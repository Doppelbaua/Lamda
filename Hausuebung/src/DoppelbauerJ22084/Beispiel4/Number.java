package DoppelbauerJ22084.Beispiel4;

public class Number
{
    private double a;
    private double b;

    public Number(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString()
    {
        return "a = " + this.a + ", b = " + this.b;
    }
}

