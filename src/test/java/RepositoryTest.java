import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository1;
    Commit commit1;
    Commit commit2;
    Commit commit3;
    Commit commit4;

    @Before

    public void before() {
        repository1 = new Repository();
        commit1 = new Commit("Set up test files", 1);
        commit2 = new Commit("Create classes", 2);
        commit3 = new Commit ("Create getters", 3);
        commit4 = new Commit ("Create setters", 4);
        repository1.addCommit(commit1);
        repository1.addCommit(commit2);
        repository1.addCommit(commit3);
        repository1.addCommit(commit4);
    }

    @Test
    public void canAddCommitToRepository() {
        assertEquals(4, repository1.getCommitsArrayLength());
    }

    @Test
    public void getCommitFromCommitsArrayByIndex() {
        assertEquals(commit1, repository1.getCommitFromCommitsArrayByIndex(commit1));
    }

}
