using System.Linq;
using caloriesCA.Models;
using Microsoft.AspNetCore.Mvc;

namespace caloriesCA.Properties.Controllers
{
    public class FoodController : Controller
    {
        private readonly ApplicationContext applicationContext;

        public FoodController(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
        }

        [HttpGet("/")]
        public IActionResult Index()
        {
            var foods = applicationContext.Foods.ToList();
            return View(foods);
        }

        [HttpPost("/Food/Add")]
        public IActionResult Add(FoodInput foodInput)
        {
            var food = new Food
            {
                Name = foodInput.Name,
                Amount = foodInput.Amount
            };
            applicationContext.Foods.Add(food);
            applicationContext.SaveChanges();

            return Redirect("/");
        }

        public class FoodInput
        {
            public string Name { get; set; }
            public int Amount { get; set; }
            
        }

        [HttpPost("/Food/Delete")]
        public IActionResult Delete(long id)
        {
            var food = applicationContext.Foods.SingleOrDefault(f => f.FoodId == id);
            if (food == null)
            {
                return BadRequest();
            }

            applicationContext.Foods.Remove(food);
            applicationContext.SaveChanges();
            return Redirect("/");
        }
    }
}