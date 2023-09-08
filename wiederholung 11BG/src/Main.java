import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String roomName;
        Random rand = new Random();

        if (rand.nextBoolean()) {
            // Generate room name starting with "PPC"
            int number = rand.nextInt(164) + 1;  // Number between 1 and 164
            roomName = "PPC-" + String.format("%03d", number);  // Format to 3 digits
        } else {
            // Generate room name starting with "FDS"
            int number = rand.nextInt(399) + 1;  // Number between 1 and 399
            roomName = "FDS-A" + String.format("%03d", number);  // Format to 3 digits
        }

        //create random values each time
        int randomCount = (int) (Math.random() * 100);
        boolean randomHasSink = Math.random() < 0.5;
        int randomPcCount = (int) (Math.random() * 100);
        Computerraum computerraum = new Computerraum(roomName, randomCount, randomHasSink, randomPcCount);

        String reset = "\u001B[0m";
        String white = "\u001B[97m";
        String lightBlue = "\u001B[94m";

        System.out.println(white + "Room Name: " + reset + lightBlue + Rooms.getName() + reset);
        System.out.println(white + "Seat Count: " + reset + lightBlue + Rooms.getCount() + reset);
        System.out.println(white + "Has Sink: " + reset + lightBlue + Rooms.isHasSink() + reset);
        System.out.println(white + "PC Count: " + reset + lightBlue + computerraum.getPcCount() + reset);
    }

}

