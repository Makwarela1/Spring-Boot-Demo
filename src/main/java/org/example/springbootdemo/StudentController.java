package org.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/api/v1/students")
    public List<Student> getAllStudents(){
        return List.of (
                new Student(
                        001,
                        "Hishaam",
                        "Kraft",
                        "hishaamk@hotmail.com",
                        "Java"
                ),
                new Student(
                        002,
                        "Thato",
                        "Moumake",
                        "moumaket@yhahoo.com",
                        "Cybersecurity"
                ),

                new Student (
                        003,
                        "Lona",
                        "Hans",
                        "hansl@hotmail.com",
                        "Java"
                )
        );

    }

//    @GetMapping("/api/v1/students/{id}")
//    public String getStudentId(){
//        for (Student students : getAllStudents()){
//            if (students.id() == students.id()){
//                return students.id();
//            }
//
//        }
//    }
}
