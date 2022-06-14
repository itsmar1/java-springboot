package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Tony",
                        "tony.ferg@gmail.com",
                        LocalDate.of(1984, Month.JANUARY, 24),
                        38
                )
        );
    }
}
