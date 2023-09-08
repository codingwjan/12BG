public class Rooms {

    private static String name;
    private static int count;
    private static boolean hasSink;

    public Rooms(String name, int count, boolean hasSink) {
        this.name = name;
        this.count = count;
        this.hasSink = hasSink;
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Rooms.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rooms.count = count;
    }

    public static boolean isHasSink() {
        return hasSink;
    }

    public static void setHasSink(boolean hasSink) {
        Rooms.hasSink = hasSink;
    }
}
