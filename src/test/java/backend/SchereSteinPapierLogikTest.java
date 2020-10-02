package backend;

import org.junit.Assert;
import org.junit.Test;

public class SchereSteinPapierLogikTest {

    SchereSteinPapierLogik SchereSteinPapierLogik = new SchereSteinPapierLogik();

    @Test
    public void SchereSteinPapierLogik__DrawWithEqualAnswers() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Stein", "Stein");
        String expected = "Unentschieden";
        Assert.assertEquals(expected, actual);
    }

    // Player 1 wins
    @Test
    public void SchereSteinPapierLogik__Player1RockWinsAgainstPaper() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Schere", "Papier");
        String expected = "Player 1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SchereSteinPapierLogik__Player1StoneWinsAgainstScissors() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Stein", "Schere");
        String expected = "Player 1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SchereSteinPapierLogik__Player1PaperWinsAgainstStone() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Papier", "Stein");
        String expected = "Player 1";
        Assert.assertEquals(expected, actual);
    }

    // Player 2 wins
    @Test
    public void SchereSteinPapierLogik__Player2RockWinsAgainstPaper() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Papier", "Stein");
        String expected = "Player 1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SchereSteinPapierLogik__Player2StoneWinsAgainstScissors() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Schere", "Stein");
        String expected = "Player 2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SchereSteinPapierLogik__Player2PaperWinsAgainstStone() {
        String actual = SchereSteinPapierLogik.schereSteinPapier("Stein", "Papier");
        String expected = "Player 2";
        Assert.assertEquals(expected, actual);
    }
}
