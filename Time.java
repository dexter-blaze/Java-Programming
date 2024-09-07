package day5;

//import java.util.*;

public class Time
{
    int hour;
    int min;
    int sec;
    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public void add(Time otherTime) {
        int newHour = this.hour + otherTime.hour;
        int newMin = this.min + otherTime.min;
        int newSec = this.sec + otherTime.sec;
        int day = 0;

        if(newSec >= 60)
        {
            newSec -= 60;
            newMin++;
        }
        if(newMin >= 60) {
            newMin -= 60;
            newHour++;
        }
        if(newHour > 24) {
            newHour -= 24;
            day++;
        }

        System.out.println("Day : " + day + ", Hour : " + newHour + ", Min : " + newMin + ", Sec : " + newSec);
    }
    public static void main(String[] args)
    {
        Time time1 = new Time(3, 35, 45);
        Time time2 = new Time(22, 35, 35);

        time1.add(time2);
    }
}
