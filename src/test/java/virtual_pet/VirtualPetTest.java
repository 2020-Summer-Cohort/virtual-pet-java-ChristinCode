package virtual_pet;
/* Stretch Goal
 *Build out unit tests in the VirtualPetTest class to test the behaviors placed in VirtualPet
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void secondVirtualPetClass() {
        VirtualPetApplication test = new VirtualPetApplication();
    }

    @Test
    public void testOne() {
        VirtualPet Test = new VirtualPet();
        String answer = Test.getHunger(1);
        assertEquals("Feed Salem", answer);
    }
}
