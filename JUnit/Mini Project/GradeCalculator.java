package com.mile1.service;

import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.model.Student;

public class GradeCalculator {

    public void validate(Student student) {
        if (student == null) {
            throw new NullStudentException();
        }
        if (student.getName() == null) {
            throw new NullNameException();
        }
        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }
    }

    public String calculateGrade(Student student) {
        validate(student);

        int[] marks = student.getMarks();
        if (marks.length == 0) {
            return "F";
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        if (students == null) {
            return count;
        }
        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullName(Student[] students) {
        int count = 0;
        if (students == null) {
            return count;
        }
        for (Student student : students) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {
        int count = 0;
        if (students == null) {
            return count;
        }
        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }
        return count;
    }
}
