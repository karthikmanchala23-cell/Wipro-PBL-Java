package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

class Q5Student {

    private int id;
    private String name;
    private int marks;

    Q5Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Q5Consumer {

    public static void main(String[] args) {

        ArrayList<Q5Student> list = new ArrayList<>();

        list.add(new Q5Student(101, "Rahul", 85));
        list.add(new Q5Student(102, "Priya", 78));
        list.add(new Q5Student(103, "Kiran", 91));
        list.add(new Q5Student(104, "Anil", 67));
        list.add(new Q5Student(105, "Sneha", 88));

        Consumer<Q5Student> display = s -> {
            System.out.println(
                    s.getId() + "  " +
                    s.getName() + "  " +
                    s.getMarks());
        };

        System.out.println("Student Details:");

        for (Q5Student s : list) {
            display.accept(s);
        }
    }
}