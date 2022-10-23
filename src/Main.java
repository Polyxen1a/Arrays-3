import static java.time.Year.isLeap;
import  java.time.LocalDate;

public class Methods {

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap (year);
        printIsLeapYear(year, yearIsLeap);
    }
    private static boolean isLeap(int Year) {
        return year % 4 == 0 && year % 10 != || year % 400 == 0; return isLeap;
    }
    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
        // Задача 2

    }
    }
