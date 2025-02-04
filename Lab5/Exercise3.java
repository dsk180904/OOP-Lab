class Time {
    int hours;
    int minutes;
    int seconds;

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void format() {
        System.out.println("HH:MM:SS");
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    Time addTime(Time otherTime) {
        Time totalTime = new Time();
        totalTime.seconds = this.seconds + otherTime.seconds;
        totalTime.minutes = this.minutes + otherTime.minutes + totalTime.seconds / 60;
        totalTime.hours = this.hours + otherTime.hours + totalTime.minutes / 60;
        totalTime.minutes %= 60;
        totalTime.seconds %= 60;
        return totalTime;
    }
}
public class Exercise3{
    public static void main(String[] args) {
        Time myTime1 = new Time();
        Time myTime2 = new Time(12, 30, 30);
        System.out.println("Time 1:");
        myTime1.format();
        System.out.println("Time 2:");
        myTime2.format();
        Time sumTime = myTime1.addTime(myTime2);
        System.out.println("Sum of times:");
        sumTime.format();
    }
}
    