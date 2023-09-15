package org.prin.page6;

public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        Worker w1 = new Worker(69, "Drachen", "Lord", "09.11.2001");
        Worker w2 = new Worker(70, "Deine", "Vater", "92.10.2004");

        c.addWorker(w1);
        c.addWorker(w2);
        System.out.println(c.searchWorker(69).getNachname());
        System.out.println(c.searchWorker(70).getVorname());
        System.out.println(c.deleteWorker(69));
        System.out.println(c.searchWorker(69));
    }
}
