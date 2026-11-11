package org.example.springbootdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/api/v1/students/{id}") // id - path variable - placeholder for a value in the URL - GET /api/v1/students/5 -> id = 5
//    public int getStudentId(){
//        for (Student students : getAllStudents()){
//            if (students.id() == 2) {
//                return students.id();
//            }
//        }
//        return 0;
//    }

    public ResponseEntity<Student> getStudentById (@PathVariable int id){
        for (Student student : getAllStudents()){
            if (student.id() == id){
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
