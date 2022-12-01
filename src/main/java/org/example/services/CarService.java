package org.example.services;

import org.example.models.Car;

public interface CarService {
    /**
     * This method gets the car object as an argument and adds it to a cars list
     * @param car
     */
    void saveCar(Car car);

    void showCars();

}
