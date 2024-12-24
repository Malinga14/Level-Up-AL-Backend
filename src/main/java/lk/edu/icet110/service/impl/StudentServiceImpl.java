package lk.edu.icet110.service.impl;

import lk.edu.icet110.dto.Student;
import lk.edu.icet110.entity.StudentEntity;
import lk.edu.icet110.repository.StudentRepository;
import lk.edu.icet110.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository repository;
    private final ModelMapper mapper;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentArrayList =new ArrayList<>();
        repository.findAll().forEach(entity->{
            studentArrayList.add(mapper.map(entity, Student.class));
        });
        return studentArrayList;
    }

    @Override
    public void addCustomer(Student student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }

    @Override
    public void deleteStudentByID(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Student searchStudentByID(Integer id) {
        return mapper.map(repository.findById(id),Student.class);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }

    @Override
    public Student findStudentByUsername(String username) {
        return mapper.map(repository.findByUsername(username), Student.class);
    }

    @Override
    public Student searchByEmail(String email) {
        return mapper.map(repository.searchByEmail(email), Student.class);
    }

}
