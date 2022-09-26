/**
 * Patient
 * There are private parameters [
 *      id, name, email, age
 *], 
 *   and created method Getter and Setter to all parameters
 * 
 */



public class Patient {
    private int Id;
    private String Name;
    private String Email;
    private int Age;
    public Patient(int id, String name, String email, int age) {
        this.Id = id;
        this.Name = name;
        this.Email = email;
        this.Age = age;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
}
