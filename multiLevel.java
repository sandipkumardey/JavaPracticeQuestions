class GrandParent {
    int l, b;

    GrandParent(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of GrandParent: " + l * b);
    }
}

class Parent extends GrandParent {
    int h;

    Parent(int l, int b, int h) {
        super(l, b);
        this.h = h;
    }

    void volume() {
        System.out.println("Volume of Parent: " + l * b * h);
    }
}

class Child extends Parent {
    int h2;
    Child(int l, int b, int h1, int h2) {
        super(l, b, h1);
        this.h2 = h2;
    }
        void volume1(){
            System.out.println("New Volume of Child: "+(l*b*h*h2));
        }
    }


class multiLevel {
    public static void main(String[] args) {
        Child c = new Child(50, 10, 20, 30);
        c.volume();
        Parent c1 = new Parent(50, 10, 20);
        c1.volume();
        GrandParent c2 = new GrandParent(50, 10);
        c2.area();
    }
}

/*
 * Approach:
Problem:

The problem involves understanding multilevel inheritance and method overriding in Java.

Preface:

The program defines three classes: GrandParent, Parent, and Child, representing a multilevel inheritance hierarchy. Each class has attributes and methods to calculate the area or volume of geometric shapes. The main method creates instances of these classes and calls their respective methods to calculate and display area or volume.

Logic:

The GrandParent class defines a constructor to initialize the dimensions of a shape and a method area() to calculate and display its area.
The Parent class extends GrandParent and adds an additional dimension to the shape, along with a method volume() to calculate and display its volume.
The Child class extends Parent and adds another dimension to the shape, along with a method volume1() to calculate and display its new volume.
In the main method of the multiLevel class, instances of Child, Parent, and GrandParent are created, and their respective methods are called to calculate and display area or volume.

Pseudocode:
1. Define a class GrandParent with attributes for dimensions and a method to calculate area.
2. Define a class Parent that extends GrandParent with an additional dimension and a method to calculate volume.
3. Define a class Child that extends Parent with another additional dimension and a method to calculate new volume.
4. In the main method:
    - Create instances of Child, Parent, and GrandParent.
    - Call their respective methods to calculate and display area or volume.

Time Complexity:

Creating instances and calculating area/volume: O(1) per instance.

Output:
The program will output the following:
Volume of Parent: 10000
Volume of Parent: 10000
Area of GrandParent: 500

Explanation:

For the instance c, it calculates the volume of the child shape (50 * 10 * 20 * 30) which equals 300000.
For the instance c1, it calculates the volume of the parent shape (50 * 10 * 20) which equals 10000.
For the instance c2, it calculates the area of the grandparent shape (50 * 10) which equals 500.
 */