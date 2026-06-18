public class Lesson3 {
    public static void section1(){
//        for (int i = начало; i <= конец; i+=1) {...действие для повторения...}
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 10; i>=0; i--){
            System.out.println(i);
        }
    }

    public static void section2(){
        for (int i=1; i<=5;i++){
           for (int j=1; j<=5; j++) {
               System.out.print(i * j + "\t");
           }
           System.out.println();
        }
    }

    public static void section3() {
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
