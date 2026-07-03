// 2. Patient Class
class Patient extends Person {

    private String patientId;

    private String bloodGroup;

    private String disease;

    private String medicalHistory;

    private String admissionDate;

    public Patient() {

    }

    public Patient(int personID, String name, int age, String gender, String phoneNumber, String address,

                   String patientId, String bloodGroup, String disease, String medicalHistory, String admissionDate) {

        super(personID, name, age, gender, phoneNumber, address);

        this.patientId = patientId;

        this.bloodGroup = bloodGroup;

        this.disease = disease;

        this.medicalHistory = medicalHistory;

        this.admissionDate = admissionDate;

    }

    public String getPatientId() {

        return patientId;

    }

    public void setPatientId(String patientId) {

        this.patientId = patientId;

    }

    public String getBloodGroup() {

        return bloodGroup;

    }

    public void setBloodGroup(String bloodGroup) {

        this.bloodGroup = bloodGroup;

    }

    public String getDisease() {

        return disease;

    }

    public void setDisease(String disease) {

        this.disease = disease;

    }

    public String getMedicalHistory() {

        return medicalHistory;

    }

    public void setMedicalHistory(String medicalHistory) {

        this.medicalHistory = medicalHistory;

    }

    public String getAdmissionDate() {

        return admissionDate;

    }

    public void setAdmissionDate(String admissionDate) {

        this.admissionDate = admissionDate;

    }

    @Override

    public void performRole() {

        System.out.println("Patient role: Receives treatment and keeps medical records in the hospital system.");

    }

    public void displayPatientDetails() {

        displayPersonDetails();

        System.out.println("Patient ID: " + patientId);

        System.out.println("Blood Group: " + bloodGroup);

        System.out.println("Disease: " + disease);

        System.out.println("Medical History: " + medicalHistory);

        System.out.println("Admission Date: " + admissionDate);

    }

}
