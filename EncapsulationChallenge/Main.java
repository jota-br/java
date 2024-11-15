public class Main {

    public static void main(String[] args) {
        
        Printer printer = new Printer(100, false);

        System.out.println("Printed pages = " + printer.getPagesPrinted());
        printer.addToner(100);

        int pagesToPrint = 5;
        System.out.format("Current job pages = %d, Printed pages = %d%n",
                printer.printPages(pagesToPrint), printer.getPagesPrinted());

        pagesToPrint = 10;
        System.out.format("Current job pages = %d, Printed pages = %d%n",
                printer.printPages(pagesToPrint), printer.getPagesPrinted());

        System.out.println("_ _ _ _");

        Printer duplex = new Printer(100, true);

        System.out.println("Printed pages = " + duplex.getPagesPrinted());
        printer.addToner(100);

        pagesToPrint = 5;
        System.out.format("Current job pages = %d, Printed pages = %d%n",
                duplex.printPages(pagesToPrint), duplex.getPagesPrinted());

        pagesToPrint = 10;
        System.out.format("Current job pages = %d, Printed pages = %d%n",
                duplex.printPages(pagesToPrint), duplex.getPagesPrinted());
    }
}
