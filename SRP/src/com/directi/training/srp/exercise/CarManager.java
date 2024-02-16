package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager {
    private CarDb _carDatabase;
    private CarFormatter _carFormatter;

    public CarManager(CarDb carDatabase, CarFormatter carFormatter) {
        _carDatabase = carDatabase;
        _carFormatter = carFormatter;
    }

    public List<Car> getAllCars() {
        return _carDatabase.getAllCars();
    }

    public String getCarsNames() {
        List<Car> allCars = _carDatabase.getAllCars();
        return _carFormatter.getCarsNames(allCars);
    }
}
