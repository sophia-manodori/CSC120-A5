import java.util.ArrayList;
public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * train creator
     * @param fueltype
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fueltype, double fuelCapacity, int nCars, int passengerCapacity){//not sure what to do to initialize
        this.engine=new Engine(fueltype, fuelCapacity);
        this.cars= new ArrayList<Car>();
        for(int i =0; i<nCars; i++){
            new Car(passengerCapacity);
        }
    }
    /**
     * engine accessor 
     * @return
     */
    public Engine getEngine(){
        return this.engine;
    }
    /**
     * Car accessor
     */
    public Car getCar(int i){
        return this.cars.get(i); 
    }
    public int getMaxCapacity(){
        int maxcap=0;
        for (int i = 0; i < this.cars.size(); i++){
            Car car = this.cars.get(i);
            int capacity= car.getCapacity();
            maxcap= maxcap + capacity;
        }
        return maxcap;
    }
    /**
     * accessor for remaining seats
     * @return remaining seats
     */
    public int seatsRemaining(){
        int seats=0;
        for (int i = 0; i < this.cars.size(); i++){
            Car car = this.getCar(i);
            int remaining= car.seatsRemaining();
            seats= seats + remaining;
        }
        return seats;
    }
    /**
     * prints every passenger on every car
     */
    public void printManifest(){
        for (int i = 0; i < this.cars.size(); i++){
            Car car = this.getCar(i);
            System.out.println("Car number"+i);
            car.printManifest();
        }
    }
    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 100.00, 10, 20);
        Car testcar = train.getCar(3);
        System.out.println(testcar);
    }
}
