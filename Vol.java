import java.util.*;

class Calculate{

    int s, r, h, l, b;
    Calculate(int a, int b, int c, int d, int e) 
    {
        s = a;
        r = b;
        h = c;
        l = d;
        this.b = e;
    }

    void Cube ()
    {
        System.out.println("Volume of cube:" + s*s*s);
    }

    void Cylinder ()
    {
        System.out.println("Volume of cylinder:" + Math.PI * r * r * h);
    }

    void Cuboid ()
    {
        System.out.println("Volume of cuboid:" + l*b*h);
    }
}

class Vol {
    public static void main(String[] args) {
        int side = 5;
        int radius = 3;
        int height = 8;
        int length = 6;
        int breadth = 4;
 
        Calculate obj = new Calculate(side, radius, height, length, breadth);

        obj.Cube();
        obj.Cylinder();
        obj.Cuboid();
    }
}

/*
 * Approach:

Problem:
The problem involves calculating the volume of different geometric shapes such as a cube, cylinder, and cuboid.

Preface:
The program defines two classes: Calculate and Vol. The Calculate class contains attributes representing the dimensions of various shapes and methods to calculate their volumes. The Vol class creates an instance of the Calculate class and calls its methods to calculate and display the volumes of the cube, cylinder, and cuboid.

Logic:

Define a class Calculate with attributes representing the dimensions of a cube, cylinder, and cuboid.
Define methods Cube(), Cylinder(), and Cuboid() to calculate the volumes of the respective shapes.
In the main method of the Vol class:
Create an instance of the Calculate class with the given dimensions.
Call the Cube(), Cylinder(), and Cuboid() methods to calculate and display the volumes of the shapes.

Pseudocode:

Define a class Calculate with attributes for the dimensions of a cube, cylinder, and cuboid.
Define methods Cube(), Cylinder(), and Cuboid() to calculate the volumes of the respective shapes.
In the main method of the Vol class:
a. Create an instance of the Calculate class with the given dimensions.
b. Call the Cube(), Cylinder(), and Cuboid() methods to calculate and display the volumes of the shapes.

Time Complexity:
The time complexity of calculating the volume of each shape is O(1).

Output:
The program will output the volume of the cube, cylinder, and cuboid based on the given dimensions.
 */