import java.util.ArrayList;
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxcapacity; 
    /**
     * creates a train car
     * @param maxpeople
     */
    public Car(int maxpeople){
        this.maxcapacity=maxpeople;
        this.passengers = new ArrayList<Passenger>();

    }
    /**
     * gets the capacity of the car
     * @return
     */
    public int getCapacity(){
        return this.maxcapacity;
    }
    /**
     * gets the remaining number of seats
     * @return remaining seats int 
     */
    public int seatsRemaining(){
        return this.maxcapacity - this.passengers.size();
    }
    /**
     * padds a passenger to the car
     * @param p
     */
    public void addPassenger(Passenger p){
        if(this.passengers.contains(p)){ //already on train
            throw new RuntimeException(p +"is already a passenger.");
        }
        if(this.passengers.size()>= this.maxcapacity){ //already on train
            throw new RuntimeException("train is at capacity");
        }
        this.passengers.add(p);
        System.out.println(p+ "was succefully added");
    }
    /**
     * removes a passenger from the car 
     * @param p
     */
    public void removePassenger(Passenger p){
        if(!this.passengers.contains(p)){ //already on train
            throw new RuntimeException(p +"is not on the train");
        }
        this.passengers.remove(p);
        System.out.println(p+ "was succefully removed");
    }
    /**
     * prints all the passengers on the car 
     */
    public void printManifest(){
        if(this.passengers.size()>0){
            for (int i = 0; i < this.passengers.size(); i++){
                System.out.println(this.passengers.get(i));
            }
        }
        else{
            System.out.println("The car is empty");
        }
    }
}