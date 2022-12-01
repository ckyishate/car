package org.example.views;

import org.example.models.Car;
import org.example.services.CarService;
import org.example.services.CarServiceImpl;

public class Main {

    public static void saveCars(Car car, CarService carService) {
        carService.saveCar(car);
    }

    public static void showCars(CarService carService) {
        carService.showCars();
    }

    public static void main(String[] args) {
        System.out.println("Hello, welcome to car world");
        String name = "Toyota";
        String model = "2022";
        // create car object to add car data
        Car car = new Car();
        car.setName(name);
        car.setModel(model);

        // create carservice object which will be used to access the save method
        CarService carService = new CarServiceImpl();

        // save the cars
        saveCars(car, carService);

        // show the saved cars
        showCars(carService);
    }

}