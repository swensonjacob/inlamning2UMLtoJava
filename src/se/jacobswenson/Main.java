package se.jacobswenson;


public class Main {

    public static void main(String[] args) {

        //Lärare
        Teacher robert = new Teacher("Robert");
        Teacher sigrun = new Teacher("Sigrun");

        //Studenter
        Student jacob = new Student("Jacob");
        Student marcus = new Student("Marcus");

        //Programkoordinator
        ProgramCoordinator sara = new ProgramCoordinator("Sara");

        //Program
        Program java = new Program("Java19", sara);

        //Seminar
        Seminar ooad = new Seminar("Objektorienterad analys och design", robert, java);
        Seminar database = new Seminar("Databaser", sigrun, java);
        Seminar objectProgramming = new Seminar("Objektorienterad programmering", sigrun, java);

        //Ämnen
        Subject useCase = new Subject("Användarfall",ooad, "Genomgång av användarfallsdiagram");
        Subject designPattern = new Subject("Designmönster",ooad, " Genomgång av de populäraste designmönstren");

        //Student läggs till i seminar vilket tillhör ett program genom Attendance
        Attendance attendance1 = new Attendance(jacob,ooad,80);
        Attendance attendance2 = new Attendance(jacob,database,100);
        Attendance attendance3 = new Attendance(marcus,database,50);
        Attendance attendance4 = new Attendance(jacob,objectProgramming,70);

        //Print
        print1(sara);
        print2(java);
        print3(java);
        print4(jacob);
        print5(sigrun);
        print6(database);
    }

        //Vilket program en Coordinator ansvarar för?
        public static void print1(ProgramCoordinator coordinator) {
            System.out.println(coordinator.getName() + " ansvarar för: " + coordinator.getProgram().getName());
            System.out.println("--------------------------");
        }

        //Vilka lärare som finns för ett Program?
        public static void print2(Program program) {
            System.out.println("Lärare för " + program.getName() + ":");
            for (Teacher teacher : program.getTeachers()) {
                System.out.println(teacher.getName());
            }
            System.out.println("--------------------------");
        }
        //Hur många studenter som finns i ett Program?
        public static void print3(Program program) {
            System.out.println("Studenter för " + program.getName() + ": " + program.getStudents().size() + " st");
            System.out.println("--------------------------");
        }
        //Närvaron är för Student X
        public static void print4(Student student) {
            System.out.println("Närvaro för " + student.getName() + ":");
        for (Attendance attendance:student.getSeminarsAttended() ) {
            System.out.println(attendance.getSeminar().getName() + ": " + attendance.getAttendanceLevel() + "%");
        }
            System.out.println("--------------------------");
        }
    //Vilka kurser/seminarier som en lärare undervisat i
    public static void print5(Teacher teacher) {
        System.out.println("Undervisade kurser för " + teacher.getName() + ":");
        for (Seminar seminar : teacher.getSeminarHistory()) {
            System.out.println(seminar.getName());
        }
        System.out.println("--------------------------");
    }
    //Vilka lärare som finns för ett Program?
    public static void print6(Seminar seminar) {
        System.out.println("Närvaro för " + seminar.getName() + ":");
        for (Attendance attendance : seminar.getTotalAttendance()) {
            System.out.println(attendance.getStudent().getName() + ": " + attendance.getAttendanceLevel());
        }
        System.out.println("--------------------------");
    }

}
