public class ComputerRoom extends Room {

    int computerCount;


    public ComputerRoom(String name, int seatCount, boolean sink, int computerCount) {
        super(name, seatCount, sink);

        this.computerCount = computerCount;
    }

    public int getComputerCount() {
        return computerCount;
    }

    public void setComputerCount(int computerCount) {
        this.computerCount = computerCount;
    }
}
