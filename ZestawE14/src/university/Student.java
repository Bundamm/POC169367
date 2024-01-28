package university;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student>{

    @Override
    public int compareTo(Student obj) {
        int base = Double.compare(obj.averageGrade, this.averageGrade);
        if(base != 0){
            return base;
        }
        return Integer.compare(this.yearOfStudy, obj.yearOfStudy);
    }
}
