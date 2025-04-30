package Q24873;

import java.util.ArrayList;
import java.util.List;

public abstract class NurseryClass {
    protected String classId;
    protected String className;
    protected int maxCapacity;
    protected Teacher assignedTeacher;
    protected List<Student> students;
    protected List<String> activities;
    protected String progressNotes;

    public NurseryClass(String classId, String className, int maxCapacity) {
        this.classId = classId;
        this.className = className;
        this.maxCapacity = maxCapacity;
        this.students = new ArrayList<>();
        this.activities = new ArrayList<>();
        this.progressNotes = "";
    }

    public String getClassName() { return className; }
    public Teacher getAssignedTeacher() { return assignedTeacher; }
    public List<Student> getStudents() { return students; }
    public List<String> getActivities() { return activities; }

    public void assignTeacher(Teacher teacher) {
        this.assignedTeacher = teacher;
        teacher.assignClass(this);
    }

    public abstract boolean enrollStudent(Student student);
    public abstract void trackProgress();
    public abstract void conductActivity(String activityName);
    public abstract String generateClassReport();
}

