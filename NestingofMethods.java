public class NestingofMethods {

    public void outerMethod() {
        System.out.println("Inside outerMethod");
        innerMethod();
    }

    private void innerMethod() {
        System.out.println("Inside innerMethod");
        innermostMethod();
    }

    private void innermostMethod() {
        System.out.println("Inside innermostMethod");
    }

    public static void main(String[] args) {
        NestingofMethods obj = new NestingofMethods();
        obj.outerMethod();
    }
}
