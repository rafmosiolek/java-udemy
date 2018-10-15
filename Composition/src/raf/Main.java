package raf;

public class Main {

    public static void main(String[] args) {
        Dimensions caseDimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "230", caseDimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2740, 1440));

        Motherboard theMotherboard = new Motherboard("B3-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(10, 20, "red");
        thePC.getMotherboard().loadProgram("Windows 3.11");
    }
}
