import java.util.ArrayList;

public class Session {
    private int id;
    private String date;
    private int number_of_reviews;
    private int price;
    private int patient_id;
    private int doctor_id;
    private static ArrayList<Session> sessions = new ArrayList<>();


    
    public Session(int id, String date, int number_of_reviews, int price, int patient_id, int doctor_id) {
        this.id = id;
        this.date = date;
        this.number_of_reviews = number_of_reviews;
        this.price = price;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
    }


    public static void print_sessions() {
        System.out.println("-------- Sessions Start --------");
        for (Session item : sessions) {
            System.out.println("-------- Session Start --------");
            System.out.println("Session id: " + item.id);
            System.out.println("Session date: " + item.date);
            System.out.println("Session number of reviews: " + item.number_of_reviews);
            System.out.println("Session price: " + item.price);
            System.out.println("Session patient id: " + item.patient_id);
            System.out.println("Session doctor id: " + item.doctor_id);
            System.out.println("-------- Session End --------");
        }
        System.out.println("-------- Sessions End --------");


    }













    // Getter and Setter methods
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNumber_of_reviews() {
        return number_of_reviews;
    }
    public void setNumber_of_reviews(int number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPatient_id() {
        return patient_id;
    }
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
    public int getDoctor_id() {
        return doctor_id;
    }
    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }
















    public static ArrayList<Session> getSessions() {
        return sessions;
    }
















    public static void setSessions(ArrayList<Session> sessions) {
        Session.sessions = sessions;
    }







    
}
