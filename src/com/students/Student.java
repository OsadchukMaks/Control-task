package com.students;
/*
2. Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента
наличием некой научной работы.

а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.

б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.

в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.

г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
Вызвать метод getScholarship() для каждого элемента массива.
 */

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private double averageMark;

    public Student(String firstName, String middleName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }
}
