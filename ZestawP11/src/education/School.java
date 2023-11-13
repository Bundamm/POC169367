package education;

public class School {
    private String name;
    private String address;
    private int students;

    public School(String name, String address, int students) {
        this.name = (name != null && name.isEmpty()) ? "Wydział Matematyki i Informatyki UWM" : name;
        this.address = (address != null && address.isEmpty()) ? "ul. Słoneczna 54, 10-710 Olsztyn" : address;
        this.students = (students <= 0) ? 100 : students;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStudents() {
        return students;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public void setAddress(String address) {
        if(address != null && !address.isEmpty()){
            this.address = address;
        }
    }

    public void setStudents(int students) {
        if(students > 0){
            this.students = students;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " Name: " + this.name +
                ", Adress: " + address +
                ", Students: " + students;

    }


    @Override
    public boolean equals(Object obj) {
        School other = (School) obj;
        return this.address.equals(other.address);
    }
    

    public void recruitment(int num){
        this.students += num;
        if(this.students > 500) this.students = 500;
    }

    public static void checkLimit(School obj){
        System.out.println(obj.students+", do limitu: "+(500-obj.students));
    }
 }
