package com.example.coursework2.service.impl;

import com.example.coursework2.model.Question;
import com.example.coursework2.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {

    private static final List<Question> QUESTIONS = Arrays.asList(
            new Question("Ivano", "Ivanov"),
            new Question("Roman", "Ivanov"),
            new Question("Max", "Ivanov")
    );
    @Mock
    private QuestionRepository repository;
    @InjectMocks
    private JavaQuestionService out;

    @Test
    void addTest() {
        when(repository.getAll()).thenReturn(QUESTIONS);
        when(repository.add(new Question("Ivano", "Ivanov")))
                .thenReturn(new Question("Ivano", "Ivanov"));
        assertThat(out.add("Ivano", "Ivanov")).isIn(out.getAll());

    }

    @Test
    void removeTest() {
        Question expected = new Question("Ivano", "Ivanov");
        when(repository.remove(new Question("Ivano", "Ivanov"))).thenReturn(expected);
        assertThat(out.remove(new Question("Ivano", "Ivanov")))
                .isEqualTo(expected);
    }
}