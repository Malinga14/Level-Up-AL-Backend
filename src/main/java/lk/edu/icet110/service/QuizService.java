package lk.edu.icet110.service;

import lk.edu.icet110.dto.Quiz;

import java.util.List;

public interface QuizService {

    List<Quiz> getAllQuiz();

    Quiz searchQuizID(Integer id);

}
