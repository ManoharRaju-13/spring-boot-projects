package spring1.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring1.example.entity.Student;
import spring1.example.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student studentReq) {
        Student studResponse = studentService.createStudent(studentReq);
        return ResponseEntity.ok(studResponse);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
        Student studentRes = studentService.getStudent(id);
        if(studentRes == null) {
            return ResponseEntity.
                    status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
        return ResponseEntity.ok(studentRes);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentsList = studentService.getAllStudents();
        if(studentsList == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(studentsList);
    }

}
