package com.quiz.quiz_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.quiz_service.entities.Question;

import java.util.*;

@FeignClient(url = "http://localhost:8081", value = "Question-Client")  //value is a unique name
public interface QuestionClient {
    
    @GetMapping("/question/quiz/{quizId}") // this will get all the questions of given quiz id from question services
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
}
