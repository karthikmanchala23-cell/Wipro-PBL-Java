package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student[] data = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[]{85, 75, 95});
        data[1] = new Student(null, new int[]{11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        new StudentMain();

        StudentReport report = new StudentReport();

        for (Student student : data) {

            try {
                String result = report.validate(student);

                if (result.equals("VALID")) {
                    String grade = report.findGrades(student);
                    student.setGrade(grade);

                    System.out.println(
                            student.getName() + " : " + student.getGrade()
                    );
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        StudentService service = new StudentService();

        System.out.println(
                "Number of null marks arrays: "
                        + service.findNumberOfNullMarksArray(data)
        );

        System.out.println(
                "Number of null names: "
                        + service.findNumberOfNullName(data)
        );

        System.out.println(
                "Number of null objects: "
                        + service.findNumberOfNullObjects(data)
        );
    }
}