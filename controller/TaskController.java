package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable String id) {
        return taskService.getAllTasks().stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    @GetMapping("/search")
    public List<Task> findTasksByName(@RequestParam String name) {
        return taskService.getAllTasks().stream()
                .filter(t -> t.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    @PutMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
        return "Task deleted successfully!";
    }

    @PutMapping("/{id}/execute")
    public Task executeTask(@PathVariable String id) {
        return taskService.executeTask(id);
    }
}
