package com.example.coursework2.service.impl;

import com.example.coursework2.model.Question;
import com.example.coursework2.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private List<QuestionService> questionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;


    private static final Random RANDOM = new Random();

    public static final List<Question> QUESTIONS = List.of(
            new Question("Ivano", "Ivanov"),
            new Question("Roman", "Ivanov"),
            new Question("Max", "Ivanov"));

    //    @Test
//    void returnRandomAmountOfQuestions() {
//        when(questionService.get(RANDOM.nextInt(questionService.size()).thenReturn(QUESTIONS.get(RANDOM.nextInt(QUESTIONS.size())));
//        int amount = 3;
//        assertEquals(amount, examinerService.getQuestions(amount).size());
//    }
    @Test
    void throwWrongQuestionsAmountException() {
        int amount = 5;
        assertThrows(RuntimeException.class, () -> examinerService.getQuestions(amount));
    }
}
