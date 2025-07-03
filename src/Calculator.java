public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a % b;
    }
    public int power(int base, int exponent) {
    	if (exponent == 0) {
        return 1;
        }
    	int result = 1;
    		for (int i = 0; i < exponent; i++) {
        result *= base;
    	}
    return result;
    }
}

