package Q24873;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create teachers
        Teacher teacher1 = new Teacher("T001", "Alice Kim", "Early Childhood Educator");
        Teacher teacher2 = new Teacher("T002", "John Doe", "Assistant");
        Teacher teacher3 = new Teacher("T003", "Sarah Lee", "Early Childhood Educator"); // New teacher for TopClass

        // Create nursery classes
        BabyClass babyClass = new BabyClass("C001");
        MiddleClass middleClass = new MiddleClass("C002");
        TopClass topClass = new TopClass("C003");

        // Assign teachers
        try {
            babyClass.assignTeacher(teacher1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        middleClass.assignTeacher(teacher2); // This is allowed without role check in middle class
        topClass.assignTeacher(teacher3); // Assign teacher to TopClass

        // Create students
        Student s1 = new Student("S001", "Emily", 2, "Mrs. Green");
        Student s2 = new Student("S002", "Tom", 3, "Mr. Blue");
        Student s3 = new Student("S003", "Lara", 4, "Ms. Red");

        // Enroll students
        babyClass.enrollStudent(s1);
        middleClass.enrollStudent(s2);
        topClass.enrollStudent(s3);

        // Conduct activities
        babyClass.conductActivity("Singing");
        middleClass.conductActivity("Storytelling");
        topClass.conductActivity("Math Practice");

        // Track progress
        babyClass.trackProgress();
        middleClass.trackProgress();
        topClass.trackProgress();

        // Generate reports
        System.out.println("\n--- Baby Class Report ---");
        System.out.println(babyClass.generateClassReport());

        System.out.println("\n--- Middle Class Report ---");
        System.out.println(middleClass.generateClassReport());

        System.out.println("\n--- Top Class Report ---");
        System.out.println(topClass.generateClassReport());

        scanner.close();
    }

}

