package in.strikes.crudSpringBootDemo.respository;

import in.strikes.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {


    public Student saveStudent(Student studReq) {
        //save to database
        System.out.println("Inside Student Respository");
        Student stu = new Student();
        stu.setName("Manohar");
        stu.setAge(20);
        stu.setEmail("vnmanohar.raju13@gmail.com");
        stu.setId((long)1);
        stu.setRollNo(37);
        stu.setSubject("Spring boot");
        return stu;
    }
}
