package Abstraction.Mini;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class StudentValidateTest {

    @Test
    public void testValidStudent() throws Exception {
        Student s = new Student("Sekar", new int[]{85,75,95});
        StudentReport report = new StudentReport();
        assertEquals("VALID", report.validate(s));
    }

    @Test(expected = NullStudentObjectException.class)
    public void testNullStudent() throws Exception {
        StudentReport report = new StudentReport();
        report.validate(null);
    }

    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {
        Student s = new Student(null, new int[]{11,22,33});
        StudentReport report = new StudentReport();
        report.validate(s);
    }

    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks() throws Exception {
        Student s = new Student("Manoj", null);
        StudentReport report = new StudentReport();
        report.validate(s);
    }
}