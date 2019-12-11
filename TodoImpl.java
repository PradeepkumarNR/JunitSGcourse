package com.junit.mockitoexample;

import java.util.ArrayList;
import java.util.List;

public class TodoImpl {
	
	//dependency
	
	private TodoService todoservice;
	
	//SUT

	public TodoImpl(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	
	public List<String> retrieveToDosretaledToSrping(String user) {
		
		List <String>filteredTodos= new ArrayList<String>();
		List<String> todos= todoservice.retrieveTodos(user);
		for (String todo: todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
			
			
		}
		
		return filteredTodos ;
	}
		
		
			
		
	

}
