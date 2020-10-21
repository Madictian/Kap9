public class Polygon {
        private int n;
        private double side;
        private double x ;
        private double y;
        public Polygon(){
            this.n = 3;
            this.side = 1;
            this.x = 0;
            this.y = 0;
        }
    public Polygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    public Polygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(int n, double side){
           double perimeter = this.getN() * this.getSide();
           return perimeter;
    }
    public double getArea(int n, double side){
            double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
            return area;
    }

    public static void main(String[] args) {
        Polygon p1 = new Polygon(6, 4);
        Polygon p2 = new Polygon();
        Polygon p3 = new Polygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter of " + p1 + " is " + p1.getPerimeter(p1.n, p1.side));
        System.out.println("Perimeter of " + p2 + " is " + p2.getPerimeter(p2.n, p2.side));
        System.out.println("Perimeter of " + p3 + " is " + p3.getPerimeter(p3.n, p3.side));
        System.out.println("Area of " + p1 + " is " + p1.getArea(p1.n, p1.side));
        System.out.println("Area of " + p1 + " is " + p1.getArea(p2.n, p2.side));
        System.out.println("Area of " + p1 + " is " + p1.getArea(p3.n, p3.side));


    }

}
