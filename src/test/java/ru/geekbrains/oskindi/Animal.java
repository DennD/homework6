package ru.geekbrains.oskindi;

abstract class Animal {
    String name;
    int maxDistRun;
    int maxDistSwim;
    static int count;


    public void run(int distance) {
        if (distance < maxDistRun) {
            System.out.printf("%s пробежал %d м\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d м\n", name, distance);
        }
    }

    public void swim(int distance) {
        if (distance < maxDistSwim) {
            System.out.printf("%s проплыл %d м\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d м\n", name, distance);
        }
    }

    public static int getCount() {
        return count;
    }
}


