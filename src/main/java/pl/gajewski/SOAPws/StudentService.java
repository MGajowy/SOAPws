package pl.gajewski.SOAPws;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> listStudent;

    public Student getStudentById(long id) {
        return listStudent.stream()
                .filter(student ->  student.getId() == id)
                .findFirst().get();
    }

    public StudentService() {
        listStudent = new ArrayList<Student>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Adam");
        student1.setSurname("Nowak");
        student1.setAge(12);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Jan");
        student2.setSurname("Dziwny");
        student2.setAge(33);

        listStudent.add(student1);
        listStudent.add(student2);

    }
}
