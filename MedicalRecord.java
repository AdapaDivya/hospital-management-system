class MedicalRecord {
    int patientId;
    int doctorId;
    String diagnosis;

    MedicalRecord(int patientId, int doctorId, String diagnosis) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
    }

    void display() {
        System.out.println(patientId + " -> " + doctorId + " | " + diagnosis);
    }
}