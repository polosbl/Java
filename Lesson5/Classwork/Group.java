package Lesson5.Classwork;

import java.util.Scanner;

public class Group {
    static int overallNumberOfGroups;
    static String[] groups = new String[3];
    static int index = 0;

    String[] students;
    String id;
    String programmingLanguage;

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
        this.students = new String[i];

        if (index <= groups.length) {
            groups[index] = this.id;
            index++;
            overallNumberOfGroups++;
        } else {
            index = 0;
            int newLength = groups.length * 2;
            String[] newGroups = new String[newLength];
//            newGroups[index];
        }
    }

    void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student.getFullName();
                break;
            }
        }
    }

    int getNumberOfStudents() {
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
            if(students[i] == null) {
                break;
            }
            System.out.println(students[i]);
        }
        System.out.print("\n");
    }
}
