public class Calculator {
    private double one;
    private double two;

    public Calculator(double one, double two) {
        this.one = one;
        this.two = two;
    }

    public double multiply() {
        return one*two;
    }
    public double divide() {
        double div = one/two;
        return div;
    }
    public double add () {
        return one + two;
    }
    public double sub() {
        return one - two;
    }
    public double mod() {
        return ( one % two);
    }
    public double sqrt() {
        return Math.pow(one, two);
    }

}
