package org.example.services;

import org.example.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    public static List<Car> cars = new ArrayList<Car>();

    @Override
    public void saveCar(Car car) {
        cars.add(car);
    }

    @Override
    public void showCars() {
        for(Car car : cars) {
            System.out.println(car.getName());
            System.out.println(car.getModel());
        }
    }

}
