package lk.edu.icet110.service.impl;

import lk.edu.icet110.dto.Quiz;
import lk.edu.icet110.dto.Student;
import lk.edu.icet110.repository.QuizRepository;
import lk.edu.icet110.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizArrayList =new ArrayList<>();
        repository.findAll().forEach(entity->{
            quizArrayList.add(mapper.map(entity, Quiz.class));
        });
        return quizArrayList;
    }

    @Override
    public Quiz searchQuizID(Integer id) {
        return mapper.map(repository.findById(id), Quiz.class);
    }
}
