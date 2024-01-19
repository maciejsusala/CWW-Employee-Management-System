package pl.maciejsusala;

public class Bookkeeping {
    public static void printAllPayments(Employee[] employeesArray){
        System.out.println("Tabela wypłat:");
        for (Employee employee : employeesArray){
            System.out.println("Pracownik " + employee.getName() + " zarobił " + employee.calculatePay() + "zł");
            if(employee instanceof SalariedEmployee){
                System.out.println("Stawka podstawowa: " + employee.getBaseSalary() + "zł");
                System.out.println("Bonus: " + ((SalariedEmployee) employee).getBonus() + "zł");
            }

            if(employee instanceof HourlyEmployee){
                System.out.println("Podstawa: " + employee.getBaseSalary());
                System.out.println("Stawka za godzinę: " + ((HourlyEmployee) employee).getHourlyRate());
                System.out.println("Stawka za nadgodziny: " + ((HourlyEmployee) employee).getOvertimeRate());
                System.out.println("Pracownik przepracował " + ((HourlyEmployee) employee).getHoursWorked());
                System.out.println("Zarobił " + ((HourlyEmployee) employee).getSalaryForStandardHours() + "zł za standardowe godziny");
                System.out.println("Oraz " + ((HourlyEmployee) employee).getBonusForOvertime() + "zł za nadgodziny");
            }

            System.out.println("----------------------------------------");
        }
    }
}
