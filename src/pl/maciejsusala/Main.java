package pl.maciejsusala;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bartek", 1990, 2550);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Adam", 1988, 500);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Tymonodeusz", 1870, 5500); // bonus za seniority ;)

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Błażej", 2003, 170, 50, 1.5);

        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Andrzej", 1992, 150, 50, 1.5);



        Employee[] employeesArray = {employee1, salariedEmployee1, salariedEmployee2, hourlyEmployee1, hourlyEmployee2};

        Bookkeeping.printAllPayments(employeesArray);
        System.out.println();
        System.out.println();


        System.out.println("Wiek Barka to: " + employee1.getAge());
        System.out.println();
        System.out.println();


        salariedEmployee1.addBonus(500);
        salariedEmployee2.addBonus(400);

        hourlyEmployee1.addHoursWorked(20);
        hourlyEmployee2.addHoursWorked(50);
        Bookkeeping.printAllPayments(employeesArray);
    }
}
