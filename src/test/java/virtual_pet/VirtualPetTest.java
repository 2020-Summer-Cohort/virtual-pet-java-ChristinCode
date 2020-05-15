package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void secondVirtualPetClass() {VirtualPetApplication test = new VirtualPetApplication();
    }

    @Test
    public void VirtualPetApplication() {
        VirtualPetApplication Test = new VirtualPetApplication();
        String answer = Test.say();
        assertEquals("Feed Salem", answer);
    }
}
