package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    static Map<Integer, Employee> phoneBook = new HashMap<>();

    public static void add(int tabelNumber, String name, String phoneNumber, int stage) {
        phoneBook.put(tabelNumber, new Employee(tabelNumber, name, phoneNumber, stage));
    }

    public static List<Employee> findEmployeeByStage(int stage) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : phoneBook.values()) {
            if (emp.getStage() == stage) {
                employees.add(emp);
            }
        }
        return employees;
    }

    public static String findNumberPhone(String name) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Employee emp : phoneBook.values()) {
            if (emp.getName().equals(name)) {
                builder.append(i + ") ");
                builder.append(emp.getPhoneNumber() + " " + emp.getName() + "\n");
                i++;
            }
        }
        if (builder.isEmpty())
            return "Employees not found";
        return "Phone number:\n" + builder;
    }

    public static List<String> findNumberPhoneList(String name) {
        List<String> list = new ArrayList<>();
        for (Employee emp : phoneBook.values()) {
            if (emp.getName().equals(name)) {
                list.add(emp.getPhoneNumber());
            }
        }
        return list;
    }

    public static Employee findEmployee(int tabelNumber) {
        return phoneBook.get(tabelNumber);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("All employees:\n");
        int i = 1;
        for (var el : phoneBook.entrySet()) {
            builder.append(i + ") ");
            builder.append(el.getKey().toString() + " = " + el.getValue() + "\n");
            i++;
        }
        return builder.toString();
    }
}
