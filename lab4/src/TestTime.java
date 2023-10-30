public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hours = 10;
        t1.minutes = 35;
        Time t2 = new Time();
        t2.hours = 5;
        t2.minutes = 39;
        Time t3 = t1.addTime(t2);
        System.out.println(t3.hours+":"+t3.minutes );
    }
}

class Time{
    int hours;
    int minutes;

    public Time addTime(Time otherTime){
//        Time newTime = new Time();
//
//        newTime.minutes = this.minutes + otherTime.minutes;
//        if(newTime.minutes > 59){
//            newTime.minutes %= 60;
//            newTime.hours +=
//        }
//        newTime.hours = this.hours + otherTime.hours;
//        if(this.hours > 23){
//            newTime.hours
//        }
        this.hours += otherTime.hours;
        this.minutes += otherTime.minutes;

        if(this.minutes > 59){
            this.minutes -= 60;
            this.hours += 1;
        }
        if(this.hours > 23){
            this.hours -= 24;
        }

        Time temp = new Time();
        temp.hours = this.hours;
        temp.minutes= this.minutes;
        return temp;
    }
}