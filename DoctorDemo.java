// File: DoctorDemo.java

// Base class
class Doctor {
    void consultationFee() {
        System.out.println("General consultation fee: ₹500");
    }
}

// Subclass 1
class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹800");
    }
}

// Subclass 2
class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹1500");
    }
}

// Subclass 3
class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon consultation fee: ₹2000");
    }
}

// Main class
public class DoctorDemo {
    public static void main(String[] args) {

        // Creating subclass objects using base class reference (method overriding)
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        // Calling overridden methods
        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
