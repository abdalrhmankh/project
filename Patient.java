import java.util.ArrayList;

public class Patient {
    private int id;
    private String name;
    private String email;
    private int age;
    public void print_sessions(){
        for (Session session : sessions) {
            System.out.println(session.getId()
                     +""+      session.getDate()
                     +""+      session.getNumber_of_reviews()
                     +""+      session.getPrice()
                     +""+      session.getPatient_id()     
                     +""+      session.getDoctor_id()  );
        }
   
    } ;
    private static ArrayList <Patient> patients= new  ArrayList();
    private  ArrayList<Session> sessions = new ArrayList<>();
    public Patient(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
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
    public static ArrayList<Patient> getPatients() {
        return patients;
    }
    public static void setPatients(ArrayList<Patient> patients) {
        Patient.patients = patients;
    }
    public ArrayList<Session> getSessions() {
        return sessions;
    }
    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }
   
}
