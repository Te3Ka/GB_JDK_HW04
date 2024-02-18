package org.example;

public class Employee {
    private int tabelNumber;
    private String name;
    private String phoneNumber;
    private int stage;

    public Employee(int tabelNumber, String name, String phoneNumber, int yearsOfWork) {
        this.tabelNumber = tabelNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.stage = yearsOfWork;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "; phoneNumber: " + phoneNumber +
                "; stage: " + stage;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getStage() {
        return stage;
    }
}
