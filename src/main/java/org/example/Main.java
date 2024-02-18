package org.example;

/*TIP
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж

Добавить метод добавление нового сотрудника в справочник
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
*/
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(1365950, "Ilya", "+79811111111", 8);
        phoneBook.add(1234567, "Olga", "+79822264578", 3);
        phoneBook.add(325687, "Natalya", "+79632169866", 6);
        phoneBook.add(9634525, "Aleksandr", "+79996632515", 3);
        phoneBook.add(4538762, "Vladislav", "+79442621510", 7);
        phoneBook.add(99999999, "John Dow", "+79999999999", 1);
        phoneBook.add(77777777, "Vladislav", "+79977777777", 7);
        System.out.println(phoneBook);

        System.out.println(phoneBook.findEmployeeByStage(3));
        System.out.println(phoneBook.findNumberPhone("Uliana"));
        System.out.println(phoneBook.findNumberPhone("Vladislav"));
        System.out.println(phoneBook.findNumberPhoneList("Vladislav"));
        System.out.println(phoneBook.findEmployee(99999999));
    }
}