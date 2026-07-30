public class Triangle {
    double height, base;

    Triangle(double height, double base) {
        System.out.println("double - double constructor is called....");
        this.height = height;
        this.base = base ;
    }

    Triangle(float height, float base) {
        System.out.println("float - float constructor is called....");
        this.height = height;
        this.base = base ;
    }


    Triangle(int height, int base) {
        System.out.println("int - int constructor is called....");
        this.height = height;
        this.base = base ;
    }

    private double findArea() {

        double area = (0.5) * height * base ;

        System.out.println("The area of the Triangle is " + area + ".");

        return (double)area ;
    }

    public static void main() {

        System.out.println("    ******************    \n");
        Triangle triangle1 = new Triangle(2, 4);

        
        triangle1.findArea();

        System.out.println("    ******************    \n");
        Triangle triangle2 = new Triangle(2.0, 4.0);
        triangle2.findArea();


        System.out.println("    ******************    \n");

        Triangle triangle3 = new Triangle(3.0, 5.0);
        triangle3.findArea();
    }
}