package se.jacobswenson;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Attendance> attendances;

    public Student(String name) {
        this.name = name;
        this.attendances = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Attendance> getSeminarsAttended() {
        return attendances;
    }
    public void attendSeminar(Attendance attendance) {
        attendances.add(attendance);
    }
}
