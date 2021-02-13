public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999){
            return false;
        } else if (year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth (int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        int numOfDays;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
            default:
                numOfDays = 30;
        }
        return numOfDays;
    }
}
