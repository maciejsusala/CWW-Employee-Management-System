package pl.maciejsusala;

public class SalariedEmployee extends Employee{
    private double bonus;

    public SalariedEmployee(String name, int birthYear, double bonus) {
        super(name, birthYear, 3000);
        this.bonus = bonus;
    }

    public void addBonus(double additionalBonus){
        this.bonus = bonus + additionalBonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculatePay(){
        return super.getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
