import java.time.Month;
public class MonthDays {
public static void main(String[] args) {
for (Month month : Month.values()) {
int daysInMonth = month.length(false);
System.out.println(month + " has " + daysInMonth + " days.");
}
}
}