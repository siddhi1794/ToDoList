package com.example.siddhipatil.to_do1;

import java.io.Serializable;

/**
 * Created by siddhipatil on 9/29/17.
 */

public class toDo implements Serializable{

    private String taskTitle;
    private String taskDesc;


    public toDo(String taskTitle, String taskDesc) {
        this.taskTitle = taskTitle;
        this.taskDesc = taskDesc;
    }

    public String getTaskTitle() {
        return taskTitle;
    }


    public String getTaskDesc() {
        return taskDesc;
    }





}
