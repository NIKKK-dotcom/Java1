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
    public static void section4(){
         int x=2;
         if (2<=x && x<=6){
             System.out.println("Если возраст человека равен"+ x +", то ему нужно ходить в детсад");
         }
         else if (7<=x && x<=17){
             System.out.println("Если возраст человека равен"+ x +", то ему нужно ходить в шк");
         }
         else if (18<=x && x<=24) {
             System.out.println("Если возраст человека равен" + x + ", то ему нужно ходить в универ");
         }
         else if (x>24) {
             System.out.println("Если возраст человека равен" + x + ", то ему нужно ходить на работу");
         }
    }
    public static void section5(){
        int x = 50;

        if (x<=60){
            System.out.println("Есть сидячие места: " + (60-x) + " Есть стоячие места: " + (102-60));
        }
        else if (x>60){
            System.out.println("Нет сидячих мест. Есть стоячие места: " + (102-x));
        }
        else{
            System.out.println("Нет мест.");
        }
        }
    public static void section6(){
        int year = 2021;
        if (year > 1584 && year%4==0 && year%100!=0 && year%400==0){
            System.out.println(year +  " год является високосным");
        }
        else{
            System.out.println(year + " год не является високосным");
        }
    }
    public static void section7(){
        int monthNum = 12;
        if (monthNum<0 || monthNum>12){
            System.out.println("Ошибка!");
        }
        else{
            switch (monthNum){
                case 12: case 1: case 2:
                    System.out.println("зима");
                    break;
                case 3: case 4: case 5:
                    System.out.println("весна");
                    break;
                case 6: case 7: case 8:
                    System.out.println("лето");
                    break;
                case 9: case 10: case 11:
                    System.out.println("осень");
                    break;

            }
        }

            }
    public static void section8(){
        for (int i=1; i<11; i++){
            System.out.println(i);
        }
    }
    public static void section9(){
        for (int i=0; i<22; i++){
            if (i%2==0){
                System.out.println(i);}
        }
    }
    public static void section10(){
        for (int i=7; i<99; i+=7){
            System.out.println(i);
        }
    }
    public static void section11(){
        int a = 12000;
        for (int i=1;i<13;i++){
            System.out.println("Месяц "+ i+", сумма накоплений равна " + (a*i)+ " рублей.");
        }


    }
    public static void section12(){                                // новое дзззз
        int num = 1;
        while (num<51){
            if (num%2==0){
                System.out.println(num);
            }
            num++;

        }
    } // ДЗЗЗЗЗЗЗЗЗЗЗЗ
    public static void section13(){
        int a = 1;
        int c = 0;
        do{
            if (a%7==0){
                c++;
            }
            a++;

        }while (a<=100);
        System.out.println("Количество чисел от 1 до 100, делящихся на 7: "+c);

        }
    public static void section14(){
        int su = 0;
        int st = 1;
        while (st<101){
            su+=st;
            st++;
            System.out.println(su);
        }
    }
    public static void section15(){
        int RandomNum;
        int count = 0;
        do {
            RandomNum = (int) (Math.random() * 20) + 1;
            count++;
            System.out.println("Сгенерино число: " + RandomNum);
        }    while (RandomNum!=15);
        System.out.println("Кол-во сгенериных чисел до 15: " + count);
    }
    }




