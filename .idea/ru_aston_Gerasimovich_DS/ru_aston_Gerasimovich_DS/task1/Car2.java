package ru_aston_Gerasimovich_DS.task1;

public class Car2 extends Rental {
    public Car2(double price, User user, boolean expiriencedDriver) {

        super(price, user, expiriencedDriver);
    }

    @Override
    public double calculateDiscount() {
        double discount = super.calculateDiscount();

        if(!get().isTwentyYearsOfDrivingCar()){
            discount = discount * 0.5;
        }else if(!getUser().isTwoYearsOfDrivingCar()){
            discount = discount * 0.3;
        }
        return Math.min(discount, getPrice());
    }

}
