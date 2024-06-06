import org.junit.Assert;
import org.junit.Test;
import org.swiggy.ArenaPlayGround;
import org.swiggy.Dice;
import org.swiggy.Player;
import static org.junit.Assert.*;

public class ArenaPlayGroundTest {

    @Test
    public void testBattle() {
        // Create two players
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);

        // Create a dice
        Dice dice = new Dice();

        // Create the arena playground
        ArenaPlayGround arena = new ArenaPlayGround(player1, player2, dice);

        // Before the battle, both players should be alive
        assertTrue(player1.isAlive());
        assertTrue(player2.isAlive());

        // Start the battle
        arena.startBattle();

        // After the battle, one player should be dead
        assertFalse(player1.isAlive() && player2.isAlive());
    }

}
