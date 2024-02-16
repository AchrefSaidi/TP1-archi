package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager {
    private CarDatabase _carDatabase;
    private CarFormatter _carFormatter;

    public CarManager(CarDatabase carDatabase, CarFormatter carFormatter) {
        _carDatabase = carDatabase;
        _carFormatter = carFormatter;
    }

    public List<Car> getAllCars() {
        return _carDatabase.getAllCars();
    }

    public String getCarsNames() {
        List<Car> allCars = _carDatabase.getAllCars();
        return _carFormatter.formatCarNames(allCars);
    }
}
