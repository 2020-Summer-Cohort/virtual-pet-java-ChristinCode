package virtual_pet;

// hunger is attribute. feed is method
//void tick is the Method
public class VirtualPet {
    //Add Variable-this is the pet name we can assign name later or pet is hunger assign feed in thee update method
    private String petName;
    private String species;
    private int hunger;
    private int boredom;
    private int tired;
    private int tickCount;

    //Get-methods first bc they are easier and cleaner.
    public String getPetName(){
       return petName;
    }
    public String getSpecies(){
        return species;
    }
    public int getHunger(){
        return hunger;
    }
    public int getBoredom(){
        return boredom;
    }
    public int getTired(){
        return tired;
    }
    public int getTickCount(){
        return tickCount;
    }

    //Update Methods 1
    public void tick() {
        /*Tick is counting the number of time the user is interacting
         * Tick is tracking the number of times the user interacts with game loop
         * needs to be the if else */

    }
    public void updateHungry() {
    }

    public void updateBoredom() {
    }
    public void updateTiredness() {
    }
    //Constructor

}

