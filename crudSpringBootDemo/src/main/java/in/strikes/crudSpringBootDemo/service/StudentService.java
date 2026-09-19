package in.strikes.crudSpringBootDemo.service;


import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.respository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studReq) {
        //business logic
        //ask repository layer to store in db
        System.out.println("Inside Student Service");
        studentRepository.saveStudent(studReq);
        return studReq;
    }
}
