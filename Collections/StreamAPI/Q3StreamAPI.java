package Collections.StreamAPI;

import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + mark);
    }
}

public class Q3StreamAPI {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", 75));
        list.add(new Student(2, "Priya", 48));
        list.add(new Student(3, "Kiran", 66));
        list.add(new Student(4, "Anil", 39));
        list.add(new Student(5, "Sneha", 82));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .peek(Student::display)
                .count();

        System.out.println("Students Passed: " + count);
    }
}