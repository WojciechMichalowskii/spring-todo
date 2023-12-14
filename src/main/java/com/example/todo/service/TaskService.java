package com.example.todo.service;

import com.example.todo.dto.TaskDto;
import com.example.todo.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long taskId);
    Task createTask(TaskDto task);
    Task updateTask(Long taskId, TaskDto updatedTask);
    void deleteTask(Long taskId);
}
