public class Computerraum extends Rooms{
    private int pcCount;

    public Computerraum(String name, int count, boolean hasSink, int pcCount) {
        super(name, count, hasSink);
        this.pcCount = pcCount;
        System.out.println("Computerraum created");
        if (count > pcCount) {
            //make a system.out.println but in red
            System.out.println("\u001B[31m" + "Error: Seat count is bigger than PC count" + "\u001B[0m");
        }
    }

    public int getPcCount() {
        return pcCount;
    }

    public void setPcCount(int pcCount) {
        this.pcCount = pcCount;
    }
}