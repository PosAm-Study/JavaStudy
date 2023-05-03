package cal.service;

public class CalServiceImpl implements CalService {
    @Override
    public double plus(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double minus(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double divide(double n1, double n2) {
        return n1 / n2;
    }

    @Override
    public double remainder(double n1, double n2) {
        return n1 % n2;
    }
}
