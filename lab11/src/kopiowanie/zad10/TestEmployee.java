package kopiowanie.zad10;

public class TestEmployee {
    public static void main(String[] args) {
        double[] salaries = {2000.0, 2500.0, 3000.0, 2800.0, 3200.0, 3500.0, 3800.0, 4000.0, 4200.0, 4500.0, 4800.0, 5000.0};
        Employee e1 = new Employee("Dafawsfd", salaries);
        Employee e2 = null;
        try{
            e2 = e1.clone();
            e1.getSalaries()[5] = 2133;
            System.out.println(e1.toString());
            System.out.println(e2.toString());
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}
