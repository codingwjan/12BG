public class Room {
    private String name;
    private int seatCount;
    private boolean sink;

    public Room(String name, int seatCount, boolean sink) {
        this.name = name;
        this.seatCount = seatCount;
        this.sink = sink;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public boolean getSink() {
        return sink;
    }

    public void setSink(boolean sink) {
        this.sink = sink;
    }
}
