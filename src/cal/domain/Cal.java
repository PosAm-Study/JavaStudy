package cal.domain;

public class Cal {
    private double n1;
    private char oper;
    private double n2;

    public Cal(double n1, char oper, double n2) {
        this.n1 = n1;
        this.oper = oper;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public char getOper() {
        return oper;
    }

    public double getN2() {
        return n2;
    }
}
