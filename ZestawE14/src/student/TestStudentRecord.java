package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("wow", "123", 3.6);
        StudentRecord s2 = new StudentRecord("wow", "123", 3.1);
        s1.printDetails();
        s2.printDetails();
        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
