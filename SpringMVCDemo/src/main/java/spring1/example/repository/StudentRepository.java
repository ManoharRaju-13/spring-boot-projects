package spring1.example.repository;

import org.springframework.stereotype.Repository;
import spring1.example.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class StudentRepository {
    Map<Long, Student> studentDB;

    StudentRepository() {
        this.studentDB = new HashMap<>();
    }

    public Student save(Student studentReq) {
        studentDB.put(studentReq.getId(), studentReq);
        return studentReq;
    }

    public Student findById(Long id) {
        return studentDB.get(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(studentDB.values());
    }

}
