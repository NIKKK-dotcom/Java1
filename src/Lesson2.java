public class Lesson2 {
    public static void section1() {
        int age = 13;
        if (age >= 18) {
            System.out.println("Тебе " + age + " и ты совершеннолетний!");
        } else if (age < 0){
            System.out.println("Вы ошиблись, укажите заново.");
        }
        else {
            System.out.println("Тебе "+ age + " и ты несовершеннолетний!");
        }
    }
    public static void section2() {
//        && - И
//        || - ИЛИ
//        if (условие1 && условие2) {...какой-то код...}
//        if (условие1 || условие2) {...какой-то код...}
        int age = 19;
        boolean inAdult = true;
        if (age >= 18 && inAdult) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты несовершеннолетний");
        }
    }
    public static void section3() {
        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели!");
                break;
        }
    }

}
