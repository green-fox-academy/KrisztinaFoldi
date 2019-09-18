using caloriesCA.Models;
using Microsoft.EntityFrameworkCore;

namespace caloriesCA
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Food> Foods { get; set; }
        public ApplicationContext(DbContextOptions options) : base(options)
        {
        }
    }
}