package virtual_pet;

//This whole page is about the users interactions with the game. Think of this class as a storage area: ie library for my package
// hunger is attribute. feed is method
//void tick is the Method
public class VirtualPet {
    //Add Variable-this is the pet name we can assign name later or pet is hunger assign feed in thee update method
    private String petName;
    private String species;
    private int hunger;
    private int boredom;
    private int tiredness;
    private int tickCount;

    //Get-methods first bc they are easier and cleaner.
    public String getPetName() {
        return petName;
    }

    public String getSpecies() {
        return species;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getTiredness() {
        return tiredness;
    }

    public int getTickCount() {
        return tickCount;
    }

    //Update Methods are what happens to the values as user interacts ie hunger becomes
    // do not need name or species bc they will be assigned and user does not get to name
    //if I want user to name, I would create a public void updateName || public void updateSpecies

    public void feed() {
    }

    public void Play() {
    }

    public void Sleep() {
    }

    public void tick() { /*Tick is counting the number of time the user is interacting
     * Tick is tracking the number of times the user interacts with game loop
     * needs to be the if else */
        tickCount++;
    }

    //Constructor
    //this is the Dam Examples
    public VirtualPet(String animalName, String animalSpecies, int initialHunger,
                      int initialBoredom, int initialTiredness) {


        this.petName = animalName;
        this.species = animalSpecies;
        this.hunger = initialHunger;
        this.boredom = initialBoredom;
        this.tiredness = initialTiredness;
    }

}


