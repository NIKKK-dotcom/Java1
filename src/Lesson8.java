class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public double plus(double a, double b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double minus(double a, double b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public double calculateSquare(double a) {
        return a * a;
    }

    public double calculateSquare(double a, double b) {
        return a * b;
    }

    public int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
class Calcul{
    public static int multilpy(int a, int b){
        return a*b;
    }
}

public class Lesson8 {
    public static void sayhello(){
        System.out.println("Hello!");
    }
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static void section1() {
        Calculator calc = new Calculator();

        int result_plus = calc.plus(1, 2);
        System.out.println(result_plus);

        int result_minus = calc.minus(1,2);
        System.out.println(result_minus);

        int result_multiply = calc.multiply(1,2);
        System.out.println(result_multiply);

        double result_divide = calc.divide(1,2);
        System.out.println(result_divide);

        double result_square = calc.calculateSquare(5);
        System.out.println(result_square);

        result_square = calc.calculateSquare(5, 6);
        System.out.println(result_square);

        int result_factorial = calc.factorial(4);
        System.out.println(result_factorial);
    }
    public static void dz(){
        System.out.println(Calcul.multilpy(5,3));
    }
    public static void dz2(){
        System.out.println(sum(5));
        System.out.println(sum(6));
    }
    public static int sum(int n){
        if (n<=0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void dz3(){
        print("Хлеб");
    }
    public static void print(String name){
        System.out.println("Продукь " + name);
    }
    public static void print(String name, int quantity, int price){
        System.out.println("Продукт " + name + " Кол-во " + quantity + " Цена " + price);
    }
    public static int dz4(int num){
        if (num==0){
            return 0;
        }
        return (num%10) + dz4(num/10);
    }
    public static void dzz4(){
        System.out.println(dz4(12));
        System.out.println(dz4(0));
    }
    public static int perimeter(int i){
        return 4*i;
    }
    public static void dzz5(){
        for (int i = 1; i<=5; i++){
            System.out.println(perimeter(i));
        }
    }
}

