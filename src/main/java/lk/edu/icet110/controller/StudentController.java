package lk.edu.icet110.controller;

import lk.edu.icet110.dto.Student;
import lk.edu.icet110.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {

    @Autowired
    private final StudentService service;

    @GetMapping("/get-student")
    public List<Student> getStudent(){
        return service.getAllStudent();
    }

    @PostMapping("/add-student")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        service.addCustomer(student);
    }

    @GetMapping("/search-student-by-id/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return service.searchStudentByID(id);
    }

    @DeleteMapping("/delete-student-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentByID(id);
    }

    @PutMapping("/update-student")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateStudent(@RequestBody Student student){
        service.updateStudent(student);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<Student> getStudentByUsername(@PathVariable String username) {
        return ResponseEntity.ok(service.findStudentByUsername(username));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Student> getStudentByEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.searchByEmail(email));
    }

}
