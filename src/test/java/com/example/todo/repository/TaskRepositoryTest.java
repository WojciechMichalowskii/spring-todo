package com.example.todo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.todo.TestConfig;
import com.example.todo.model.Task;
import com.example.todo.TodoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest(classes = {TodoApplication.class, TestConfig.class})
class TaskRepositoryTest {

    @Autowired
    public TaskRepository taskRepository;

    @Test
    void saveTask() {
        Task task = new Task("Test Task", false);
        taskRepository.save(task);

        Task savedTask = taskRepository.findById(task.getId()).orElse(null);
        assertNotNull(savedTask);
        assertEquals("Test Task", savedTask.getTitle());
        assertEquals(false, savedTask.isCompleted());
    }
}
