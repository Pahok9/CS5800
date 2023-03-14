public class InheritanceMain {

    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-111", 2500);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        printFirstLastSSN(employee1);
        System.out.println("Weekly Salary: $" + employee1.getWeeklySalary());
        System.out.println();
        printFirstLastSSN(employee2);
        System.out.println("Wage: $" + employee2.getWage());
        System.out.println("Hours Worked:" + employee2.getHoursWorked());
        System.out.println();
        printFirstLastSSN(employee3);
        System.out.println("Wage: $" + employee3.getWage());
        System.out.println("Hours Worked:" + employee3.getHoursWorked());
        System.out.println();
        printFirstLastSSN(employee4);
        System.out.println("Commission rate: %" + employee4.getCommissionRate());
        System.out.println("Gross Salary: $" + employee4.getGrossSales());
        System.out.println();
        printFirstLastSSN(employee5);
        System.out.println("Weekly Salary: $" + employee5.getWeeklySalary());
        System.out.println();
        printFirstLastSSN(employee6);
        System.out.println("Base Salary: $" + employee6.getBaseSalary());
        System.out.println();
        printFirstLastSSN(employee7);
        System.out.println("Commission rate: %" + employee7.getCommissionRate());
        System.out.println("Gross Salary: $" + employee7.getGrossSales());
        System.out.println();
    }

    public static void printFirstLastSSN(Employee e) {
        System.out.println("Name: "+ e.getFirstName() + " " + e.getLastName());
        System.out.println("SSN: " + e.getSocialSecurityNumber());
    }

}
