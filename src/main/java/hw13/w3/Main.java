package hw13.w3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void removeStudentsWithLowAverage(List<Student> students) {
        List<Student> studentsToRemove = new ArrayList<>();

        for (Student student : students) {
            double average = calculateAverage(student.getGrades());

            if (average < 3) {
                studentsToRemove.add(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }

        students.removeAll(studentsToRemove);
    }

    public static double calculateAverage(List<Integer> grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Integer> grades1 = new ArrayList<>();
        grades1.add(4);
        grades1.add(3);
        grades1.add(5);
        Student student1 = new Student("John", "Group A", 1, grades1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(2);
        grades2.add(3);
        grades2.add(4);
        Student student2 = new Student("Jane", "Group B", 2, grades2);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(5);
        grades3.add(4);
        grades3.add(5);
        Student student3 = new Student("Mike", "Group A", 3, grades3);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        removeStudentsWithLowAverage(students);

        printStudents(students, 2);
    }
}