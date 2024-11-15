public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println(natoWord('A'));
        System.out.println(natoChar('A'));
    }

    public static String natoWord (char character) {
        switch (character) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "NATO word not found";
        }
    }

    public static String natoChar (char character) {
        return switch (character) {
            case 'A' -> { yield "Able"; }
            case 'B' -> { yield "Baker"; }
            case 'C' -> { yield "Chalie"; }
            case 'D' -> { yield "Dog"; }
            case 'E' -> { yield "Easy"; }
            default -> {
                yield "NATO word not found";
            }
        };
    }
}