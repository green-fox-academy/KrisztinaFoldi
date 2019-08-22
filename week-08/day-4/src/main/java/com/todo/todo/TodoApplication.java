package com.todo.todo;

import com.todo.todo.Models.Todo;
import com.todo.todo.Repositories.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
  TodoInterface todoInterface;

  @Autowired
  public TodoApplication(TodoInterface todoInterface) {
    this.todoInterface = todoInterface;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception{
    todoInterface.save(new Todo("Pack the luggage"));
    todoInterface.save(new Todo("Plan the programs"));
    todoInterface.save(new Todo("Practice coding"));
    todoInterface.save(new Todo("Chill"));
  }

}
