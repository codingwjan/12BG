import static java.lang.Math.round;

public class SearchArray {
    public int search(Kunde[] kunden, int gesucht) {
        int rechts = kunden.length - 1;
        int links = 0;

        while (links <= rechts) {
            int mitte = links + (rechts - links) / 2;

            if (kunden[mitte].getId() == gesucht) {
                return mitte;
            }
            if (kunden[mitte].getId() > gesucht) {
                rechts = mitte -1;
            }
            else {
                links = mitte + 1;
            }
        }
        return -1;
    }

}