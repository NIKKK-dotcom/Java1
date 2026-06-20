class Human {
    String name;
    int age;

    static int counter = 0;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public void aboutMe() {
        System.out.println("Я " + name + " и мне " + age + " лет");
    }

    public void sleep() {
        System.out.println("Я " + this.name + " и я сплю");
    }

    public void walk() {
        System.out.println("Я " + this.name + " и я хожу");
    }

    public void eat() {
        System.out.println("Я " + this.name + " и я ем");
    }
}

class Car {
    String name;
    String color;
    int year;
    int powerEngine;

    private static int counterCar = 0;

    // Это конструктор. именно он занимается созданием объектов
    public Car(String name, String color, int year, int powerEngine) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.powerEngine = powerEngine;
        counterCar++;
    }

    public static void howManyCar() {
        System.out.println("Завод произвел " + counterCar + " машин");
    }

    public void startEngine() {
        System.out.println("Engine was started");
    }

    public void stopEngine() {
        System.out.println("Engine was stopped");
    }

    public void forwardCar() {
        System.out.println("Car set off");
    }

    public void stopCar() {
        System.out.println("Car stopped");
    }
}

public class Lesson9 {
    public static void section1() {
        Human human1 = new Human("Katya", 14);
        System.out.println("После создания human1 количество людей: " + Human.counter);
        human1.aboutMe();
        human1.walk();
        human1.eat();
        human1.sleep();

        Human human2 = new Human("Sasha", 22);
        System.out.println("После создания human2 количество людей: " + Human.counter);
        human2.aboutMe();
        human2.sleep();
        human2.eat();
        human2.walk();


    }
    public static void section2() {
        Car car1 = new Car("audi", "black", 2024, 300);
        Car car2 = new Car("matiz", "blue", 2020, 130);
        Car car3 = new Car("lada", "white", 2064, 160);

        Car.howManyCar();

    }
}



























