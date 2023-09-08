public class Computerraum extends Rooms{
    private int pcCount;

    public Computerraum(String name, int count, boolean hasSink, int pcCount) {
        super(name, count, hasSink);
        this.pcCount = pcCount;
        System.out.println("Computerraum created");
        if (count > pcCount) {
            System.out.println("Warning - more seats than PCs");
        }
    }

    public int getPcCount() {
        return pcCount;
    }

    public void setPcCount(int pcCount) {
        this.pcCount = pcCount;
    }
}