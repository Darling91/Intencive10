package ru_aston_Gerasimovich_DS.task1;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.List.*;

public class Rentals implements RentalsInter {
    private final List<Rental> services;

    public Rentals() {
        this.services = initializeDemoServices();
    }

    private Rental initializeDemoServices() {
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
    public String getEstimate() {
        return String.format("%s%n%nОбщая выручка: %.2f рублей",
                generateServicesReport(),
                calculateTotalRevenue());
    }
}
