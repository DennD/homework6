package ru.geekbrains.oskindi;

class Dog extends Animal {
    private static int countDog;

    public Dog(String name) {
        this.name = name;
        maxDistRun = 500;
        maxDistSwim = 10;
        count++;
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }
}

