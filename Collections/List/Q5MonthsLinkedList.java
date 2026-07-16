package Collections.List;

import java.util.LinkedList;

public class Q5MonthsLinkedList {

    public static void main(String[] args) {

        LinkedList<String> months = new LinkedList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("Months of the Year:");

        for (String month : months) {
            System.out.println(month);
        }
    }
}