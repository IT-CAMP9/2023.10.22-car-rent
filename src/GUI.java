import java.util.Scanner;

public class GUI {
    Scanner scanner = new Scanner(System.in);

    String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return this.scanner.nextLine();
    }

    void printCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(car.transformToString());
        }
    }

    String readPlate() {
        System.out.println("Enter plate:");
        return this.scanner.nextLine();
    }

    void showRentResult(boolean rentResult) {
        if(rentResult) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }

    void showWrongChoose() {
        System.out.println("Wrong choose !!");
    }
}
