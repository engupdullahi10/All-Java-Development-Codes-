// 3. Doctor Class

class Doctor extends Person {

    private String doctorId;

    private String specialization;

    private String qualification;

    private String experience;

    private int consultationFee;

    public Doctor() {

    }

    public Doctor(int personID, String name, int age, String gender, String phoneNumber, String address,

                  String doctorId, String specialization, String qualification, String experience, int consultationFee) {

        super(personID, name, age, gender, phoneNumber, address);

        this.doctorId = doctorId;

        this.specialization = specialization;

        this.qualification = qualification;

        this.experience = experience;

        this.consultationFee = consultationFee;

    }

    public String getDoctorId() {

        return doctorId;

    }

    public void setDoctorId(String doctorId) {

        this.doctorId = doctorId;

    }

    public String getSpecialization() {

        return specialization;

    }

    public void setSpecialization(String specialization) {

        this.specialization = specialization;

    }

    public String getQualification() {

        return qualification;

    }

    public void setQualification(String qualification) {

        this.qualification = qualification;

    }

    public String getExperience() {

        return experience;

    }

    public void setExperience(String experience) {

        this.experience = experience;

    }

    public int getConsultationFee() {

        return consultationFee;

    }

    public void setConsultationFee(int consultationFee) {

        this.consultationFee = consultationFee;

    }

    @Override

    public void performRole() {

        System.out.println("Doctor role: Checks patients, gives consultation, and manages treatment.");

    }

    public void displayDoctorDetails() {

        displayPersonDetails();

        System.out.println("Doctor ID: " + doctorId);

        System.out.println("Specialization: " + specialization);

        System.out.println("Qualification: " + qualification);

        System.out.println("Experience: " + experience);

        System.out.println("Consultation Fee: " + consultationFee);

    }

}