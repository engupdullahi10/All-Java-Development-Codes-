package com.codewithabdullahi.studentsapp;

import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/")
    public String home() {

        return """
                <h1>Student Management System</h1>
                <p>Spring Boot project is running successfully.</p>
                <p>Open: <b>/students</b></p>
                """;
    }

    @GetMapping("/students")
    public String getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(
                "L1S25BSSE0026",
                "Abdullahi",
                25,
                "Software Engineering",
                "abdullahi@example.com"
        ));

        students.add(new Student(
                "L1S25BSSC0025",
                "Ali Ahmed",
                21,
                "Computer Science",
                "ali@example.com"
        ));

        students.add(new Student(
                "L1S25BSIT0027",
                "Hafsa",
                23,
                "Information Technology",
                "hafsa@example.com"
        ));

        StringBuilder output = getStringBuilder(students);

        return output.toString();
    }

    private static @NonNull StringBuilder getStringBuilder(List<Student> students) {
        StringBuilder output = new StringBuilder();

        output.append("<h1>Students Details</h1>");

        for (Student student : students) {

            output.append("""
                    
                    <hr>
                    
                    <h3>Student Information</h3>
                    
                    <p><b>ID:</b> %s</p>
                    <p><b>Name:</b> %s</p>
                    <p><b>Age:</b> %d</p>
                    <p><b>Course:</b> %s</p>
                    <p><b>Email:</b> %s</p>
                    
                    """.formatted(
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getCourse(),
                    student.getEmail()
            ));
        }
        return output;
    }
}