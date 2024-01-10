package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("sda", "12ed", 1);
        StudentRecord s2 = new StudentRecord("sda", "12ed", 3.6);

        s1.printDetails();
        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
