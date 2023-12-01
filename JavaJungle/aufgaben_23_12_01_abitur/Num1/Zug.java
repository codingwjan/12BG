package org.pytorx.qphase.dec1st.Num1;

import java.util.ArrayList;
import java.util.List;

public class Zug {
    private int id;
    private List<Wagon> waggonList;

    public Zug(int id) {
        this.id = id;
        this.waggonList = new ArrayList<>();
    }

    public void anhängen(Wagon wagon) {
        this.waggonList.add(wagon);
    }

    public List<Wagon> getWaggonList() {
        return this.waggonList;
    }

    public String toString() {
        return "Zug mit der ID " + this.id + " und den Waggons " + this.waggonList;
    }
}
