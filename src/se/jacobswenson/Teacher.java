package se.jacobswenson;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Seminar> seminars;

    public Teacher(String name) {
        this.name = name;
        this.seminars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSeminar(Seminar seminar) {
        seminars.add(seminar);
    }

    public Seminar getCurrentSeminar() {
        return seminars.get(0);
    }

    public List<Seminar> getSeminarHistory() {
        return seminars;
    }

}
