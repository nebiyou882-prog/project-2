[5/3/2026 1:23 PM] Neba: package university.people;

public class Person {
    protected String name;   // Protected Access Modifier
    protected int age;

    public Person(String name, int age) {
        this.name = name;   // this keyword
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void role() {
        System.out.println("I am a Person");
    }

    public final void citizenship() {
        System.out.println("Citizen details cannot be changed.");
    }
}
[5/3/2026 1:23 PM] Neba: package university.students;

import university.people.Person;

public class Student extends Person {
    protected String major;

    public Student(String name, int age, String major) {
        super(name, age);  // super() Constructor Call
        this.major = major;
    }

    @Override
    public void displayInfo() {   // Method Overriding
        super.displayInfo();      // super keyword (method)
        System.out.println("Major: " + major);
    }

    public static void role() {   // Method Hiding
        System.out.println("I am a Student");
    }
}
[5/3/2026 1:23 PM] Neba: package university.students;

public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}
[5/3/2026 1:24 PM] Neba: package university.staff;

import university.people.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
[5/3/2026 1:24 PM] Neba: package university.admin;

public final class Principal {
    public void showAuthority() {
        System.out.println("Principal manages the institution.");
    }
}
[5/3/2026 1:24 PM] Neba: import university.students.*;
import university.staff.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, "Computer Science");
        GraduateStudent g1 = new GraduateStudent("Bob", 24, "AI", "Machine Learning");
        Teacher t1 = new Teacher("Dr. Smith", 45, "Mathematics");

        s1.displayInfo();
        System.out.println();

        g1.displayInfo();
        System.out.println();

        t1.displayInfo();
        System.out.println();

        // Static Method Hiding
        Person.role();
        Student.role();

        // Final Method
        s1.citizenship();
    }
}