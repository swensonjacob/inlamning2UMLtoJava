package se.jacobswenson;

public class Attendance {

    private Student student;
    private Seminar seminar;
    private int attendanceLevel;


    public Attendance(Student student, Seminar seminar, int attendanceLevel) {
        this.student = student;
        this.seminar = seminar;
        this.attendanceLevel = attendanceLevel;
        registerAttendance(seminar,student);
    }

    public Student getStudent() {
        return student;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public int getAttendanceLevel() {
        return attendanceLevel;
    }

    public void registerAttendance(Seminar seminar, Student student) {
        student.attendSeminar(this);
        seminar.addAttendance(this);
    }

    public void removeAttendance(Seminar seminar, Student student) {

    }
}
