package com.students;

public class TestStudents {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student student1 = new Student("john", "fon", "mon", 50);
        Student student2 = new Student("jake", "born", "don", 51);
        Aspirant aspirant = new Aspirant("jake", "born", "don", 51,
                true);

        students[0] = student1;
        students[1] = student2;
        students[2] = aspirant;

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}
