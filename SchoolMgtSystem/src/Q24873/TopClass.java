package Q24873;

public class TopClass extends NurseryClass {

    public TopClass(String classId) {
        super(classId, "Top Class", 25);
    }

    @Override
    public boolean enrollStudent(Student student) {
        if (student.getAge() < 4 || student.getAge() > 5) {
            System.out.println("Enrollment failed: Top Class is for ages 4–5.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Enrollment failed: Top Class is full.");
            return false;
        }
        for (Student s : students) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println("Enrollment failed: Duplicate student ID.");
                return false;
            }
        }
        students.add(student);
        student.registerClass(this);
        return true;
    }

    @Override
    public void trackProgress() {
        progressNotes = "Pre-primary development with basic literacy and math assessments.";
    }

    @Override
    public void conductActivity(String activityName) {
        activities.add(activityName + " (Structured)");
    }

    @Override
    public String generateClassReport() {
        return "Class: " + className + "\nTeacher: " + assignedTeacher.getTeacherName() +
                "\nStudents: " + students.size() + "\nActivities: " + activities +
                "\nProgress: " + progressNotes + "\nAssessments: Completed for the term.";
    }
}

