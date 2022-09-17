import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Doctor {
    private int Id;
    private String Name;
    private String Email;
    private int Age;
    private String Type;

    private static ArrayList <Doctor> doctors = new ArrayList<>(); 
    public Doctor(int id, String name, String email, int age, String type) {
        this.Id = id; 
        this.Name = name;
        this.Email = email;
        this.Age = age;
        this.Type = type;
    }
    // creat gettar and settar
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
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    public static void setDoctors(ArrayList<Doctor> doctors) {
        Doctor.doctors = doctors;
    }
}
