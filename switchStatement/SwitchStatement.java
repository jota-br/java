
public class SwitchStatement {

    public static void main(String[] args) {
        System.out.println(getQuarter("JANUARY"));
        System.out.println(getQuarterArrowSwitch("APRIL"));
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
            case "APRIL":
                return "1st quarter";
            default: return "Out of quarter month";
        }
    }

    public static String getQuarterArrowSwitch(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH", "APRIL" -> "1st quarter";
            default -> "Out of quarter month";
        };
    }
}
