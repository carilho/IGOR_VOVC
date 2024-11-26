package homework_nr_7.part1;

public class Date {

    private int day;
    private int month;
    private int year;

    public int getDay() {

        return day;
    }

    public void setDay(int day) {
        if (isDayValid(day, this.month, this.year)) {
            this.day = day;
        } else {
            System.out.println("Please check if number of days is correct for chosen month.");
        }
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Month with such number does not exist.");
        }
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("We are not considering years Before Christ, sorry.");
        }
    }

    public boolean isDayValid(int day, int month, int year) {
        if (month == 2) {
            return day >= 1 && day <= 29;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day >= 1 && day <= 30;
        } else {
            return day >= 1 && day <= 31;
        }
    }

    public void displayDate() {
        if (month >= 1 && month <= 12 && year > 0 && isDayValid(day, month, year)) {
            System.out.println(this.day + "/" + this.month + "/" + this.year);
        } else {
            System.out.println("Date is not valid.");
        }
    }

    public static void main(String[] args) {

        Date date1 = new Date();

        date1.setDay(29);
        date1.setMonth(2);
        date1.setYear(3050);

        date1.displayDate();
        }
    }
