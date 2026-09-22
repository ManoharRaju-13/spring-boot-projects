package spring1.example.service;

import org.springframework.stereotype.Service;
import spring1.example.entity.Student;
import spring1.example.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        studentRepository.save(studentReq);
        return studentReq;
    }

    public Student getStudent(Long id) {
        Student student = studentRepository.findById(id);
        return student;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
