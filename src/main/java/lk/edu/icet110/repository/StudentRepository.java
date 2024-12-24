package lk.edu.icet110.repository;

import lk.edu.icet110.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    StudentEntity findByUsername(String username);
    StudentEntity searchByEmail(String email);
}
