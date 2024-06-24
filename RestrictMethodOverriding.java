class ParentClass {
    public final void display() {
        System.out.println("This is a final method in the ParentClass.");
    }
    
    public void show() {
        System.out.println("This is a non-final method in the ParentClass.");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void show() {
        System.out.println("This is an overridden method in the ChildClass.");
    }
}

public class RestrictMethodOverriding {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.display();
        child.show();
    }
}
