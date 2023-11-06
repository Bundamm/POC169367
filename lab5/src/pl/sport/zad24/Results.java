package pl.sport.zad24;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    Results(String firstName, String lastName, int size){
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[size];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getResults() {
        return results;
    }

    public void addResult(int index, int result){
        this.results[index] = result;
    }
    public double averageResult(){
        double av = 0;
        for (int result : results) {
            av += result;
        }
        return av/results.length;
    }
}
