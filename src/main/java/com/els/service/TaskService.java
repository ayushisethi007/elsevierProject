package com.els.service;

import com.els.domain.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TaskService {

    private Map<String, Task> storageTasks;

    public void Task(Map<String,Task> storageTasks) {
        this.storageTasks = storageTasks;
    }

    public Map<String,Task> getAll() {
        return storageTasks;
    }

    public void createTask(Task task) {
        if (!storageTasks.containsKey(task)) {
            storageTasks.put(new String(), new Task());
        }
    }
}

