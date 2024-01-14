package student;

public record StudentRecord {
    public StudentRecord(String name, String id, double gpa) {
        if(gpa < 0 || gpa > 4){
            throw new IllegalArgumentException("średnia poza zakresem");
        }
    }
    public boolean isHonorStudent(){
        return this.gpa > 3.5;
    }
    public void printDetails(){
        System.out.println("Imię: "+this.name+" Id: "+this.id+" GPA: "+this.gpa);
    }
}
