import static java.lang.Math.round;

public class SearchArray {
    public int search(int[] zahlen, int gesucht) {
        int rechts = zahlen.length - 1;
        int links = 0;

        while (links <= rechts) {
            int mitte = links + (rechts - links) / 2;

            if (zahlen[mitte] == gesucht) {
                return mitte;
            }
            if (zahlen[mitte] > gesucht) {
                rechts = mitte -1;
            }
            else {
                links = mitte + 1;
            }
        }
        return -1;
    }

}