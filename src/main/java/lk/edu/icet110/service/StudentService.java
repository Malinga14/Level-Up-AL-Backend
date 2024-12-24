package lk.edu.icet110.service;

import lk.edu.icet110.dto.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    void addCustomer(Student student);

    void deleteStudentByID(Integer id);

    Student searchStudentByID(Integer id);

    void updateStudent(Student student);

    Student findStudentByUsername(String username);

    public Student searchByEmail(String email);

}
