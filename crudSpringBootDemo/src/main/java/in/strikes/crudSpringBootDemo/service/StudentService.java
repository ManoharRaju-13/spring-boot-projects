package in.strikes.crudSpringBootDemo.service;


import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.respository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studReq) {
        studReq.setDeleted(false);
        studentRepository.save(studReq);
        return studReq;
    }
    public Student getStudent(Long id) {
        Optional<Student> studentResponse =  studentRepository.findByIdAndDeletedIsFalse(id);
        if(studentResponse.isPresent()) {
            return studentResponse.get();
        }
        return null;
    }
    public List<Student> getAllStudents() {
        List<Student> studentList = studentRepository.findByDeletedIsFalse();
        return studentList;
    }

    public Student updateStudent(Long id, Student reqStudent) {
        Optional<Student> existingStudent =  studentRepository.findByIdAndDeletedIsFalse(
                id);
        if(existingStudent.isEmpty()) {
            return null;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setName(reqStudent.getName());
        studentToSave.setRollNo(reqStudent.getRollNo());
        studentToSave.setSubject(reqStudent.getSubject());
        studentToSave.setEmail(reqStudent.getEmail());
        studentToSave.setAge(reqStudent.getAge());
        studentToSave.setDeleted(false);
        studentRepository.save(studentToSave);
        return studentToSave;
    }

    public Boolean deleteStudent(Long id) {
         Boolean isStudent = studentRepository.existsById(id);
         if(!isStudent) return false;
         studentRepository.deleteById(id);
         return true;
    }

    public boolean deleteStudentSoftly(Long id) {
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        if(existingStudent.isEmpty()) {
            return false;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setDeleted(true);
        studentRepository.save(studentToSave);
        return true;
    }
}
