public class Rectangle {
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double perimeter() {
        double pmeter = 2 * (width + height);
        return pmeter;
    }
    public double area() {
        double areal = width * height;
        return areal;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1,1);
        Rectangle r2 = new Rectangle(2,2);
        Rectangle r3 = new Rectangle(3,3);
        Rectangle r4 = new Rectangle(3.5, 35.9);

        System.out.println("perimeter of the first rectangle is " + r1.perimeter() + " and the area is " + r1.area() + "\n");
        System.out.println("perimeter of the first rectangle is " + r2.perimeter() + " and the area is " + r2.area() + "\n");
        System.out.println("perimeter of the first rectangle is " + r3.perimeter() + " and the area is " + r3.area() + "\n");
        System.out.println("perimeter of the first rectangle is " + r4.perimeter() + " and the area is " + r4.area() + "\n");


    }

}
