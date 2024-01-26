package student;

public record StudentRecord(String name, String id, double gpa) {

    public StudentRecord{
        if(gpa < 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("nuh uh");
        }
    }

    public boolean isHonorStudent(){
        return this.gpa > 3.5;
    }
    public void printDetails(){
        System.out.println("Imię: "+this.name+" Id: "+this.id+" GPA: "+this.gpa);
    }
}
