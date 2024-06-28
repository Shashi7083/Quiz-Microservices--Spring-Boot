package com.question.question_service.services;

import java.util.List;

import com.question.question_service.entities.Question;

public interface QuestionService {
    

    Question create(Question question);

    List<Question> get();

    Question get(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
