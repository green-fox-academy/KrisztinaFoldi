using System.Linq;
using Microsoft.EntityFrameworkCore;

namespace todo.Services.User
{
    public class UserService : IUserService
    {
        private readonly ApplicationContext _context;

        public UserService(ApplicationContext context)
        {
            _context = context;
        }


        public void addUser(string name)
        {
            var user = findUserByName(name);
            if (user == null)
            {
                var newUser = new Models.User {Username = name};
                _context.users.Add(newUser);
                _context.SaveChanges();
            }
        }

        public Models.User findUserByName(string name)
        {
            var user = _context.users.Include(x => x.Todos).FirstOrDefault(x => x.Username == name);
            if (user == null)
            {
                return null;
            }

            return user;
        }

        public Models.User findUserById(long id)
        {
            var user = _context.users.FirstOrDefault(x => x.UserId == id);
            return user;
        }
    }
}