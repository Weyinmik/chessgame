
public class PawnTest extends junit.framework.TestCase {
    public void testCreate() {
        Pawn pawn = new Pawn("white");
        String pawn1Color = pawn.getPawnColor();
        assertEquals("white", pawn1Color);



    }
}
