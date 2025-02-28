package com.example.taskmanager.model;

import lombok.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskExecution {
    private Date startTime;
    private Date endTime;
    private String output;
}
