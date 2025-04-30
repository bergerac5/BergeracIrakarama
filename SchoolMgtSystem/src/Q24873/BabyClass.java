package Q24873;

public class BabyClass extends NurseryClass {

    public BabyClass(String classId) {
        super(classId, "Baby Class", 15);
    }

    @Override
    public boolean enrollStudent(Student student) {
        if (student.getAge() < 2 || student.getAge() > 3) {
            System.out.println("Enrollment failed: Baby Class is for ages 2–3.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Enrollment failed: Baby Class is full.");
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
        progressNotes = "Developing fine motor skills and social interaction.";
    }

    @Override
    public void conductActivity(String activityName) {
        activities.add(activityName + " (Play-based)");
    }

    @Override
    public String generateClassReport() {
        return "Class: " + className + "\nTeacher: " + assignedTeacher.getTeacherName() +
                "\nStudents: " + students.size() + "\nActivities: " + activities +
                "\nProgress: " + progressNotes;
    }

    @Override
    public void assignTeacher(Teacher teacher) {
        if (!"Early Childhood Educator".equals(teacher.getTeacherRole())) {
            throw new IllegalArgumentException("Teacher must be an Early Childhood Educator for Baby Class.");
        }
        super.assignTeacher(teacher);
    }
}

