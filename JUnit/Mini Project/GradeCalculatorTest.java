package com.mile1.test;

import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.model.Student;
import com.mile1.service.GradeCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GradeCalculatorTest {

    private GradeCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new GradeCalculator();
    }

    @Test
    @DisplayName("TC1 - Calculate the grade for valid objects - Check for A grade computation")
    void tc1_calculateGrade_returnsAGrade() {
        Student student = new Student("Alice", new int[]{95, 92, 98});
        assertEquals("A", calculator.calculateGrade(student));
    }

    @Test
    @DisplayName("TC2 - Calculate the grade for valid objects - Check for D grade computation")
    void tc2_calculateGrade_returnsDGrade() {
        Student student = new Student("Bob", new int[]{60, 65, 68});
        assertEquals("D", calculator.calculateGrade(student));
    }

    @Test
    @DisplayName("TC3 - Calculate the grade for valid objects - Check for F grade computation")
    void tc3_calculateGrade_returnsFGrade() {
        Student student = new Student("Charlie", new int[]{30, 40, 35});
        assertEquals("F", calculator.calculateGrade(student));
    }

    @Test
    @DisplayName("TC4 - If the Object is null, throw NullStudentException()")
    void tc4_nullStudentObject_throwsNullStudentException() {
        assertThrows(NullStudentException.class, () -> calculator.validate(null));
    }

    @Test
    @DisplayName("TC5 - If the Name is null, throw NullNameException()")
    void tc5_nullName_throwsNullNameException() {
        Student student = new Student(null, new int[]{70, 80});
        assertThrows(NullNameException.class, () -> calculator.validate(student));
    }

    @Test
    @DisplayName("TC6 - If the Marks array is null, throw NullMarksArrayException()")
    void tc6_nullMarksArray_throwsNullMarksArrayException() {
        Student student = new Student("Dave", null);
        assertThrows(NullMarksArrayException.class, () -> calculator.validate(student));
    }

    @Test
    @DisplayName("TC7 - Test findNumberOfNullName function")
    void tc7_findNumberOfNullName() {
        Student[] students = {
                new Student("Eve", new int[]{70}),
                new Student(null, new int[]{80}),
                new Student(null, new int[]{90})
        };
        assertEquals(2, calculator.findNumberOfNullName(students));
    }

    @Test
    @DisplayName("TC8 - Test findNumberOfNullObjects function")
    void tc8_findNumberOfNullObjects() {
        Student[] students = {
                new Student("Frank", new int[]{70}),
                null,
                null
        };
        assertEquals(2, calculator.findNumberOfNullObjects(students));
    }

    @Test
    @DisplayName("TC9 - Test findNumberOfNullMarks function")
    void tc9_findNumberOfNullMarks() {
        Student[] students = {
                new Student("Grace", new int[]{70}),
                new Student("Heidi", null),
                new Student("Ivan", null)
        };
        assertEquals(2, calculator.findNumberOfNullMarks(students));
    }
}
