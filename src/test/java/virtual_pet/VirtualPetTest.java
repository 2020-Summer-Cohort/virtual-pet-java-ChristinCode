package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void testDefineSelection1() {
        VirtualPet Test = new VirtualPet("", "");
        String answer = Test.defineSelection(1);
        assertEquals("eat", answer);
    }

    @Test
    public void testDefineSelection2() {
        VirtualPet Test = new VirtualPet("", "");
        String answer = Test.defineSelection(2);
        assertEquals("play", answer);
    }

    @Test
    public void testDefineSelection3() {
        VirtualPet Test = new VirtualPet("", "");
        String answer = Test.defineSelection(3);
        assertEquals("sleep", answer);
    }
}