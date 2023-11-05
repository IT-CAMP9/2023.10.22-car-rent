package com.comarch.camp.it.rent.car.db;

import com.comarch.camp.it.rent.car.authenticate.Authenticator;
import com.comarch.camp.it.rent.car.model.*;

public class VehicleRepository {
    private final Vehicle[] vehicles = new Vehicle[12];

    public VehicleRepository() {
        this.vehicles[0] = new Car("BMW", "5", 2020, 399.99, "KR11");
        this.vehicles[1] = new Car("Audi", "A6", 2021, 499.99, "KR22");
        this.vehicles[2] = new Car("Toyota", "Corolla", 2019, 299.99, "KR33");
        this.vehicles[3] = new Car("Honda", "Civic", 2020, 299.99, "KR44");
        this.vehicles[4] = new Car("Kia", "Ceed", 2015, 199.99, "KR55");
        this.vehicles[5] =
                new Bus("Solaris", "S1000", 2020, 800.00, "KR66", 50);
        this.vehicles[6] =
                new Bus("Mercedes", "Turbo", 2020, 900.00, "KR77", 55);
        this.vehicles[7] =
                new Bus("Solaris", "Super", 2020, 850.00, "KR88", 52);
        this.vehicles[8] =
                new Truck("Scania", "Wielka", 2010, 500.00, "KR99", 4000);
        this.vehicles[9] =
                new Motorcycle("Honda", "CVS", 2015, 400.00, "KR10", true);
        this.vehicles[10] =
                new LuxuryCar("Bentley", "Continentral", 2022, 5000.00, "BENTLEY");
        this.vehicles[11] =
                new LuxuryCar("Ferrari", "Italia", 2020, 6000.00, "FERRARI");
    }

    public boolean rentVehicle(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if(vehicle instanceof LuxuryCar &&
                !"ADMIN".equals(Authenticator.loggedUserRole)) {
            return false;
        }
        if(vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }
    public boolean returnVehicle(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if(vehicle instanceof LuxuryCar &&
                !"ADMIN".equals(Authenticator.loggedUserRole)) {
            return false;
        }
        if(vehicle != null && vehicle.isRent()) {
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    private Vehicle findVehicle(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate)) {
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
