package com.company.HealthProfile;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private int height;
    private int weight;

    HealthProfile(String fName, String lName, String gen, int month, int day, int year, int h, int w) {
        firstName = fName;
        lastName = lName;
        gender = gen;
        birthMonth = month;
        birthYear = year;
        birthDay = day;
        height = h;
        weight = w;
    }

    @Override
    public String toString() {
        return "First Name: '" + firstName + '\'' +
                "\n Last Name: '" + lastName + '\'' +
                "\n Gender: '" + gender + '\'' +
                "\n Birthday: " + birthMonth + '\\' + birthDay + '\\' + birthYear +
                "\n Height: " + height +
                "\n Weight: " + weight +
                "\n Age: " + getAge() +
                "\n BMI: " + getBodyMassIndex() +
                "\n Max Heart Rate: " + getMaxHeartRate() +
                "\n Target Heart Range: " + getTargetHeartRate();
    }

    public int getAge() {
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        return year - birthYear;
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        Double min = getMaxHeartRate() * .50;
        Double max = getMaxHeartRate() * .85;
        return min.toString() + "-" + max.toString();
    }

    public double getBodyMassIndex() {
        return (weight * 703) / (height * height);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
