class MethodOverloading {
    public void print(int a) {
        System.out.println("Integer: " + a);
    }

    public void print(double a) {
        System.out.println("Double: " + a);
    }

    public void print(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.print(10);
        obj.print(10.2);
        obj.print("Hello");
    }
}
