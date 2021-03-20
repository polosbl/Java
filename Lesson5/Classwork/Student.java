package Lesson5.Classwork;

import java.util.Scanner;

public class Student {
    private static int overallNumberOfStudents;

    private String firstName;
    private String lastName;
    private int age;

//    Конструктор, который просит ввести значения
    Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        this.firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        this.lastName = scanner.nextLine();
        System.out.println("Введите возраст:");
        this.age = scanner.nextInt();

        overallNumberOfStudents++;
    }

    static int getOverallNumberOfStudents() {
        return overallNumberOfStudents;
    }

    void printInformation() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Полное имя: " + getFullName());
        System.out.println("Полное имя с префиксом: " + addPrefix("Mr. "));
        System.out.print("\n");
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    private String addPrefix(String prefix) {
        return prefix + getFullName();
    }

}
