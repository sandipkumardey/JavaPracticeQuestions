interface A {
    void execute(int num1);
}

interface B {
    void execute(int num1);
}

class C implements A, B {
    public void execute(int num1) {
        System.out.println("Hello.. From Implementation Class!!");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.execute(16);
    }
}
