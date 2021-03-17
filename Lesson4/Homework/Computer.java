package Lesson4.Homework;

import java.util.Scanner;

public class Computer {
    String cpu;
    String ram;
    String hdd;
    int cyclesLeft;
    boolean isDead = false;
    boolean isOn = false;

    Computer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Процессор: ");
        this.cpu = scanner.nextLine();
        System.out.println("Оперативка: ");
        this.ram = scanner.nextLine();
        System.out.println("Жесткий диск: ");
        this.hdd = scanner.nextLine();
        do {
            System.out.println("Количество полных циклов работы: ");
            this.cyclesLeft = scanner.nextInt();
        } while (this.cyclesLeft <= 0);

    }

    void printInformation() {
        System.out.println("Процессор: " + cpu);
        System.out.println("Оперативка: " + ram);
        System.out.println("Жесткий: " + hdd);
        System.out.println("Количество полных циклов работы: " + cyclesLeft);
        System.out.print("\n");
    }

    void turnOn() {
        Scanner scanner = new Scanner(System.in);

        if (this.isDead == true) {
            System.out.println("Комп уже сдох. Включить не получится");
            return;
        } else if (this.cyclesLeft == 0) {
            System.out.println("Комп уже сдох. Отработал своё");
            return;
        }

        int number = (int) (Math.random() * 2);
        System.out.println(number);

        System.out.println("Угадай))");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Комп включился");
            this.isOn = true;
            turnOff();
            this.cyclesLeft--;
        } else {
            this.isDead = true;
            System.out.println("Комп сдох((");
        }
    }

    void turnOff(){
        Scanner scanner = new Scanner(System.in);

        if (this.isOn == false) {
            System.out.println("Комп выключен");
            return;
        }

        int number = (int) (Math.random() * 2);
        System.out.println(number);

        System.out.println("Угадай))");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Комп выключился");
            this.isOn = false;
            return;
        } else {
            this.isDead = true;
            System.out.println("Комп сдох((");
        }
    }
}
