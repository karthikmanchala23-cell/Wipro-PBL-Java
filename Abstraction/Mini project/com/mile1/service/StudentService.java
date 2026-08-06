package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student s[]) {

        int c = 0;

        if (s != null) {
            for (Student st : s) {
                if (st != null && st.getMarks() == null) {
                    c++;
                }
            }
        }

        return c;
    }

    public int findNumberOfNullName(Student s[]) {

        int c = 0;

        if (s != null) {
            for (Student st : s) {
                if (st != null && st.getName() == null) {
                    c++;
                }
            }
        }

        return c;
    }

    public int findNumberOfNullObjects(Student s[]) {

        int c = 0;

        if (s != null) {
            for (Student st : s) {
                if (st == null) {
                    c++;
                }
            }
        }

        return c;
    }
}