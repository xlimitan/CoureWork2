package com.example.coursework2.service.impl;

import com.example.coursework2.model.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionService;


    @InjectMocks
    private ExaminerServiceImpl examinerService;


    private static final Random RANDOM = new Random();

    public static final List<Question> QUESTIONS = List.of(
            new Question("Ivano", "Ivanov"),
            new Question("Roman", "Ivanov"),
            new Question("Max", "Ivanov"));

    @Test
    void returnRandomAmountOfQuestions() {
        when(javaQuestionService.getRandomQuestion())
                .thenReturn(new Question("Ivano", "Ivanov"))
                .thenReturn(new Question("Roman", "Ivanov"))
                .thenReturn(new Question("Max", "Ivanov"));
        int amount = 3;
        assertEquals(amount, examinerService.getQuestions(amount).size());
    }
}
