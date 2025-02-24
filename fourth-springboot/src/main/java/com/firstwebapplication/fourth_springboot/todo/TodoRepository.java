package com.firstwebapplication.fourth_springboot.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<ToDo, Integer> {
	public List<ToDo> findByUsername(String username);
}
