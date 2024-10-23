import java.util.Scanner;
public class Driver {
    Vehicle car;
    Vehicle bus;
    Vehicle eBike;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Vehicle App V1.0");
        new Driver();
    } // End of Main
    public Driver() {
        car = new Vehicle(5,40000,"PLUS","BYD",4);
        car.display();
        bus = new Vehicle(20,140000,"GTX","FORD",8);
        bus.display();
        eBike = new Vehicle(2,5000,"PRO","VW",2);
        eBike.display();
        checkBestVehicle();
    } // End of Driver Constructor
    public void checkBestVehicle(){
        System.out.print("Enter Number of Passengers : ");
        int numPassenger = input.nextInt();
        System.out.print("Passengers Entered : " + numPassenger);
        if(numPassenger>= 1 && numPassenger<=2)
            System.out.print("EBike is best" +" "+eBike.getPassengers());
        else if(numPassenger>= 3 && numPassenger<=5)
            System.out.print("Car is best"+" "+car.getPassengers());
        else if(numPassenger>= 6&& numPassenger<=20)
            System.out.print("Bus is best"+" "+bus.getPassengers());
        else System.out.print("sorry,no vehicle is available");
    }
} // End of Driver Class

