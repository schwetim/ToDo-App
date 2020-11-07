package com.timoschwertfeger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timoschwertfeger.repositories.TaskRepository;

@Controller

public class TaskController {
	
		private final TaskRepository taskRepository;

		public TaskController(TaskRepository taskRepository) {
			super();
			this.taskRepository = taskRepository;
		}
		
		@RequestMapping("/tasks")
		public String getTasks(Model model) {
			 model.addAttribute("tasks", taskRepository.findAll());

		        return "tasks/list";
		}


}
