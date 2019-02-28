public class Account {
    private double a, b, c, delta;

    public Account() {

    }

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
    }

    public double getDiscriminant() {
        this.delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return delta;
    }

    public double getRootOne() {

        return (-b + Math.sqrt(this.delta)) / (2 * a);
    }

    public double getRootTwo() {
        return (-b - Math.sqrt(this.delta)) / (2 * a);
    }

    public double getRootThree() {
        return -b / (2 * a);
    }

}
