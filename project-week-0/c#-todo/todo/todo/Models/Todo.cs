using System.ComponentModel.DataAnnotations;
using Microsoft.EntityFrameworkCore.Metadata.Internal;

namespace todo.Models
{
    public class Todo
    {
        public long TodoId { get; set; }
        [MinLength(3)]
        [Required(ErrorMessage = "Name is required!")]
        public string TodoName { get; set; }
        public bool isDone { get; set; }
        public long UserId { get; set; }

    }

    

}