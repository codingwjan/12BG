package org.prin.page6;

import java.util.ArrayList;

public class Company {
    private int id;
    private ArrayList<Worker> workers = new ArrayList();

    public Company() { }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Worker searchWorker(int id) {
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                return worker;
            }
        }
        return null; // Return null if the worker is not found
    }


    public boolean deleteWorker(int id) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId() == id) {
                workers.remove(i); // Remove the worker from the list
                return true; // Worker found and deleted successfully
            }
        }
        return false; // Worker with the given ID not found
    }

}
