public class Date {

    public int day;
    public int month;
    public int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
       this.setDay(day);
       this.setMonth(month);
       this.setYear(year);
    }

    @Override
    public String toString() {
        return day+"/"+month+"/"+year;
    }
}
