package com.himanshu.quizapp.dao;

import com.himanshu.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {




}
