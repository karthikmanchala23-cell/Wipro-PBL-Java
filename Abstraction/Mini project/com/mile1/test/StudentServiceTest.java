package Abstraction.Mini;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class StudentServiceTest {

    private Student[] students;
    private StudentService service;

    @Before
    public void setUp() {

        service = new StudentService();

        students = new Student[10];

        students[0] = new Student("A1", new int[]{72, 73, 74});
        students[1] = new Student("B1", new int[]{75, 76, 77});
        students[2] = new Student("C1", new int[]{99, 99, 99});
        students[3] = new Student("C3", new int[]{100, 100, 99});
        students[4] = new Student("B2", new int[]{13, 88, 13});
        students[5] = new Student("C3", new int[]{14, 14, 99});
        students[6] = new Student("A2", new int[]{77, 55, 12});
        students[7] = new Student(null, new int[]{13, 88, 13});
        students[8] = new Student("A2", null);
        students[9] = null;
    }

    @Test
    public void testFindNumberOfNullName() {
        assertEquals(1, service.findNumberOfNullName(students));
    }

    @Test
    public void testFindNumberOfNullObjects() {
        assertEquals(1, service.findNumberOfNullObjects(students));
    }

    @Test
    public void testFindNumberOfNullMarksArray() {
        assertEquals(1, service.findNumberOfNullMarksArray(students));
    }
}