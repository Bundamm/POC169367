package healthcare;

public class Clinic extends Hospital{
    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        this.rating = (rating >= 0.0 && rating <= 5.0) ? rating : 3.0;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating >= 0.0 && rating <= 5.0){
            this.rating = rating;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Rating: "+rating+".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
