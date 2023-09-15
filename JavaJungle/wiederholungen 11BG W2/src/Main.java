public class Main {
    public static void main(String[] args) {
        Employee melitta = new Employee(4711, "Melitta", "Jacobs-Dallmayr", "03.07.2006");
        EmploymentContract melittaContract = new EmploymentContract(melitta.ID, "Coffee Making", 4000);

        System.out.println("Employee ID: " + melitta.ID);
        System.out.println("Name: " + melitta.firstName + " " + melitta.lastName);
        System.out.println("Birthdate: " + melitta.birthDate);
        System.out.println("Job Description: " + melittaContract.jobDescription);
        System.out.println("Monthly Salary: " + melittaContract.monthlySalary);
    }
}