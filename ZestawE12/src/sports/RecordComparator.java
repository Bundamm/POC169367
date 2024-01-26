package sports;

import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        double r1 = findBest(o1);
        double r2 = findBest(o2);
        return Double.compare(r1,r2);
    }
    public double findBest(Athlete athlete){
        double[] records = athlete.getRecords();
        double best = records[0];
        for(double record : records){
            if(record < best){
                best = record;
            }
        }
        return best;
    }
}
