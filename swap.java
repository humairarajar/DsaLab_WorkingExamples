class SwapExample {
    int a, b;

    // Constructor to initialize the values
    SwapExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to swap the values of a and b
    void swap() {
        // Using arithmetic operations (addition and subtraction)
        a = a + b;  // a becomes sum of a and b
        b = a - b;  // b becomes original a (a + b - b = a)
        a = a - b;  // a becomes original b (a + b - a = b)
    }

    // Method to display values of a and b
    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        SwapExample obj = new SwapExample(10, 20);
        System.out.println("Before swapping:");
        obj.display();

        obj.swap();  // Swapping the values of a and b

        System.out.println("After swapping:");
        obj.display();
    }
}
