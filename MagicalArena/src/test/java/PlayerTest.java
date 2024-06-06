import org.junit.Test;
import org.swiggy.Player;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerCreation(){
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertTrue(player.isAlive());
    }

    @Test
    public void testPlayerDies(){
        Player player = new Player(50,9,15);
        player.reduceHealth(50);
        assertFalse(player.isAlive());
        assertEquals(0,player.getHealth());
    }
}
