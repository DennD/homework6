package ru.geekbrains.oskindi;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");
        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Tuzik");
        Dog dog3 = new Dog("Sharik");

        dog1.run(300);
        dog2.run(600);
        cat1.swim(200);

        System.out.println("Всего животных " + Animal.getCount());
        System.out.println("Всего котов " + Cat.getCountCat());
        System.out.println("Всего собак " + Dog.getCountDog());


    }
}
