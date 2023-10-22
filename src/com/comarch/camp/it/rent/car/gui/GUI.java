package com.comarch.camp.it.rent.car.gui;

import com.comarch.camp.it.rent.car.model.Car;

import java.util.Scanner;

public class GUI {
    Scanner scanner = new Scanner(System.in);

    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        return this.scanner.nextLine();
    }

    public void printCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(car.transformToString());
        }
    }

    public String readPlate() {
        System.out.println("Enter plate:");
        return this.scanner.nextLine();
    }

    public void showResult(boolean rentResult) {
        if(rentResult) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }

    public void showWrongChoose() {
        System.out.println("Wrong choose !!");
    }
}
