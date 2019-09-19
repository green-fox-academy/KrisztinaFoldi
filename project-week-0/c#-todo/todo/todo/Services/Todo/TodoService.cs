using System.Collections.Generic;
using System.Linq;
using todo.Models;
using todo.Services.User;

namespace todo.Services
{
    public class TodoService : ITodoService
    {
        private readonly IUserService UserService;
        readonly ApplicationContext _applicationContext;

        public TodoService(ApplicationContext applicationContext, IUserService userService)
        {
            this._applicationContext = applicationContext;
            this.UserService = userService;
        }
        
        public void addTodo(string todoName,string userName)
        {
            var user = UserService.findUserByName(userName);
            var newTodo = new Todo{ TodoName = todoName, UserId = user.UserId};
            _applicationContext.todos.Add(newTodo);
            _applicationContext.SaveChanges();

        }

        public List<Todo> findAllTodo(string userName)
        {
            var user = UserService.findUserByName(userName);
            if (user != null)
            {
                var todosOfUser = user.Todos;
                _applicationContext.SaveChanges();
                return todosOfUser;
            }
            return null;
        }

        public void deleteTodo(long id)
        {
            var todoToDelete = _applicationContext.todos.SingleOrDefault(x => x.TodoId == id);
            _applicationContext.todos.Remove(todoToDelete);
            _applicationContext.SaveChanges();
        }

        public Todo findTodoById(long id)
        {
            var foundTodo = _applicationContext.todos.SingleOrDefault(x => x.TodoId == id);
            return foundTodo;
        }

        public void editTodo(long id, string name, bool isDone, string username)
        {
            var todoToEdit = findTodoById(id);
            _applicationContext.SaveChanges();

        }
    }
}