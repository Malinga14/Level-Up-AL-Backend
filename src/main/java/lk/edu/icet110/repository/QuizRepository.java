package lk.edu.icet110.repository;

import lk.edu.icet110.entity.AdminEntity;
import lk.edu.icet110.entity.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<QuizEntity,  Integer> {
}
