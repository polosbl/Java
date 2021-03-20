package Lesson5.Classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
    static int overallNumberOfGroups;
    private static String[] groups = new String[3];
    static int index = 0;

    private Student[] students;
    private String id;
    private String programmingLanguage;

    Group() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер группы:");
        this.id = scanner.nextLine();
        System.out.println("Введите язык программирования:");
        this.programmingLanguage = scanner.nextLine();
        System.out.println("Введите количество студентов:");
        int i = scanner.nextInt();
        while (i < 2) {
            System.out.println("Мало студентов для группы. Введите количество студентов ещё раз:");
            i = scanner.nextInt();
        }
        this.students = new Student[i];

        if (index == groups.length) {
            groups = Arrays.copyOf(groups, groups.length * 2);
        }

        for (int j = 0; j < groups.length; j++) {
            if (groups[index] == null) {
                groups[index] = this.id;
                index++;
                break;
            }
        }
        overallNumberOfGroups++;
    }

    void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    private int getNumberOfStudents() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            count++;

        }
        return count;
    }

    void printInformation() {
        System.out.println("Номер группы: " + id);
        System.out.println("Язык программирования: " + programmingLanguage);
        System.out.println("Количество студентов: " + getNumberOfStudents());
        System.out.println("Список:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            System.out.println(students[i].getFullName());
        }
        System.out.print("\n");
    }

    static void printGroupsList() {
        System.out.println(Arrays.toString(groups));
    }
}
