class Matrix {
    int a, b, c, d;

    Matrix(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static void add(Matrix m1, Matrix m2) {
        System.out.println("Printing the Addition:");
        System.out.println((m1.a + m2.a) + " " + (m1.b + m2.b));
        System.out.println((m1.c + m2.c) + " " + (m1.d + m2.d));
    }

    public static void diff(Matrix m1, Matrix m2) {
        System.out.println("Printing the Difference:");
        System.out.println((m1.a - m2.a) + " " + (m1.b - m2.b));
        System.out.println((m1.c - m2.c) + " " + (m1.d - m2.d));
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(1, 2, 3, 4);
        Matrix m2 = new Matrix(5, 6, 7, 8);

        add(m1, m2);


        diff(m1, m2);
    }
}