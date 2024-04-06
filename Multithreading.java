class A extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("From A: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Exit From A");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("From B: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Exit From B");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        
        threadA.start();
        threadB.start();
    }
}

/*
* Approach:
The problem involves implementing multithreading in Java using two separate classes A and B that extend the Thread class.

Preface:
The program defines two classes, A and B, both of which extend the Thread class. Each class overrides the run() method to perform some tasks concurrently. In the main() method of the Multithreading class, instances of A and B are created, and their start() methods are called to begin their execution concurrently.

Logic:

Class A defines a thread that prints messages "From A: " followed by the current iteration number from 0 to 3. It then sleeps for 100 milliseconds between iterations.
Class B defines a similar thread that prints messages "From B: " followed by the current iteration number from 0 to 3. It then sleeps for 200 milliseconds between iterations.
In the main() method of the Multithreading class:
Instances of A and B threads, named threadA and threadB respectively, are created.
The start() method is called on both threadA and threadB, which begins the execution of their respective run() methods concurrently.
Pseudocode:

Define class A extending Thread:
a. Override the run() method to print messages "From A: " followed by the current iteration number from 0 to 3 and sleep for 100 milliseconds between iterations.
Define class B extending Thread:
a. Override the run() method to print messages "From B: " followed by the current iteration number from 0 to 3 and sleep for 200 milliseconds between iterations.
In the main method of class Multithreading:
a. Create an instance of class A named threadA.
b. Create an instance of class B named threadB.
c. Start the execution of threadA.
d. Start the execution of threadB.

Time Complexity:
Creating and starting threads: O(1)

Output:
The program will produce output showing interleaved messages from both threads A and B executing concurrently. Each thread iterates from 0 to 3 and prints a message along with a delay between each iteration. Additionally, each thread will print "Exit From A" or "Exit From B" after completing its iterations.
*/