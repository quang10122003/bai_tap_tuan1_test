public class Calculator {
    // Phương thức tính tổng hai số
    public int add(int a, int b) {
        return a + b;
    }

    // Phương thức tính hiệu hai số
    public int subtract(int a, int b) {
        return a - b;
    }

    // Phương thức tính tích hai số
    public int multiply(int a, int b) {
        return a * b;
    }

    // Phương thức tính thương hai số
    public int divide(int a, int b) {
        // Nếu bằng 0, ném ra ngoại lệ IllegalArgumentException
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Phương thức tính lũy thừa
    public int power(int base, int exponent) {
        // Nếu số mũ âm, ném ra ngoại lệ IllegalArgumentException
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
