
public class PawnTest extends junit.framework.TestCase {
    public void testCreate() {
        final String firstPawnColor = "white";
        Pawn firstPawn = new Pawn(firstPawnColor);
        assertEquals(firstPawnColor, firstPawn.getPawnColor());

        final String secondPawnColor = "black";
        Pawn secondPawn = new Pawn(secondPawnColor);
        assertEquals(secondPawnColor, secondPawn.getPawnColor());








    }
}
