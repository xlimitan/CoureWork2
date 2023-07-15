package com.example.coursework2.test;

import com.example.coursework2.service.ExaminerService;
import com.example.coursework2.service.QuestionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ExaminerServiceTest {

    @Mock
    QuestionService questionService;

    @InjectMocks
    ExaminerService examinerService;
}
