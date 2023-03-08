public class Engine {
    private FuelType fuel; // I think I'm using this wrong
    private double currentlevel;
    private double maxlevel;
    /**
     * engine contstructor
     * @param fuel
     * @param maxlevel
     */
    public Engine(FuelType fuel, double maxlevel){
        this.fuel=fuel;
        this.currentlevel=maxlevel;
        this.maxlevel=maxlevel;
    }
    /**
     * fuel type accessor 
     * @return fuel type
     */
    public FuelType getFuelType(){
        return this.fuel;
    }
    /**
     * gets current level of fuel
     * @return curent level of fuel int 
     */
    public double getCurrentFuel(){
        return this.currentlevel;
    }
   /**
    * gets max level of fuel 
    * @return max level of fuel int
    */
    public double getMaxLevel(){
        return this.maxlevel;
    }
    /**
     * restores current fuel level to the max level
     */
    public void refuel(){
        this.currentlevel=this.maxlevel;
    }
    /**
     * reduces amount of fuel by 10 
     */
    public void go(){
        if (this.currentlevel<10){
            throw new RuntimeException("Your level of gas is too low");
        }
        this.currentlevel=this.currentlevel - 10;
        System.out.println("You have gone!");
    }

   public static void main(String[] args) {
       Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
       try {
           while (true) {
               myEngine.go();
           }
       } catch (Exception e) {
           System.err.println(e.getMessage()); // Out of fuel
       }
   }
}   