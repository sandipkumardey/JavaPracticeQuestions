class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class MyOwnException {
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18 years.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
