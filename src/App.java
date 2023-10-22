public class App {
    public static void main(String[] args) {
        CarRepository baza = new CarRepository();
        GUI gui = new GUI();
        boolean run = true;
        while(run) {
            switch(gui.showMenuAndReadChoose()) {
                case "1":
                    gui.printCars(baza.cars);
                    break;
                case "2":
                    gui.showRentResult(baza.rentCar(gui.readPlate()));
                    break;
                case "3":
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
