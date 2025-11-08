class MathOperations {
    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
    public class MethodOverloadExample {
        public static void main(String[] args) {
            MathOperations obj = new MathOperations();

            System.out.println(obj.add(5, 6));
            System.out.println(obj.add(5.6, 6.5));
            System.out.println(obj.add(5, 6, 6));
        }
    }


// java MethodOverloadExample.java