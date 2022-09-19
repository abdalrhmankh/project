import java.util.ArrayList;

public class Doctor {
    private int id;
    private String name;
    private String email;
    private int age;
    private String type;

    public static ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Session> sessions = new ArrayList<>();

    public Doctor(int id, String name, String email, int age, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.type = type;
    }

    // creat gettar and settar
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
