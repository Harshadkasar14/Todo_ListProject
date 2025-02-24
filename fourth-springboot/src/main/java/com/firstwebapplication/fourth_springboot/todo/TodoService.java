package com.firstwebapplication.fourth_springboot.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static List<ToDo> todos = new ArrayList<>();
	private static int todoCount = 0;
	static {
		// no need to create new instance of LocalDate because LocalDate is immutable.
		todos.add(new ToDo(++todoCount,"harshad" , "Learn Azure 1" , LocalDate.now().plusYears(1) , false));
		todos.add(new ToDo(++todoCount,"harshad" , "Learn Python 1" , LocalDate.now().plusYears(2) , false));
		todos.add(new ToDo(++todoCount,"harshad" , "Learn AWS 1" , LocalDate.now().plusYears(3) , false));
		
	}
	
	public List<ToDo> findByUsername(String username){
		Predicate<? super ToDo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
		
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String username , String description , LocalDate targetDate, boolean done)
	{
		ToDo toDo = new ToDo(++todoCount , username , description  , targetDate , done);
		todos.add(toDo);
	}
	
	public void deleteById(int id)
	{
		
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id; 
		todos.removeIf(predicate );
	}
	
	public void updateById(int id)
	{
	
	}

	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id; 
		
		ToDo toDo = todos.stream().filter(predicate).findFirst().get();
		
		return toDo;
	}

	public void updateTodo(@Valid ToDo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
}
