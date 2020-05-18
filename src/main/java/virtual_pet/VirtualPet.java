package virtual_pet;

import java.sql.SQLOutput;
import java.util.Random;

public class VirtualPet {
    private String petName;
    private String species;
    private int hunger;
    private int boredom;
    private int tiredness;
    private int tickCount;

    public VirtualPet(String animalName, String animalSpecies) {
        Random generateNumber = new Random();
        int numberGenerated;

        this.petName = animalName;
        this.species = animalSpecies;

        numberGenerated = generateNumber.nextInt(11);
        this.hunger = numberGenerated;
        numberGenerated = generateNumber.nextInt(11);
        this.boredom = numberGenerated;
        numberGenerated = generateNumber.nextInt(11);
        this.tiredness = numberGenerated;
    }

    public String defineSelection(int selection) {
        if (selection == 1) {
            feed(6);
            System.out.println("I love salmon!");
            return "eat";
        } else if (selection == 2) {
            play(5);
            System.out.println("What fun! Thanks for playing with me. Now I am tired.");
            return "play";
        } else if (selection == 3) {
            sleep(7);
            System.out.println("I just had the best cat nap, EVER.");
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

    public void tick() {
        Random selfDetermination = new Random();
        int randomMood;
        tickCount++;

        randomMood = selfDetermination.nextInt(11);
        if (randomMood == 1) {
            feed(5);
            System.out.println("I just ate a mouse. Yummy!");
        } else if (randomMood >= 8) {
            sleep(7);
            System.out.println("Ugh... Why did you wake me?");
        } else if (randomMood >= 3 && randomMood <= 5) {
            play(3);
            System.out.println("I was playing.");
        }
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

}


