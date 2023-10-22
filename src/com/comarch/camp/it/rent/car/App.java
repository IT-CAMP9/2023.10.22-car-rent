package com.comarch.camp.it.rent.car;

import com.comarch.camp.it.rent.car.db.CarRepository;
import com.comarch.camp.it.rent.car.gui.GUI;

public class App {
    public static void main(String[] args) {
        CarRepository baza = new CarRepository();
        GUI gui = new GUI();
        boolean run = true;
        while(run) {
            switch(gui.showMenuAndReadChoose()) {
                case "1":
                    gui.printCars(baza.getCars());
                    break;
                case "2":
                    gui.showResult(baza.rentCar(gui.readPlate()));
                    break;
                case "3":
                    gui.showResult(baza.returnCar(gui.readPlate()));
                    break;
                case "4":
                    //System.exit(0);
                    run = false;
                    break;
                default:
                    gui.showWrongChoose();
                    break;
            }
        }
    }
}
