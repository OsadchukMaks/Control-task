package com.students;

public class Aspirant extends Student {
    private boolean scienceWork;

    public Aspirant(String firstName, String middleName, String lastName, double averageMark, boolean scienceWork) {
        super(firstName, middleName, lastName, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 180;
    }
}
