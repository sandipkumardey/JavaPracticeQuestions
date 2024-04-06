class A {
    void show(){
        System.out.println("show");
    }
}
interface B{
    void show1();
}
class C extends A implements B {
    public void show(){
        System.out.println("show");
    }
    public void show1(){
        System.out.println("show1");
    }
}

public class inheritence {
    public static void main(String[] args){
        C c = new C();
        c.show();
        c.show1();
    }
}

/*
 * Approach:
Problem:

The problem involves understanding inheritance and interface implementation in Java.

Preface:

The program defines a class A with a method show(), an interface B with a method show1(), and a class C that extends A and implements B.

Logic:

Class A defines a method show() that prints "show".
Interface B defines a method show1() without implementation.
Class C extends A and implements B.
Class C overrides the show() method from A and provides its implementation to print "show".
Class C also implements the show1() method from interface B and provides its implementation to print "show1".
In the main method:
An instance of class C is created.
The show() method of class C is called, which prints "show".
The show1() method of class C is called, which prints "show1".

Pseudocode:
1. Define class A with a method show() that prints "show".
2. Define interface B with a method show1().
3. Define class C that extends A and implements B.
4. Override the show() method in class C to print "show".
5. Implement the show1() method in class C to print "show1".
6. In the main method:
   - Create an instance of class C.
   - Call the show() method of class C to print "show".
   - Call the show1() method of class C to print "show1".

Time Complexity:

Method invocation: O(1)

Output:
The program will output:
show
show1

This is because the show() method of class C will print "show", and the show1() method of class C will print "show1".
 */
