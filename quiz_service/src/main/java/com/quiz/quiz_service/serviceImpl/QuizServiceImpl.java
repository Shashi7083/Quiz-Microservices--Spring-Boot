package com.quiz.quiz_service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quiz_service.entities.Quiz;
import com.quiz.quiz_service.repositories.QuizRepository;
import com.quiz.quiz_service.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz add(Quiz quiz) {
       return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return  quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id)
            .orElseThrow(()->new RuntimeException("Quiz not found"));
    }
    
}
