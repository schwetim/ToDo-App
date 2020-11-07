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
		
		Field field = new Field();
		field.setTitle("Aufgaben");
		
		fieldRepository.save(field);
		System.out.println("Field Count: " + fieldRepository.count());
		
		Task task = new Task();
		task.setTitle("Sauber machen");
		
		task.setField(field);
		field.getTasks().add(task);
		
		taskRepository.save(task);
		fieldRepository.save(field);
		
		
	}

}
