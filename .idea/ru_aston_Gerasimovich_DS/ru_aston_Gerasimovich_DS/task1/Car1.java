package ru_aston_Gerasimovich_DS.task1;

public class Car1 extends Rental {

    public Car1(double price, User user, boolean expiriencedDriver) {
        super(price, user, expiriencedDriver);

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
    }

    @Override
    public double calculateDiscount() {
        double discount = super.calculateDiscount();

        if(!getUser().isTwentyYearsOfDrivingCar()){
            discount = getPrice() * 0.3;
        }else if(!getUser().isTwoYearsOfDrivingCar()){
            discount = getPrice() * 0.1;
        }
        return Math.min(discount, getPrice());
    }

}
