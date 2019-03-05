
public class PawnTest extends junit.framework.TestCase {
    public void testCreate() {
        Pawn firstPawn = new Pawn("white");
        String firstPawnColor = firstPawn.getPawnColor();
        assertEquals("white", firstPawnColor);

        Pawn secondPawn = new Pawn("black");
        String secondPawnColor = secondPawn.getPawnColor();
        assertEquals("black", secondPawnColor);








    }
}
