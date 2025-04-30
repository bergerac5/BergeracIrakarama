package Q24873;

public class MiddleClass extends NurseryClass {

    public MiddleClass(String classId) {
        super(classId, "Middle Class", 20);
    }

    @Override
    public boolean enrollStudent(Student student) {
        if (student.getAge() < 3 || student.getAge() > 4) {
            System.out.println("Enrollment failed: Middle Class is for ages 3–4.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Enrollment failed: Middle Class is full.");
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
        progressNotes = "Focus on language development and basic numeracy.";
    }

    @Override
    public void conductActivity(String activityName) {
        activities.add(activityName + " (Interactive)");
    }

    @Override
    public String generateClassReport() {
        return "Class: " + className + "\nTeacher: " + assignedTeacher.getTeacherName() +
                "\nStudents: " + students.size() + "\nActivities: " + activities +
                "\nProgress: " + progressNotes;
    }
}
