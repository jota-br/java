
public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year > 9999 || year < 1) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 12 || month < 1) || (year < 1 || year > 9999)) {
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        return switch (month) {
            case 1 -> {
                yield 31;
            }
            case 2 -> {
                yield (isLeapYear) ? 29 : 28;
            }
            case 3 -> {
                yield 31;
            }
            case 4 -> {
                yield 30;
            }
            case 5 -> {
                yield 31;
            }
            case 6 -> {
                yield 30;
            }
            case 7 -> {
                yield 31;
            }
            case 8 -> {
                yield 31;
            }
            case 9 -> {
                yield 30;
            }
            case 10 -> {
                yield 31;
            }
            case 11 -> {
                yield 30;
            }
            case 12 -> {
                yield 31;
            }
            default ->
                -1;
        };
    }
}
