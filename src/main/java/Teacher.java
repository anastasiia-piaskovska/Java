interface InterfaceTeacher {
    static boolean isAttended() {
        return true;
    }
}

public class Teacher extends Person implements InterfaceTeacher {
    private String subject;
    private int salary;

    public Teacher(String name, int age, String subject, int salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public static void main(String[] args) {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        double bonusRate = 0.2;
        this.salary = (int) (this.salary * bonusRate);
    }
}
