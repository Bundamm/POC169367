package healthcare;

public class Hospital {
    private String name;
    private String address;
    private int patients;

    public Hospital(String name, String address, int patients) {
        this.name = (name == null || name.isEmpty()) ? "Centralny Szpital Kliniczny" : name;
        this.address = (address == null || address.isEmpty()) ? "ul. Zdrowia 100, 00-001 Warszawa" : address;
        this.patients = (patients <= 0) ? 200 : patients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address!= null && !address.isEmpty() ){
            this.address = address;
        }

    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        if(patients > 0) {
            this.patients = patients;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Name: "+ name +". Adress: "+ address+". Number of patients: "+patients+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hospital hospital = (Hospital) o;

        if (patients != hospital.patients) return false;
        if (!name.equals(hospital.name)) return false;
        return address.equals(hospital.address);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + patients;
        return result;
    }

    public void admitPatient(int patient){
        patients += patient;
        if(patients > 1000) patients = 1000;
    }

    public static void checkCapacity(Hospital h){
        System.out.println("Ilość pacjentów: "+h.patients+". Ilość do limitu"+(1000-h.patients));
    }
}
