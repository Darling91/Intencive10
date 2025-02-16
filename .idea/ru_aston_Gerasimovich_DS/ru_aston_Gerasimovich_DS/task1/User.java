package ru_aston_Gerasimovich_DS.task1;

import java.util.Objects;

public class User{

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 150;

    private int age;
    private String name;
    private String surname;
    private final boolean isTwoYearsOfDrivingCar;
    private final boolean isTwentyYearsOfDrivingCar;

    public User(int age, String name, String surname, boolean isTwoYearsOfDrivingCar, boolean isTwentyYearsOfDrivingCar) {
        setAge(age);
        setName(name);
        setSurname(surname);
        this.isTwoYearsOfDrivingCar = isTwoYearsOfDrivingCar;
        this.isTwentyYearsOfDrivingCar = isTwentyYearsOfDrivingCar;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException("Возраст должен быть между " + MIN_AGE + " и " + MAX_AGE);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        validateName(name, "Имя");
        this.name = name.trim();
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        validateName(surname, "Фамилия");
        this.surname = surname.trim();
    }

    public boolean isTwoYearsOfDrivingCar() {
        return isTwoYearsOfDrivingCar;
    }

    public boolean isTwentyYearsOfDrivingCar() {
        return isTwentyYearsOfDrivingCar;
    }
    private void validateName(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " не может быть null или пустым");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age
                && isTwoYearsOfDrivingCar == user.isTwoYearsOfDrivingCar
                && isTwentyYearsOfDrivingCar == user.isTwentyYearsOfDrivingCar
                && Objects.equals(name, user.name)
                && Objects.equals(surname, user.surname);
    }
}
