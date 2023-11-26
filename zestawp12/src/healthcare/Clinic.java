package healthcare;

public class Clinic extends Hospital{
    private String specialization;
    private int doctors;

    public Clinic(String name, String address, int patients, String specialization, int doctors) {
        super(name, address, patients);
        this.specialization = (specialization == null || specialization.isEmpty()) ? "ogólna" : specialization;
        this.doctors = doctors < 0 ? 20 : doctors;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization != null && !specialization.isEmpty())  this.specialization = specialization;
    }

    public int getDoctors() {
        return doctors;
    }

    public void setDoctors(int doctors) {
        if(doctors >= 0) this.doctors = doctors;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Specialization: "+ specialization+". Number of doctors: " + doctors+".";
    }

    @Override
    public void admitPatient(int patient) {
        int p = getPatients() + patient;
        if(p > 500) p = 500;
        setPatients(p);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Clinic clinic = (Clinic) o;

        if (doctors != clinic.doctors) return false;
        return specialization.equals(clinic.specialization);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + specialization.hashCode();
        result = 31 * result + doctors;
        return result;
    }
}
