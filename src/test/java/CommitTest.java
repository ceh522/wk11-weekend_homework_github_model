import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit1;

    @Before
    public void before() {
        commit1 = new Commit("Set up test files", 1);
    }

    @Test
    public void hasDescription() {
        assertEquals("Set up test files", commit1.getDescription());
    }

    @Test
    public void hasUniqueID() {
        assertEquals(1, commit1.getUniqueID());
    }
}
