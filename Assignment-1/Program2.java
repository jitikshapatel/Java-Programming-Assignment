import java.util.Scanner;

class Matrix {
    int[][] a;
    int r, c;

    // Constructor
    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        a = new int[r][c];
    }

    // Input
    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
    }

    // Display
    void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    // Transpose
    void transpose() {
        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    // Multiplication
    static void multiply(Matrix m1, Matrix m2) {
        if (m1.c != m2.r) {
            System.out.println("Multiplication not possible");
            return;
        }

        Matrix res = new Matrix(m1.r, m2.c);

        for (int i = 0; i < m1.r; i++)
            for (int j = 0; j < m2.c; j++)
                for (int k = 0; k < m1.c; k++)
                    res.a[i][j] += m1.a[i][k] * m2.a[k][j];

        System.out.println("Multiplication Result:");
        res.display();
    }
}

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols of Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        System.out.println("Enter Matrix 1:");
        m1.input();

        System.out.print("Enter rows and cols of Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        System.out.println("Enter Matrix 2:");
        m2.input();

        System.out.println("Matrix 1:");
        m1.display();

        m1.transpose();

        Matrix.multiply(m1, m2);
    }
}