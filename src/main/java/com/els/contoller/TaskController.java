package com.els.contoller;

import com.els.domain.Task;
import com.els.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @PostMapping("/createTask")
    public ResponseEntity createTask(@RequestBody Task task) {
//        if (!isTaskValid(task)) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
        taskService.createTask(task);
        return ResponseEntity.ok().build();
    }

//    private boolean isTaskValid(Task) {
//        String smartMeterId = task.getSmartMeterId();
//        List<ElectricityReading> electricityReadings = meterReadings.getElectricityReadings();
//        return smartMeterId != null && !smartMeterId.isEmpty()
//                && electricityReadings != null && !electricityReadings.isEmpty();
//    }

    @GetMapping("/all")
    public ResponseEntity getAllTasks() {
        Map<String,Task> totalListing = taskService.getAll();
       return ResponseEntity.ok(totalListing);
    }
}
