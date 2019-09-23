using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace todo.Models
{
    public class User
    {
        public long UserId { get; set; }
        [Required(ErrorMessage = "Username is required!")]
        
        public string Username { get; set; }
        public List<Todo> Todos { get; set; }
    }
    
}