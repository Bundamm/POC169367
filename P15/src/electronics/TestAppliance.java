package electronics;

public class TestAppliance {
    public static void main(String[] args) {
        Appliance a1 = Appliance.createFridge("fwa", "awf", 23);
        Appliance a2 = new Appliance();
        a2.createAppliance("awfawf", "awf", 1234);
    }
}
