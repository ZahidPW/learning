
public class Clc {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));             // Invokes the int add(int a, int b) method
        System.out.println(calculator.add(3.7, 2.8));          // Invokes the double add(double a, double b) method
        System.out.println(calculator.add(2, 4, 6));           // Invokes the int add(int a, int b, int c) method
    }
}