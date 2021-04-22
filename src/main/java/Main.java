import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    //main method
    public static void main(String[] args) {
        Teacher[] teachers = {
            new Teacher("Rick", 1, "Maths", 2000),
            new Teacher("Sam", 20, "English", 3000),
            new Teacher("Adi", 5, "Maths", 1000),
            new Teacher("Ben", 10, "English", 2032)
        };

        Student[] students = {
            new Student("Rick", 1, "Maths", 100),
            new Student("Sam", 20, "English", 80),
            new Student("Adi", 5, "Maths", 95),
            new Student("Ben", 10, "English", 70)
        };

        Object[] persons = mergeArray(teachers, students);

        //initialization of method
        searchStudentByFaculty(students, "English");
        searchPersonByName(persons, "Sam");
        searchTeacherBySubject(teachers, "Maths");
    }

    private static Object[] mergeArray(Teacher[] teachers, Student[] students) {
        return Stream.of(teachers, students).flatMap(Stream::of).toArray();
    }

    //method
    static void searchStudentByFaculty(Student[] list, String faculty) {
        List<Student> result = new ArrayList<>();

        //loop
        for (Student student : list) {
            if (student.getFaculty().equals(faculty)) {
                result.add(student);
            }
        }

        System.out.println(result);
    }

    static void searchPersonByName(Object[] list, String name) {
        List<Person> result = new ArrayList<>();
        List<Person> dataPerson = new ArrayList<>();

        for (Object data : list) {
            dataPerson.add((Person) data);
        }

        for (Person person : dataPerson) {
            if (person.getName().equals(name)) {
                result.add(person);
            }
        }
        System.out.println(result);
    }

    //method
    static void searchTeacherBySubject(Teacher[] list, String subject) {
        List<Teacher> result = new ArrayList<>();
        for (Teacher teacher : list) {
            if (teacher.getSubject().equals(subject)) {
                System.out.println(teacher.getName());
            }
        }
        System.out.println(result);
    }
}
