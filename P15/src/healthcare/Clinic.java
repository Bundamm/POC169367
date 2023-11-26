package healthcare;

public class Clinic extends Hospital{
    private String specialization;
    private double rating;

    public Clinic(String name, String location, double capacity, String specialization, double rating) {
        super(name, location, capacity);
        this.specialization = (specialization == null || specialization.isEmpty()) ? "ogólna" : specialization;
        this.rating = (rating < 0.0 || rating > 5.0) ? 3.0 : rating;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization != null && !specialization.isEmpty()) this.specialization = specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating >= 0.0 && rating <= 5.0) this.rating = rating;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Specialization: "+specialization+". Rating: "+rating+".";
    }

    @Override
    public void expand(double n) {
        double cap = getCapacity() + n;
        if(cap > 500.0) cap = 500;
        setCapacity(cap);
        rating+=0.5;
        if(rating > 5.0) rating = 5.0;

    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Clinic clinic = (Clinic) o;

        if (Double.compare(rating, clinic.rating) != 0) return false;
        return specialization.equals(clinic.specialization);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + specialization.hashCode();
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
