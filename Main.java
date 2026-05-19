import java.util.Scanner;

class Student {

    int id;
    String name;
    double marks;

    void addStudent() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        name = input.nextLine();

        System.out.print("Enter Student Marks: ");
        marks = input.nextDouble();
    }

    void grade() {

        if (marks >= 90) {
            System.out.println("Grade: A");
        }

        else if (marks >= 80) {
            System.out.println("Grade: B");
        }

        else if (marks >= 70) {
            System.out.println("Grade: C");
        }

        else {
            System.out.println("Grade: Fail");
        }
    }

    void displayStudent() {

        System.out.println("\n----- Student Record -----");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);

        grade();
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.addStudent();

        s1.displayStudent();
    }
}
