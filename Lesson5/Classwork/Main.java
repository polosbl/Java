package Lesson5.Classwork;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        Student student1 = new Student();

//        student1.age = 18;
//        student1.lastName = "Smith";
//        student1.firstName = "John";

        student1.printInformation();
        group.addStudent(student1);
//        System.out.println("Полное имя: " + student1.getFullName());
//        System.out.println("Полное имя с префиксом: " + student1.addPrefix("Mr. "));

//        Student student2 = new Student();
//        group.addStudent(student2);
//        student2.printInformation();

        group.printInformation();

        System.out.println("Всего студентов: " + Student.getOverallNumberOfStudents());

        Group group2 = new Group();

        Student student3 = new Student();
        group2.addStudent(student3);
        student3.printInformation();

        System.out.println("Количество групп: " + Group.overallNumberOfGroups);
        Group.printGroupsList();

        System.out.println("Всего студентов: " + Student.getOverallNumberOfStudents());
    }
}
