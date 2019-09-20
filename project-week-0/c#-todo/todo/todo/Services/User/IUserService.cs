namespace todo.Services.User
{
    public interface IUserService
    {
        void addUser(string name);
        Models.User findUserByName(string name);
        Models.User findUserById(long id);
    }
}