package lk.edu.icet110.controller;

import lk.edu.icet110.dto.Quiz;
import lk.edu.icet110.dto.Student;
import lk.edu.icet110.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
@CrossOrigin
public class QuizController {

    @Autowired
    final QuizService service;

    @GetMapping("/get-quiz")
    public List<Quiz> getQuiz(){
        return service.getAllQuiz();
    }

    @GetMapping("/search-quiz-by-id/{id}")
    public Quiz getQuizById(@PathVariable Integer id){
        return service.searchQuizID(id);
    }

}
