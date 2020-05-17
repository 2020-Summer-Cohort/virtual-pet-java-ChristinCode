package virtual_pet;

import java.util.Random;

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
    public String defineSelection(int selection) {
        if (selection == 1) {
            feed(6);
            return "eat";
        } else if (selection == 2) {
            play(5);
            return "play";
        } else if (selection == 3) {
            sleep(7);
            return "sleep";
        }
        return "";
    }

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

    //Update Methods
    //are what happens to the values as user interacts ie hunger becomes
    // do not need name or species bc they will be assigned and user does not get to name
    //if I want user to name, I would create a public void updateName || public void updateSpecie
    private void feed(int fed) {
        if (hunger - fed >= 0) {
            hunger = hunger - fed;
        } else {
            hunger = 0;
        }
        if (boredom + 2 <= 10) {
            boredom = boredom + 2;
        } else {
            boredom = 10;
        }
    }

    private void play(int activity) {
        if (boredom - activity >= 0) {
            boredom = boredom - activity;
        } else {
            boredom = 0;
        }
        if (tiredness + 3 <= 10) {
            tiredness = tiredness + 3;
        } else {
            tiredness = 10;
        }
    }

    private void sleep(int nap) {
        if (tiredness - nap >= 0) {
            tiredness = tiredness - nap;
        } else {
            tiredness = 0;
        }
        if (hunger + 2 <= 10) {
            hunger = hunger + 2;
        } else {
            hunger = 10;
        }
    }

    public void tick() { /*Tick is counting the number of time the user is interacting
     * Tick is tracking the number of times the user interacts with game loop
     * needs to be the if else */
        tickCount++;

        if (hunger + 1 <= 10) {
            hunger = hunger + 1;
        } else {
            hunger = 10;
        }
        if (boredom + 1 <= 10) {
            boredom = boredom + 1;
        } else {
            boredom = 10;
        }
        if (tiredness + 2 <= 10) {
            tiredness = tiredness + 2;
        } else {
            tiredness = 10;
        }
    }

    //Constructor
    //this is the Dam Examples
    public VirtualPet(String animalName, String animalSpecies) {
        Random generateNumber = new Random();/*declaration-declaring random object*/
        int numberGenerated;/*declaration-declaring random object*/

        this.petName = animalName; /*from here below, I am initializing the variables*/
        this.species = animalSpecies;

        numberGenerated = generateNumber.nextInt(10);
        this.hunger = numberGenerated;
        numberGenerated = generateNumber.nextInt(10);
        this.boredom = numberGenerated;
        numberGenerated = generateNumber.nextInt(10);
        this.tiredness = numberGenerated;
    }
}


