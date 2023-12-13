package com.example.todo.repository;

import com.example.todo.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void shouldSaveAndRetrieveTask() {
        // Przygotowanie danych testowych
        Task task = new Task("Example Task", false);

        // Zapis zadania do repozytorium
        taskRepository.save(task);

        // Pobranie zadania z repozytorium
        Task retrievedTask = taskRepository.findById(task.getId()).orElse(null);

        // Sprawdzenie, czy zadanie zostało poprawnie zapisane i odczytane
        assertThat(retrievedTask).isNotNull();
        assertThat(retrievedTask.getTitle()).isEqualTo("Example Task");
        assertThat(retrievedTask.isCompleted()).isFalse();
    }
}
