
/*
1."Читатели библиотеки". Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО,
номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().

Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():

- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".

- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В.
взял книги: Приключения, Словарь, Энциклопедия".

- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

 Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
 Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
*/
package com.library;

import java.time.LocalDate;

public class Reader {
    private String firstName;
    private String middleName;
    private String lastName;
    private int ticketNumber;
    private String faculty;
    private LocalDate dob;
    private String phone;

    public Reader(String firstName,
                  String middleName, String lastName,
                  int ticketNumber, String faculty, LocalDate dob, String phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.ticketNumber = ticketNumber;
        this.dob = dob;
        this.phone = phone;
    }

    private String concatenateNames() {
        return firstName + "\t" + middleName + "\t" + lastName;
    }

    public void takeBook(int number) {

        String fio = concatenateNames();

        System.out.println(fio + " takes " + number + " books");

    }

    public void returnBook(int number) {

        String fio = concatenateNames();

        System.out.println(fio + " returns " + number + " books");

    }

    public void takeBook(String... names) {

        String fio = concatenateNames();

        String bookNames = String.join(", ", names);

        System.out.println(fio + " takes " + bookNames + " books");

    }

    public void returnBook(String... names) {

        String fio = concatenateNames();

        String bookNames = String.join(", ", names);

        System.out.println(fio + " returns " + bookNames + " books");

    }

    public void takeBook(Book... books) {

        String fio = concatenateNames();

        String[] names = new String[books.length];

        for (int i = 0; i < books.length; i++) {
            names[i] = books[i].getName();
        }

        String bookNames = String.join(", ", names);

        System.out.println(fio + " takes " + bookNames + " books");

    }

    public void returnBook(Book... books) {

        String fio = concatenateNames();

        String[] names = new String[books.length];

        for (int i = 0; i < books.length; i++) {
            names[i] = books[i].getName();
        }

        String bookNames = String.join(", ", names);

        System.out.println(fio + " returns " + bookNames + " books");

    }

}
