package com.timoschwertfeger.service;



import com.timoschwertfeger.model.Task;

public interface TaskService extends CrudService<Task, Long> {

Task findByTitle(String title);

}
