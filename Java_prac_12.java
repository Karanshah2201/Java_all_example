package java_prac_12;
import java.util.*;

/**
 *
 * @author Karan Shah
 */
class Date {
private int month;
private int day;
private int year;
public Date(int myMonth,int myDay, int myYear) {
month = myMonth;
day = myDay;
year = myYear;
}
public void setMonthDate(int myMonth) {
month = myMonth;
}
public int getMonthDate() {
return month;
}
public void setDayDate(int myDay) {
day = myDay;
}
public int getDayDate() {
return month;
}
public void setYearDate(int myYear) {
year = myYear;
}
public int getYearDate() {
return year;
}
public void displayDate() {
System.out.printf("%d/%d/%d", day,month,year);
}
}
public class Java_prac_12 extends Date{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
Date myDate = new Date(9, 11, 1986);
System.out.println("Enter the Date");
int myDay = input.nextInt();
myDate.setDayDate(myDay);
System.out.println("Enter The Month");
int myMonth = input.nextInt();
myDate.setMonthDate(myMonth);

System.out.println("Enter the Year");
int myYear = input.nextInt();
myDate.setYearDate(myYear);
myDate.displayDate();
}

    public Java_prac_12(int myMonth, int myDay, int myYear) {
        super(myMonth, myDay, myYear);
    }
    }
    
}
