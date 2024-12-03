public class Main {
    public static void main(String[] args) {
        // Create instances of our services
        EmailService emailService = new EmailService();
        TaxCalculator taxCalculator = new TaxCalculator();
        EmployeeRepository repository = new EmployeeRepository();

        // Create some employees
        Employee john = new Employee("John Doe", 50000, "john@example.com");
        Employee jane = new Employee("Jane Smith", 60000, "jane@example.com");

        // Process John's information
        System.out.println("\nProcessing information for " + john.getName());
        emailService.sendEmail(john.getEmail(), "Welcome to the company!");
        double johnTax = taxCalculator.calculateTax(john.getSalary());
        System.out.println("Tax amount for " + john.getName() + ": $" + johnTax);
        repository.save(john);

        // Process Jane's information
        System.out.println("\nProcessing information for " + jane.getName());
        emailService.sendEmail(jane.getEmail(), "Welcome to the company!");
        double janeTax = taxCalculator.calculateTax(jane.getSalary());
        System.out.println("Tax amount for " + jane.getName() + ": $" + janeTax);
        repository.save(jane);

        // Demonstrate salary update
        System.out.println("\nUpdating " + john.getName() + "'s salary");
        john.setSalary(55000);
        double newTax = taxCalculator.calculateTax(john.getSalary());
        System.out.println("New tax amount for " + john.getName() + ": $" + newTax);
        emailService.sendEmail(john.getEmail(), "Your salary has been updated!");
        repository.save(john);
    }
}