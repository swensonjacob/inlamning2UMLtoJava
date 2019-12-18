package se.jacobswenson;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {

    private String name;
    private List<Teacher> teachers;
    private Program program;

    public ProgramCoordinator(String name) {
        this.name = name;
        teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void addTeacher(Teacher teacher) {
    teachers.add(teacher);
    }

    public Teacher findTeacher(String name) {
        for (Teacher teacher: teachers) {
            if (teacher.getName().equalsIgnoreCase(name)) {
                return teacher;
            }
        }
         return null;
    }
}
