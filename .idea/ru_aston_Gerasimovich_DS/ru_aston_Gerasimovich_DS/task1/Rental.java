package ru_aston_Gerasimovich_DS.task1;

import java.util.Objects;

public abstract class Rental {

    private double NOT_EXPIRIENCED_DRIVER = 0.2;
    private double EXPIRIENCED_DRIVER = 0.5;
    private double MIN_PRICE = 0.0;

    private double price;
    private User user;
    private boolean expiriencedDriver;

    public Rental(double price, User user, boolean expiriencedDriver) {
        this.price = price;
        this.user = user;
        this.expiriencedDriver = expiriencedDriver;
    }

    public double getPrice() {
        return price;
    }

    public User getUser(){
        return user;
    }

    public boolean isExpiriencedDriver() {
        return expiriencedDriver;
    }

    public double getDiscountPrice(){
        double discount = calculateDiscount();
        double finalPrice = price - discount;
        return Math.max(finalPrice, MIN_PRICE);
    }

    public double calculateDiscount(){
        double discount = 0;
        if(user.isTwoYearsOfDrivingCar()){
            discount += price * NOT_EXPIRIENCED_DRIVER;
        }
        if(user.isTwentyYearsOfDrivingCar()){
            discount += price * EXPIRIENCED_DRIVER;
        }
        return discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental that = (Rental) o;
        return Double.compare(price, that.price) == 0 &&
                expiriencedDriver == that.expiriencedDriver &&
                user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, user, expiriencedDriver );
    }
}
