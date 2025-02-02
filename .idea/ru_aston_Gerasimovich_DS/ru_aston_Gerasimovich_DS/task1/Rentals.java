package ru_aston_Gerasimovich_DS.task1;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Rentals {
    private final List<Rental> services;

    public Rentals() {
        this.services = initializeDemoServices();
    }


    private List<Rental> initializeDemoServices() {
        List<User> users = List.of(
                new User(63, "Ivan", "Pupov",false, true),
                new User(50, "Aleksandr", "Gulaev", false,true),
                new User(21,"Danil","Sidorovich", true,false),
                new User(23,"Dima","Gerasimovich", true,false),
                new User(21,"Danil","Gulaev", false,false)
        );
        return List.of(
                new Car1(2000, users.get(0),true),
                new Car1(2000, users.get(1), true),
                new Car1(2000, users.get(2), false),
                new Car2(1000, users.get(3), false),
                new Car2(1000, users.get(4), false)
        );
    }
    public double calculateTotalRevenue() {
        return services.stream()
                .mapToDouble(Rental::getDiscountPrice)
                .sum();
    }


    public String generateServicesReport() {
        return services.stream()
                .sorted(Comparator.comparing(s -> s.getUser().getSurname()))
                .map(Rental::toString)
                .collect(Collectors.joining("\n"));
    }
    @Override
    public String toString() {
        return String.format("%s%n%nОбщая выручка: %.2f рублей",
                generateServicesReport(),
                calculateTotalRevenue());
    }
}
