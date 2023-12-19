public class Demo {
    public String returnNextDay(int day, int month, int year){
        String result = "";
        int nextDay = 0, nextMonth = 0, nextYear = 0;
        if (day > 0 && day <28){
            nextDay = day+1;
        } else if (day = 28 && !isLeapYear(year)){
            nextDay = 1;
        }
    }

    private boolean isLeapYear(int year) {

    }

}
