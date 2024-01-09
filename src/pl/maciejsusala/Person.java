package pl.maciejsusala;

import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        if(isValidBirthYear(birthYear)){
            this.birthYear = birthYear;
        } else {
            System.out.println("Nieprawidłowy wiek. Zmienimy na 30^^");
            this.birthYear = birthYear;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    private boolean isValidBirthYear(int birthYear){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return birthYear >= currentYear - 110 && birthYear <= currentYear - 16;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
