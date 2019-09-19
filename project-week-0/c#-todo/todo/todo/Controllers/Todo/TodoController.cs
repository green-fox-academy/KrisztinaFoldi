using Microsoft.AspNetCore.Mvc;
using todo.Services;
using todo.Services.User;

namespace todo.Controllers
{
   
    public class TodoController : Controller
    {
        private readonly ITodoService iTodoService;
        protected readonly IUserService UserService;

        public TodoController(ITodoService iTodoService, IUserService userService)
        {
            this.UserService = userService;
            this.iTodoService = iTodoService;
        }
        
        
        [HttpGet("/home")]
        public IActionResult Todo(string username)
        {
            var user = UserService.findUserByName(username);
            return View(user);
        }

        
        [HttpPost("/add")]
        public IActionResult Add(string name, string username)
        {
            iTodoService.addTodo(name, username);
            return RedirectToAction(nameof(TodoController.Todo),"Todo", new {username});
        }

        
        [HttpPost("/delete")]
        public IActionResult Delete(long id, string username)
        {
            iTodoService.deleteTodo(id);
            return RedirectToAction(nameof(TodoController.Todo),"Todo", new {username});
        }

        [HttpPost("/edit")]
        public IActionResult Edit(long id, string username, string TodoName, bool isDone)
        {
            iTodoService.editTodo(id, TodoName, isDone, username);
            return RedirectToAction(nameof(TodoController.Todo),"Todo", new {username});
        }

        [HttpPost("/edittodo")]
        public IActionResult EditTodo(long id, string username)
        {
            var todo = iTodoService.findTodoById(id);
            var userId = UserService.findUserByName(username);
            return View(todo);
        }
        
    }
}