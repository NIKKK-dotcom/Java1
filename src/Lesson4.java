import java.util.Scanner;

public class Lesson4 {
    public static void section1(){
//        while (condition) {
//            действие для повторения
//        }
        int number = 1;
        while (number<=20){
            if (number%3==0){
                System.out.println(number);
            }
            number++;

        }
    }
    public static void section2(){
//        do {
//            действие
//        } while (условие);

        int number;
        do {
            number = (int) (Math.random() * 150);
            System.out.println("Случайное число: " + number);
        } while (number<=100);
        System.out.println("Число больше 100: " + number);
    }
    public static void section3(){
        int number=0;
        while (number<=100){
           if (number%2==0 && number!=0 ){
               System.out.println(number);
           }
           number++;
        }
    }
    public static void section4() {
        Scanner in = new Scanner(System.in);

        String correctPassword = "qwerty";
        String inputPassword;
        do {
            inputPassword=in.nextLine();
            System.out.println("Введенный пароль: " + inputPassword);
        } while (!inputPassword.equals(correctPassword));
    }

}
