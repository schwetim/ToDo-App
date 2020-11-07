package com.timoschwertfeger.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.timoschwertfeger.model.Field;
import com.timoschwertfeger.model.Task;
import com.timoschwertfeger.repositories.CategoryRepository;
import com.timoschwertfeger.repositories.FieldRepository;
import com.timoschwertfeger.repositories.TaskRepository;

@Component
public class BootstrapData implements CommandLineRunner{
	
	
	private final FieldRepository fieldRepository;
	private final TaskRepository taskRepository;
	private final CategoryRepository categoryRepository;
	
	

	public BootstrapData(FieldRepository fieldRepository, TaskRepository taskRepository,
			CategoryRepository categoryRepository) {

		this.fieldRepository = fieldRepository;
		this.taskRepository = taskRepository;
		this.categoryRepository = categoryRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		// Field
		Field field = new Field();
		field.setTitle("Aufgaben");
		
		fieldRepository.save(field);
		
		// Task 1
		Task task1 = new Task();
		task1.setTitle("Tanzen");
		task1.setField(field);
		field.getTasks().add(task1);
		
		taskRepository.save(task1);
		fieldRepository.save(field);

		
		// Task 2
		Task task2 = new Task();
		task2.setTitle("Sauber machen");
		task2.setField(field);
		field.getTasks().add(task2);
		
		taskRepository.save(task2);
		fieldRepository.save(field);
		
		// Task 3
		Task task3 = new Task();
		task3.setTitle("Programmieren");
		task3.setField(field);
		field.getTasks().add(task3);
		
		taskRepository.save(task3);
		fieldRepository.save(field);
		
		// Task 4
		Task task4 = new Task();
		task4.setTitle("Hausaufgaben machen");
		task4.setField(field);
		field.getTasks().add(task4);
		
		taskRepository.save(task4);
		fieldRepository.save(field);

		
		System.out.println("Task Count: " + taskRepository.count());
	
		
	}

}
