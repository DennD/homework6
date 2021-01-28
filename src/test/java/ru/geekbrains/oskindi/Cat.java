package ru.geekbrains.oskindi;

class Cat extends Animal {
    private static int countCat;

    public Cat(String name) {
        this.name = name;
        maxDistRun = 200;
        maxDistSwim = 0;
        count++;
        countCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCountCat() {
        return countCat;
    }
}
