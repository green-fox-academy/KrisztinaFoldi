using System.Collections.Generic;
using todo.Models;

namespace todo.Services
{
    public interface ITodoService
    {
        void addTodo(string todoName, string userName);
        List<Todo> findAllTodo(string userName);
        void deleteTodo(long id);
        Todo findTodoById(long id);
        void editTodo(long id, string name, string isDone);
        void finishTodo(long id);
    }
}