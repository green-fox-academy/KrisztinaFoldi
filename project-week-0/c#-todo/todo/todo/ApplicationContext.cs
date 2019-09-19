using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using todo.Models;

namespace todo
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Todo> todos { get; set; }
        public DbSet<User> users { get; set; }

        public ApplicationContext(DbContextOptions options) : base(options)
        {
        }
        
    }
}
