public class Quadratic_equation {
    private double a, b, c;
    public Quadratic_equation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Quadratic_equation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getDiscriminant(double a, double b, double c) {
        double discriminant = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return discriminant;
    }

    public double get1stRoot() {
        double rootone = (-this.b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c ))) / (2 * this.a);
        return rootone;
    }

    public double get2ndRoot() {
        double roottwo = (-this.b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c ))) / (2 * this.a);
        return roottwo;
    }
}
