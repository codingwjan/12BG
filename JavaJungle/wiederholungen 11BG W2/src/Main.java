import org.prin.page6.Worker;


public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addWorker(new Worker(1, "John", "Smith", "1000"));

        System.out.println(company.searchWorker(1).getVorname());
    }
}