using System.Collections.Generic;

namespace todo.Models
{
    public class User
    {
        public long UserId { get; set; }
        public string Username { get; set; }
        public List<Todo> Todos { get; set; }
    }
    
}