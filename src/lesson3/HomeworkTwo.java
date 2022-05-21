package lesson3;

import java.util.Iterator;
import java.util.Set;

public class HomeworkTwo {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "9001111111");
        phoneBook.add("Петров", "9002222222");
        phoneBook.add("Сидоров", "9003333333");
        phoneBook.add("Скворцов", "9004444444");
        phoneBook.add("Иванов", "9001111112");
        Set<String> surnames = phoneBook.allSurname();
        for (String surname : surnames) {
            System.out.printf("Пользователь %s имеет номер(а) телефонов %s %n", surname, phoneBook.get(surname));
        }
        }

    }
