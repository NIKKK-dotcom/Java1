public class Lesson7 {
    public static void section1(){
        String str = "Hello world!";
        System.out.println("Длина строки: " + str.length());
        System.out.println("Первый символ: " + str.charAt(0));
        System.out.println(str.substring(6,11));
        System.out.println(str.indexOf("world"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
    public static void section2(){
        String lol = "xz chto pisat";
        System.out.println(lol.length());
        System.out.println(lol.toLowerCase());
        System.out.println(lol.toUpperCase());
        System.out.println(lol.indexOf("chto"));
    }
    public static void section3(){
        String message = String.format("Привет, %s!", "Анна");
        System.out.println(message);

        int age = 10;
        message = String.format("Вам %d лет.", age);
        System.out.println(message);

        double price = 123.456789;
        message = String.format("Цена: %.2f рублей", price);
        System.out.println(message);

        message = String.format("Привет! Меня зовут %s, мне %d лет, я люблю %s", "Валера", 15, "футбол");
        System.out.println(message);
    }
    public static void dz(){
        String text = "Hello!";
        char first = text.charAt(0);
        boolean contains = text.contains("Java");
        System.out.println("Длина строки" + text.length() + "Первый символ" + first + "Содержит Java" + contains);

    }
    public static void dz1(){
        String text = "Прога прога Java ";
        System.out.println(text.substring(0,3));
        System.out.println(text.toUpperCase());
        System.out.println(text.indexOf("Java"));

    }
    public static void dz2(String name, int quantity, double price){
        double total = quantity*price;
        System.out.println("Вы купили" +name +"количество: " + quantity  +  "итоговая стоимость: " + total);
    }
}
