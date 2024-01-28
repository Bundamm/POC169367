package student;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord {
        if(gpa < 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("nie");
        }
    }

    public boolean isHonorStudent(){
        return gpa >= 3.5;
    }

    public void printDetails(){
        System.out.println("Name: "+name+", id: "+id+", gpa: "+gpa);
    }
}
