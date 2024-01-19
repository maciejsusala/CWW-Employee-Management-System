package pl.maciejsusala;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private double overtimeRate;

    public HourlyEmployee(String name, int birthYear, int hoursWorked, double hourlyRate, double overtimeRate) {
        super(name, birthYear, 2000);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;
    }

    public void addHoursWorked(int hours) {
        this.hoursWorked = hoursWorked + hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + salaryForHours();
    }

    public double getSalaryForStandardHours() {
        return calculateSalaryForStandardHours();
    }

    public double getBonusForOvertime() {
        return calculateBonusForOvertime();
    }

    private double salaryForHours() {
        return calculateSalaryForStandardHours() + calculateBonusForOvertime();
    }

    private double calculateSalaryForStandardHours() {
        return hourlyRate * 160;
    }

    private double calculateBonusForOvertime() {
        return (hoursWorked > 160) ? (hoursWorked - 160) * overtimeRate * hourlyRate : 0;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", overtimeRate=" + overtimeRate +
                "} " + super.toString();
    }
}
