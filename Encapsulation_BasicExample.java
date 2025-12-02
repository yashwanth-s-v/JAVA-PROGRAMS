// Demonstrates the creation of a class and its object

class Car {
    String brand = "Toyota";
    int year = 2022;
}

public class ClassObject_BasicExample {
    public static void main(String[] args) {
        Car c = new Car(); // creating object
        System.out.println("Brand: " + c.brand);
        System.out.println("Year: " + c.year);
    }
}
