//interface
interface InterfaceStudent {
    static boolean isAttendant() {
        return true;
    }
}

public class Student extends Person implements InterfaceStudent {
    //attribute
    private String faculty;
    private int average;

    //constructor
    public Student(String name, int age, String faculty, int average) {
        super(name, age);
        this.faculty = faculty;
        this.average = average;
    }

    //main method
    public static void main(String[] args) {
        InterfaceStudent.isAttendant();
    }

    //getter and setters
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}

