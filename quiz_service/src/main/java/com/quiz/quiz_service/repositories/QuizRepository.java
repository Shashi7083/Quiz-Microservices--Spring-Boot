package com.quiz.quiz_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.quiz_service.entities.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{
    
}
