package se.jacobswenson;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private String name;
    private ProgramCoordinator coordinator;
    private List<Seminar> seminars;

    public Program(String name, ProgramCoordinator coordinator) {
        this.name = name;
        this.coordinator = coordinator;
        seminars = new ArrayList<>();
        coordinator.setProgram(this);
    }

    public void addSeminar(Seminar seminar) {
     seminars.add(seminar);
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for (Seminar seminar: seminars) {
            if (!teachers.contains(seminar.getTeacher())) {
                teachers.add(seminar.getTeacher());
            }
        }
        return teachers;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Seminar seminar: seminars) {
            for (Attendance attendance: seminar.getTotalAttendance()) {
                if (!students.contains(attendance.getStudent())) {
                    students.add(attendance.getStudent());
                }
            }
        }
       return students;
    }
}
