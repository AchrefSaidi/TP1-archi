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
        return _carDatabase.getCars();
    }

    public String getCarsNames() {
        List<Car> allCars = _carDatabase.getCars();
        return _carFormatter.getCarNames(allCars);
    }
}
