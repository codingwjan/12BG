// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Computerraum computerraum = new Computerraum("Computerraum", 30, true, 20);
        System.out.println("Room Name: " + Rooms.getName());
        System.out.println("Seat Count: " + Rooms.getCount());
        System.out.println("Has Sink: " + Rooms.isHasSink());
        System.out.println("PC Count: " + computerraum.getPcCount());
    }

}

