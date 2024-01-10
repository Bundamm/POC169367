package student;

public class StudentRecord {
    private String name;
    private String id;
    private double gpa;

    public StudentRecord(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        if(gpa < 0 || gpa > 4){
            throw new IllegalArgumentException("średnia poza zakresem");
        }
        this.gpa = gpa;
    }
    public boolean isHonorStudent(){
        return this.gpa > 3.5;
    }
    public void printDetails(){
        System.out.println("Imię: "+this.name+" Id: "+this.id+" GPA: "+this.gpa);
    }
}
