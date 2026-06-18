public class dzshka {
    public static void section1(){
        int p1 = 10;
        byte p2 = 1;
        short p3 = 300;
        long p4 = 3000L;
        float p5 = 1.55f;
        double p6 = 1.5555555;
        System.out.println("Значение переменной p1 с типом int равно " + p1 );
        System.out.println("Значение переменной p2 с типом byte равно " + p2 );
        System.out.println("Значение переменной p3 с типом short равно " + p3 );
        System.out.println("Значение переменной p4 с типом long равно " + p4 );
        System.out.println("Значение переменной p5 с типом float равно " + p5 );
        System.out.println("Значение переменной p6 с типом double равно " + p6 );


    }
    public static void section2(){
        int banana = 80;
        int milk = 105;
        int ic = 100;
        int egg = 70;
        int res = 5*banana+milk*2+ic*2+egg*4;
        System.out.println(res);
        System.out.println((double) res/1000);

    }
    public static void section3(){
        int M = 67760;
        int D = 83690;
        int K = 76230;
        int[] spisok={M,D,K};
        for (int i=0;i<spisok.length;i++){
            spisok[i] = (int) (spisok[i] + 0.1 * spisok[i]);
            if (i==0){
                System.out.println("Маша теперь получает " +  spisok[i] + " рублей. Годовой доход вырос на " + (spisok[i]*12-M*12) + " рублей");
            }
            else if (i==1){
                System.out.println("Денис теперь получает " +  spisok[i] + " рублей. Годовой доход вырос на " + (spisok[i]*12-D*12)  + " рублей");
            }
            else if (i==2){
                System.out.println("Кристина теперь получает " +  spisok[i] + " рублей. Годовой доход вырос на " + (spisok[i]*12-K*12) + " рублей");

            }
        }





    }
}

