import java.security.PublicKey;

class Animal {
    public void makeSound() {
        System.out.println("Я животное и издаю какой-то звук");
    }

    public void move() {
        System.out.println("Животное двигается");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public void eat() {
        System.out.println("Животное ест");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Я собака гав гав");
    }

    public void lieDown(){
        System.out.println("Собака легла в нокаут.");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Я кот мяу мяу");
    }
}

class Account{
    private double balance = 0.0;

    public void getBalance() {
        System.out.println("Баланс аккаунта: " + this.balance);
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance+=amount;
        }
        else {
            System.out.println("Сумма депозита должна быть больше нуля.");
        }
    }

    public void withdraw(double amount){
        if (amount <= 0 ){
            System.out.println("Сумма списания должна быть больше нуля.");
        } else if (balance < amount) {
            System.out.println("Недостаточно средств.");
        } else {
            this.balance -= amount;
            System.out.println("Cумма успешно списана.");
        }
    }
}

public class Lesson10 {
    public static void section1() {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        dog.lieDown();
    }

    public static void section2() {
        Account acc1 = new Account();
        acc1.deposit(123);
        acc1.getBalance();
        acc1.withdraw(8999);
    }
}
