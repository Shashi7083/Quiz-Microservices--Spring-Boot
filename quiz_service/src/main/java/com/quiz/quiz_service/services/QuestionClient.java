package com.quiz.quiz_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.quiz_service.entities.Question;

import java.util.*;

// @FeignClient(url = "http://localhost:8082", value = "Question-Client")  //value is a unique name  
@FeignClient(name="QUESTION-SERVICE")  //use name instead of url ( name is service id  i.e application in Service Registry)  
public interface QuestionClient {
    
    @GetMapping("/question/quiz/{quizId}") // this will get all the questions of given quiz id from question services
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
}
