package com.comarch.camp.it.rent.car.db;

import com.comarch.camp.it.rent.car.model.Car;

public class CarRepository {
    private Car[] cars = new Car[5];

    public CarRepository() {
        this.cars[0] = new Car("BMW", "5", 2020, 399.99, "KR11");
        this.cars[1] = new Car("Audi", "A6", 2021, 499.99, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 2019, 299.99, "KR33");
        this.cars[3] = new Car("Honda", "Civic", 2020, 299.99, "KR44");
        this.cars[4] = new Car("Kia", "Ceed", 2015, 199.99, "KR55");
    }

    public boolean rentCar(String plate) {
        Car car = findCar(plate);
        if(car != null && !car.isRent()) {
            car.setRent(true);
            return true;
        }
        return false;
    }
    public boolean returnCar(String plate) {
        Car car = findCar(plate);
        if(car != null && car.isRent()) {
            car.setRent(false);
            return true;
        }
        return false;
    }

    private Car findCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                return car;
            }
        }
        return null;
    }

    public Car[] getCars() {
        return cars;
    }
}
