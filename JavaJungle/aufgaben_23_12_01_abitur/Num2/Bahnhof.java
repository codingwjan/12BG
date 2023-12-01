package org.pytorx.qphase.dec1st.Num2;

import java.util.Stack;

public class Bahnhof {

    public static void main(String[] args) {

        // Erstellen der Züge
        Zug zugA = new Zug(1);
        Zug zugB = new Zug(2);

        // Anhängen der Waggons
        zugA.anhängen(new Wagon("A"));
        zugA.anhängen(new Wagon("B"));
        zugA.anhängen(new Wagon("A"));
        zugA.anhängen(new Wagon("B"));

        zugB.anhängen(new Wagon("A"));
        zugB.anhängen(new Wagon("B"));
        zugB.anhängen(new Wagon("A"));
        zugB.anhängen(new Wagon("B"));

        // Erstellen der Stapel
        Stack<Wagon> stapelA = new Stack<>();
        Stack<Wagon> stapelB = new Stack<>();

        // Umsortierung der Waggons
        for (Wagon wagon : zugA.getWaggonList()) {
            if (wagon.getZielbahnhof().equals("A")) {
                stapelA.push(wagon);
            } else {
                stapelB.push(wagon);
            }
        }

        for (Wagon wagon : zugB.getWaggonList()) {
            if (wagon.getZielbahnhof().equals("A")) {
                stapelA.push(wagon);
            } else {
                stapelB.push(wagon);
            }
        }

        // Befüllen der Züge
        zugA.getWaggonList().clear();
        for (Wagon wagon : stapelA) {
            zugA.anhängen(wagon);
        }

        zugB.getWaggonList().clear();
        for (Wagon wagon : stapelB) {
            zugB.anhängen(wagon);
        }

        // Ausgabe der Züge
        System.out.println("Zug A: " + zugA);
        System.out.println("Zug B: " + zugB);
    }
}
