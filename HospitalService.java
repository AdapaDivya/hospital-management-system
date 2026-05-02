import java.util.*;

class HospitalService {

    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<MedicalRecord> records = new ArrayList<>();

    static void addPatient(Patient p) {
        patients.add(p);
        System.out.println(HospitalUI.GREEN + "Patient Registered" + HospitalUI.RESET);
    }

    static void addDoctor(Doctor d) {
        doctors.add(d);
        System.out.println(HospitalUI.GREEN + "Doctor Added" + HospitalUI.RESET);
    }

    static void viewPatients() {
        for(Patient p : patients)
            p.display();
    }

    static void viewDoctors() {
        for(Doctor d : doctors)
            d.display();
    }

    static void createRecord(int pid, int did, String diag) {
        records.add(new MedicalRecord(pid, did, diag));
        System.out.println(HospitalUI.BLUE + "Medical Record Created" + HospitalUI.RESET);
    }

    static void viewRecords() {
        for(MedicalRecord r : records)
            r.display();
    }
}