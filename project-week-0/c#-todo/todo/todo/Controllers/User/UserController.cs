using Microsoft.AspNetCore.Mvc;
using todo.Services.User;

namespace todo.Controllers.User
{
    public class UserController : Controller
    {
        public readonly IUserService UserService;

        public UserController(IUserService userService)
        {
            UserService = userService;
        }
        
        [HttpGet("/")]
        public IActionResult User()
        {
            return View();
        }

        [HttpPost("/login")]
        public IActionResult AddUser(string username)
        {
            UserService.addUser(username);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }
    }
}