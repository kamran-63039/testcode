public class testcode {
    public static void main(String[] args) {
        try {
            // Code jo exception throw kar sakta hai
            int result = 10 / 0;  // Yeh ArithmeticException throw karega
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Exception handle karne ka code
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Kisi bhi aur general exception ko handle karne ke liye
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Yeh block hamesha chalega, chahe exception aaye ya na aaye
            System.out.println("Execution completed.");
        }
    }
}