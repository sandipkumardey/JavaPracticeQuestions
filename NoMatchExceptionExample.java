class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class NoMatchExceptionExample {

    public static void checkString(String input) throws NoMatchException {
        if (!input.equals("India")) {
            throw new NoMatchException("String does not match 'India': " + input);
        } else {
            System.out.println("String matches 'India'");
        }
    }

    public static void main(String[] args) {
        try {
            checkString("USA");
        } catch (NoMatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkString("India");
        } catch (NoMatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
