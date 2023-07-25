package com.example.coursework2.service.impl;

import com.example.coursework2.exception.NotAllowedException;
import com.example.coursework2.model.Question;
import com.example.coursework2.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {
    private static final List<Question> QUESTIONS = Arrays.asList(
            new Question("Ivano", "Ivanov"),
            new Question("Roman", "Ivanov"),
            new Question("Max", "Ivanov")
    );
    @Mock
    private QuestionRepository repository;
    @InjectMocks
    private MathQuestionService out;

    @Test
    void addTest() {
        assertThatExceptionOfType(NotAllowedException.class)
                .isThrownBy(() -> out.add(new Question("Ivano", "Ivanov")));
    }


    @Test
    void remove() {
        assertThatExceptionOfType(NotAllowedException.class)
                .isThrownBy(() -> out.remove(new Question("Ivano", "Ivanov")));
    }


    @Test
    void getAllTest() {
        assertThatExceptionOfType(NotAllowedException.class)
                .isThrownBy(() -> out.getAll());
//        Не понял, как сделать тест
    }

}