import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    private int studentId;
    private String firstName;
    private double gpa;

    public Student(int studentId, String firstName, double gpa) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGpa() {
        return gpa;
    }

    public int compareTo(Student other) {
        if (this.gpa != other.gpa) {
            return Double.compare(other.gpa, this.gpa); // Sort by GPA in descending order
        } else if (!this.firstName.equals(other.firstName)) {
            return this.firstName.compareTo(other.firstName); // Sort by first name in alphabetical order
        } else {
            return Integer.compare(this.studentId, other.studentId); // Sort by student ID in ascending order
        }
    }
}

public class Java_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int studentId = in.nextInt();
            String firstName = in.next();
            double gpa = in.nextDouble();

            Student student = new Student(studentId, firstName, gpa);
            studentList.add(student);

            testCases--;
        }

        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student.getFirstName());
        }
    }
}

