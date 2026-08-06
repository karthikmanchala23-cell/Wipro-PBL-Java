package Abstraction.Mini;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class StudentGradeTest {

    @Test
    public void testAPlusGrade() {

        Student s = new Student("A1", new int[]{85,75,95});

        StudentReport report = new StudentReport();

        assertEquals("A+", report.findGrades(s));
    }

    @Test
    public void testFGrade() {

        Student s = new Student("B1", new int[]{11,22,33});

        StudentReport report = new StudentReport();

        assertEquals("F", report.findGrades(s));
    }
}