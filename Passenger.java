public class Passenger {
    
    private String name;
    /**
     * creates a passenger with a name
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }
    /**
     * adds a given passenger to the car
     * @param c
     */
    public void boardCar(Car c){
        try{c.addPassenger(this);
        }catch(Exception e){//how do I get the message?
        System.err.println(e.getMessage()); 
        }
    }
    /**
     * removes the given passenger from the car
     * @param c
     */
    public void getOffCar(Car c){
        try{c.removePassenger(this);
        }catch(Exception e){
            System.err.println(e.getMessage()); 
        } 
    }
}
