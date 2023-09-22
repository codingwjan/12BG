import java.util.ArrayList;
import org.prin.page6.Worker;

public class Company {
    private int id;
    private ArrayList<Worker> workers = new ArrayList();

    public Company() {

    }
    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Worker searchWorker(int id) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId() == id) {
                return workers.get(i);
            }
        }
        return null;
    }

    public boolean deleteWorker(int id) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId() == id) {
                workers.add(i, null);
            }
        }
        return true;
    }
}
