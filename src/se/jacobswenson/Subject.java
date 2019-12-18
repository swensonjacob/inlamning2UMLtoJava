package se.jacobswenson;

public class Subject {
    private String name;
    private Seminar seminar;
    private String info;

    public Subject(String name, Seminar seminar, String info) {
        this.name = name;
        this.seminar = seminar;
        seminar.addSubject(this);
    }

    public String getName() {
        return name;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public String viewSubjectInfo() {
    return info;
    }
}
