package com.question.question_service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question.question_service.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long>{
    
    List<Question> findByQuizId(Long quizId);
}
