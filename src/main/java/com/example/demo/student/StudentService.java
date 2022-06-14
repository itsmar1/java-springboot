package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
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
