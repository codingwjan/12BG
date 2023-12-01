package org.pytorx.qphase.dec1st.Num2;

public class Wagon {
    private String zielbahnhof;

    public Wagon(String zielbahnhof) {
        this.zielbahnhof = zielbahnhof;
    }

    public String getZielbahnhof() {
        return this.zielbahnhof;
    }

    public String toString() {
        return "Wagon mit dem Zielbahnhof " + this.zielbahnhof;
    }
}
