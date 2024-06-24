public class MyOwnStaticMethod {
    public static int square(int num) {
        return num * num;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result1 = square(5);
        System.out.println("Square of 5: " + result1);

        int result2 = sum(10, 20);
        System.out.println("Sum of 10 and 20: " + result2);
    }
}
