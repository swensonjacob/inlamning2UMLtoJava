package se.jacobswenson;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

    private String name;
    private Program program;
    private Teacher teacher;
    private List<Attendance> attendanceList;
    private List<Subject> subjects;

    public Seminar(String name, Teacher teacher, Program program) {
        this.name = name;
        this.teacher = teacher;
        this.program = program;
        this.attendanceList = new ArrayList<>();
        this.subjects = new ArrayList<>();
        teacher.addSeminar(this);
        program.addSeminar(this);
    }

    public void addAttendance(Attendance attendance) {
        attendanceList.add(attendance);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Attendance> getTotalAttendance() {
        return attendanceList;
    }
}
