
public class Index {

    public static void main(String[] args) {

        // Create Doctor object
        Doctor d1 = new Doctor(1, "first doctor", "firstdoctor@gmail.com", 40, "first type");
        Doctor d2 = new Doctor(2, "second doctor", "seconddoctor@gmail.com", 80, "second type");

        // Add the doctors in array doctors
        Doctor.doctors.add(d1);
        Doctor.doctors.add(d2);




        // Create Patient object
        Patient p1 = new Patient(1, "first patient", "firstpatient@gmail.com", 44);
        Patient p2 = new Patient(1, "second patient", "secondpatient@gmail.com", 52);
        Patient p3 = new Patient(1, "third patient", "thirdpatient@gmail.com", 10);
        Patient p4 = new Patient(1, "forth patient", "forthpatient@gmail.com", 12);

        





    }
    
    
}
