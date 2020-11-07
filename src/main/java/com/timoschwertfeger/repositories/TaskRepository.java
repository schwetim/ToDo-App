package com.timoschwertfeger.repositories;

import org.springframework.data.repository.CrudRepository;
import com.timoschwertfeger.model.Task;


public interface TaskRepository extends CrudRepository<Task, Long>{

}


