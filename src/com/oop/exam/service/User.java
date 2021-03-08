public class User {
    private string username;
    private string email;

    public User(string name,string email){
        this.username = name;
        this.email = email;
    }

    public string getUsername() {
        return username;
    }

    public void setUsername(string username) {
        this.username = username;
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }


}