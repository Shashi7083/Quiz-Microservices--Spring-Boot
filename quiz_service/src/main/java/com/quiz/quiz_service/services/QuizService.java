package com.quiz.quiz_service.services;

import com.quiz.quiz_service.entities.Quiz;
import java.util.*;

public interface QuizService {
    
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
