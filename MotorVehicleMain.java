class MotorVehicle{
    String modelName;
    int modelNumber, modelPrice;
    MotorVehicle(String modelName, int modelNumber, int modelPrice){
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }
    void display(){
    }
}

class Car extends MotorVehicle{
    double discountRate, discount;
    Car(String modelName, int modelNumber, int modelPrice, int discountRate){
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
        CalculateDiscount();
    }
    void CalculateDiscount(){
        discount = (modelPrice * discountRate) / 100.00;
    }
    void display(){
        System.out.println("Model Name:"+modelName+" Model Number:"+modelNumber+" Model Price:"+modelPrice+" Discount amount is:"+discount);
    }
}

class MotorVehicleMain{
    public static void main(String []args){
        Car obj1 = new Car("Pagani", 1001, 40000000, 5);
        obj1.display();
        Car obj2 = new Car("Koenigsegg", 2002, 30000000, 6);
        obj2.display();
        Car obj3 = new Car("Rimac", 3003, 20000000, 7);
        obj3.display();
        Car obj4 = new Car("Bugatti", 4004, 10000000, 8);
        obj4.display();

    }
}

/*
 * Approach:
Problem:

The problem involves understanding inheritance and method overriding in Java.

Preface:

The program defines a class MotorVehicle with attributes modelName, modelNumber, and modelPrice, along with a method display(). It also defines a subclass Car that extends MotorVehicle and adds attributes discountRate and discount, along with a method CalculateDiscount(). The Car class also overrides the display() method to display model details along with the discount amount. Finally, there's a main method in the MotorVehicleMain class that creates instances of Car and displays their details.

Logic:

The MotorVehicle class defines a constructor to initialize the attributes and a display() method to display vehicle details.
The Car class extends MotorVehicle and adds a constructor to initialize discount related attributes and a method CalculateDiscount() to calculate the discount amount.
The Car class overrides the display() method to display vehicle details along with the discount amount.
The MotorVehicleMain class contains the main() method where instances of Car are created and their details are displayed.

Pseudocode:
1. Define a class MotorVehicle with attributes modelName, modelNumber, and modelPrice, and a display() method.
2. Define a class Car that extends MotorVehicle with additional attributes discountRate and discount, and methods CalculateDiscount() and display().
3. In the main method:
    - Create instances of Car with different details.
    - Display the details of each Car.


Time Complexity:

Creating instances and displaying details: O(1) per instance.

Output:
The program will output the details of each car instance created, including model name, model number, model price, and discount amount.
 */