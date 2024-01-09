package pl.maciejsusala;

public class Main {
    public static void main(String[] args) {
//        Utwórz kilka pracowników różnych klas (Employee, SalariedEmployee, HourlyEmployee).
//        Przypisz im różne wartości dla pól, takie jak baseSalary, bonus, hoursWorked, hourlyRate, overtimeRate, itd. Wykorzystaj przy tym różne konstruktory.

        Employee employee1 = new Employee("Bartek", 1990, 2550);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Adam", 1988, 500);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Tymonodeusz", 1870, 5500); // bonus za seniority ;)

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Błażej", 2003, 170, 50, 1.5);
    }
}
